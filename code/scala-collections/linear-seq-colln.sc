
import java.util.Optional

import scala.collection.SortedMap

val list1 = List(1, 2, 3, 4, 5)
val list2 = list1 :+ 6
list1.filter(_ % 2 == 0)


//val dll = new util.LinkedList


val set = Set(1, 2, 3, 1)

val s = collection.mutable.Set(1, 2, 3)


val map = Map(("nag", "fortuner"), ("ria", "toy-car"))
// or
val map2 = SortedMap("ria" -> "toy-car", "nag" -> "fortuner")





var tuple = (12, 12.00, "string", true)
tuple._1
tuple._2
tuple._3


def getSomething = {
  if (true) {
    Some("something")
  } else {
    None
  }
}

val result: Option[String] = getSomething
if (result.isEmpty) println("oops")
else println(result.get)


result match {
  case Some(value) => println("im happy with" + result)
  case None => println("i hate you")
}

