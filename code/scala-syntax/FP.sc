


val f1: (Int, Int) => Int = (x: Int, y: Int) => x + y
val f2 = (x: Int, y: Int) => x + y



def createAdder(num:Int)=(input:Int)=>input+num
val adderWith10=createAdder(10)
println(adderWith10(10))
println(adderWith10(20))
