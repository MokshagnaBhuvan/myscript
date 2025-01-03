firstTwoElements :: [a] -> [a]
firstTwoElements [] = []
firstTwoElements [x] = [x]
firstTwoElements (x:y:_) = [x, y]

main :: IO ()
main = do
    let examples = [[1, 2, 3], [5, 6], [], [7]]
    mapM_ (print . firstTwoElements) examples
