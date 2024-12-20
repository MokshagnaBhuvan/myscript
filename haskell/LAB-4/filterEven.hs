
#filtering even from the list

filterEven :: [Int] -> [Int]
filterEven xs = filter (\x -> x `mod` 2 == 0) xs

main :: IO ()
main = do
    let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]