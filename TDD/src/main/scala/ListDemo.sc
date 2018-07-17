val list=1 ::2::3::Nil
val ist2=List(1,2,3)

/*
---------------------------
*/
val listRange=List.range(1,10)
val listRangeWithSte=List.range(0,40,5)

/*----------------------*/


 val list10 = List.range(1, 10)
list10.map(_ * 3)

//val even=list10.filter(a=>(a%2==0)&&(a>4))
//println(even)
//Parrtion make two True one and False one
val even=list10.partition(a=>(a%2==0)&&(a>4))
println(even)


/*

*/


val listOfList=List(List(1,2),List(3,4),List(5,6),List(7,8))
println(listOfList)
//listOfList.map(_ List()*3)
listOfList.flatMap(_.map(_+1))


