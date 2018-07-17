
val set=Set(1,2,3,4)
var result=set+5
println(set)
println(result)


val res=result-3
println(result)
println(res)

res++List(3,4,5,6,7,8)
println(res)


val listDem0=List(1 to 1000000)
println(listDem0)
//listDem0.foreach(elem=>println(elem))
listDem0.foreach(println)