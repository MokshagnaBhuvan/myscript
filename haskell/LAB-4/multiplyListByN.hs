#multiply list by multiplier n
multiplyList :: Num a => a -> [a] -> [a]
multiplyList n xs = map (*n) xs

main :: IO ()
main = do
    let list = [1, 2, 3, 4, 5]
    let multiplier = 2
    print "List after multiplied with n=2"
    print (multiplyList multiplier list)