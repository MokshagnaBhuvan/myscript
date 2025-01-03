describePair :: (Int, Int) -> String
describePair (0, 0) = "Origin"
describePair (0, _) = "X-Axis"
describePair (_, 0) = "Y-Axis"
describePair (_, _) = "Other"

main :: IO ()
main = do
    putStrLn "Please enter a pair of integers (e.g., (0, 0)):"
    input <- getLine
    let pair = read input :: (Int, Int)
    putStrLn (describePair pair)
