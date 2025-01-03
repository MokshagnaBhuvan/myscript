check_zero :: Integer -> String
check_zero 0 = "Zero"
check_zero _ = "Not zero"

main :: IO ()
main = do
    let examples = [0, 5, -3, 10]
    mapM_ (putStrLn . check_zero) examples
