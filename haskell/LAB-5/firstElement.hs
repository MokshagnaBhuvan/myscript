firstElement :: Show a => [a] -> String
firstElement [] = "Empty list"
firstElement (x : _) = "First element is " ++ show x

main :: IO ()
main = do
    let examples = [[1, 2, 3], [5, 6, 7], [], [9]]
    mapM_ (putStrLn . firstElement) examples
