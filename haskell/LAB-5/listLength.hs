listLength :: [a] -> Int
listLength [] = 0
listLength (_:xs) = 1 + listLength xs

main :: IO ()
main = do
    putStrLn "Please enter a list of integers (e.g., [1, 2, 3]):"
    input <- getLine
    let list = read input :: [Int]
    print (listLength list)
