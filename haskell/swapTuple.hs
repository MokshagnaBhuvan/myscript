#swaping elements in tuple
swapTuple :: (a, b) -> (b, a)
swapTuple (a, b) = (b, a)

main = print (swapTuple (1, 2))
