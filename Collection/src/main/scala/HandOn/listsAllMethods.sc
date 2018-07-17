
//----------------------------CREATING LISTS -------------------------------
val list = 1 :: 2 :: Nil

val list2 = List(1, 2, 3)

val list3 = List[Number](1, 2.0, 33d)



//----------------------------LIST METHODS -------------------------------

val listRange = List.range(1, 10)

val listRangeWithSteps = List.range(0, 10, 2)

val listWithFill = List.fill(5)("foo-baa")

val list4 = List(1, 2, 3)

val list5 = 0 :: list4


//---------------------------- MERGING LISTS -----------------------------

/*
Operation has O(n) where n is is length of first list
 */
val newList = list4 ::: list5

/*

 */
val newConcatenatedList = List.concat(list2, list5)


val list6 = List(1, 2, 3, 4)
list6.drop(2)
list6.take(3)
list6.takeRight(2)
list6.splitAt(2)


val alpha = List()



val list20=List.range(9,18)

