import Data.List (find)

-- Define Product Type (Product Name, Model, Price)
type Product = (String, String, Int)  

-- Define Cart Type (Product Name, Quantity)
type Cart = [(String, Int)]    

-- Define Past Orders
type OrderHistory = [Cart]

-- Sample product catalog
productCatalog :: [Product]
productCatalog = [("Laptop", "Dell XPS 13", 1000), 
                  ("Mouse", "Logitech MX", 25), 
                  ("Keyboard", "Mechanical RGB", 50), 
                  ("Headphones", "Sony WH-1000XM4", 80), 
                  ("Phone", "iPhone 14", 600)]

-- Function to add an item to the cart
addItem :: String -> Cart -> Cart
addItem item [] = [(item, 1)]
addItem item ((name, qty):rest)
    | item == name = (name, qty + 1) : rest  -- Increase quantity if item exists
    | otherwise = (name, qty) : addItem item rest

-- Function to remove an item from the cart
removeItem :: String -> Cart -> Cart
removeItem _ [] = []
removeItem item ((name, qty):rest)
    | item == name && qty > 1 = (name, qty - 1) : rest  -- Decrease quantity
    | item == name = rest  -- Remove if quantity is 1
    | otherwise = (name, qty) : removeItem item rest

-- Function to view cart contents
viewCart :: Cart -> IO ()
viewCart [] = putStrLn "Your cart is empty."
viewCart cart = do
    putStrLn "Your Cart:"
    mapM_ (\(item, qty) -> putStrLn $ "- " ++ item ++ " x" ++ show qty) cart

-- Function to check if a product exists in the catalog
isProductAvailable :: String -> Bool
isProductAvailable item = case find (\(pName, _, _) -> pName == item) productCatalog of
    Just _  -> True
    Nothing -> False

-- Function to calculate total bill
calculateTotal :: Cart -> [Product] -> Int
calculateTotal cart catalog = sum [ price * qty | (item, qty) <- cart, (pName, _, price) <- catalog, item == pName]

-- Apply discounts based on cart value
applyDiscount :: Int -> Int
applyDiscount total
    | total > 500 = total - 50  -- $50 discount for orders above $500
    | total > 200 = total - 20  -- $20 discount for orders above $200
    | otherwise = total

-- Function to checkout, save past orders, and display final bill
checkout :: Cart -> [Product] -> OrderHistory -> IO OrderHistory
checkout cart catalog history = do
    let total = calculateTotal cart catalog
    let finalBill = applyDiscount total
    putStrLn $ "Total before discount: $" ++ show total
    putStrLn $ "Final Bill after discount: $" ++ show finalBill
    putStrLn "Order placed successfully!"
    return (cart : history)  -- Save cart as past order

-- Function to clear cart
clearCart :: Cart -> Cart
clearCart _ = []

-- Function to view past orders
viewPastOrders :: OrderHistory -> IO ()
viewPastOrders [] = putStrLn "No past orders."
viewPastOrders history = do
    putStrLn "Past Orders:"
    mapM_ (\(idx, order) -> do
        putStrLn $ "Order " ++ show idx ++ ":"
        viewCart order
        putStrLn "----------------") (zip [1..] history)

-- Shopping cart menu
shoppingCartSystem :: Cart -> OrderHistory -> IO ()
shoppingCartSystem cart history = do
    putStrLn "\n1. View Products\n2. Add Item\n3. Remove Item\n4. View Cart\n5. Checkout\n6. Clear Cart\n7. View Past Orders\n8. Exit"
    putStrLn "Enter your choice: "
    choice <- getLine
    case choice of
        "1" -> do
            putStrLn "\nAvailable Products:"
            mapM_ (\(name, model, price) -> putStrLn $ "- " ++ name ++ " (" ++ model ++ "): $" ++ show price) productCatalog
            shoppingCartSystem cart history

        "2" -> do
            putStrLn "Enter the product name to add: "
            item <- getLine
            if isProductAvailable item
                then shoppingCartSystem (addItem item cart) history
                else do
                    putStrLn "Product not found. Please try again."
                    shoppingCartSystem cart history

        "3" -> do
            putStrLn "Enter the product name to remove: "
            item <- getLine
            shoppingCartSystem (removeItem item cart) history

        "4" -> do
            viewCart cart
            shoppingCartSystem cart history

        "5" -> do
            newHistory <- checkout cart productCatalog history
            shoppingCartSystem [] newHistory  -- Reset cart after checkout

        "6" -> do
            putStrLn "Cart cleared."
            shoppingCartSystem (clearCart cart) history

        "7" -> do
            viewPastOrders history
            shoppingCartSystem cart history

        "8" -> putStrLn "Thank you for shopping!"

        _ -> do
            putStrLn "Invalid choice. Try again."
            shoppingCartSystem cart history

-- Start the shopping cart system
main :: IO ()
main = do
    putStrLn "Welcome to the Online Shopping Cart!"
    shoppingCartSystem [] []

