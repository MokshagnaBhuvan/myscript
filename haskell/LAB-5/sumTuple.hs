sumTuple :: (Int, Int) -> Int
sumTuple (x, y) = x + y

main :: IO ()
main = do
    let examples = [(3, 5), (10, 20), (7, 3), (15, 25)]
    mapM_ (print . sumTuple) examples
