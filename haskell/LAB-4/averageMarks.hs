averageMarks :: (String, Int, [Int]) -> Double
averageMarks (_, _, marks) = fromIntegral (sum marks) / fromIntegral (length marks)

main :: IO ()
main = do
    let students = [("pudota", 40102, [92, 84, 76]), ("Mokshagna", 41102, [87, 87, 80]), ("Bhuvan", 12367, [91, 88, 91])]
    let results = [ (name, roll, avg) | (name, roll, marks) <- students, let avg = averageMarks (name, roll, marks) ]
    mapM_ print results