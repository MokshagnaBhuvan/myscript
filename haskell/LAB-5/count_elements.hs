countElements :: [a] -> Int
countElements [] = 0
countElements (_:xs) = 1 + countElements xs

main :: IO ()
main = do
    let examples = [[1, 2, 3], [5, 6, 7, 8], [], [9]]
    mapM_ (print . countElements) examples
