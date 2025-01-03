import Text.Read (readMaybe)

data Color = Red | Green | Blue deriving Read

describeColor :: Color -> String
describeColor Red = "This is Red"
describeColor Green = "This is Green"
describeColor Blue = "This is Blue"

main :: IO ()
main = do
    let examples = ["Red", "Green", "Blue", "Yellow"]
    mapM_ (\input -> 
        let maybeColor = readMaybe input :: Maybe Color
        in case maybeColor of
            Just color -> putStrLn (describeColor color)
            Nothing    -> putStrLn "Invalid color. Please enter Red, Green, or Blue.") examples
