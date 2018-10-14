import scala.collection.mutable.ArrayBuffer

// Fixed Length Array  === java array
val arr = new Array[Int](10)
val arr2 = new Array[String](10)
val arr3 = Array("hello", "world")
arr3.apply(0)
arr3(0)

// variable-Length Array
val arr4 = ArrayBuffer[Int]()
arr4 += 1
arr4 += (2, 3, 4, 5)
arr4 ++= Array(6, 7, 8, 9, 10)
arr4.trimEnd(5)
arr4
arr4.insert(2, 0)
arr4
arr4.insert(2, 1, 2, 3, 4, 5)
arr4
arr4.remove(2, 6)
arr4
val arr5 = arr4.toArray
// Traversing Array & ArrayBuffer

for (i <- 0 until arr4.length) {
  println(i)
}

for (ele <- arr4) println(ele)


//  Transforming Array

val a = List(2, 3, 5, 7, 11)
// imperative style
var result1 = for (ele <- a) yield 2 * ele
// functional style
var result3 = a.map((ele: Int) => 2 * ele)
var result4 = a.map((ele) => 2 * ele)
var result5 = a.map(ele => 2 * ele)
var result6 = a.map(2 * _)


var result2 = for (ele <- a if ele % 2 == 0) yield 2 * ele
// or
var result7 = a.filter(_ % 2 == 0).map(2 * _)
var result8 = a filter {
  _ % 2 == 0
} map {
  2 * _
}

val sum = 1.+(2)
val x = 12;
val y = 13;
val sum2 = x + y

a.sum

a.max


val b = Array(3, 2, 5, 7, 11)
val c=b.sortWith(_>_)

b
c



println(b.mkString(" "))





//-----------------------------------------


val range1= 1 to 10
val range2= 1 until  10

range1(0)

val str="scala";
str(0)



val v=Vector(1,2,3,4,5,6)














