package com


/*

  Generic Type

    ==> type-safety instances


 */

trait Subject

class Java extends Subject

class Scala extends Subject


class Trainer[T <: Subject] {
  var subject: T = null.asInstanceOf[T]

  def setSubject(subject: T) = this.subject = subject

  def getSubject = subject
}


package ds {

  import scala.collection.immutable.List;

  class Stack[E] {

    private var elements: List[E] = Nil

    def push(x: E) {
      elements = x :: elements // add x into elements
    }

    def peek: E = elements.head

    def pop(): E = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }

  }

}

object App6 {

  def main(args: Array[String]): Unit = {


    val stack = new ds.Stack[Int]
    stack.push(1);
    stack.push(10)
    stack.push(100)

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stackWithString = new ds.Stack[String]
    stackWithString.push("hello")


    val tnr = new Trainer[Java]
    tnr.setSubject(new Java)
    var subject = tnr.getSubject
    println(subject.isInstanceOf[Java])


    val scalaTnr = new Trainer[Scala]
    scalaTnr.setSubject(new Scala)
    val subject2 = scalaTnr.getSubject
    println(subject2.isInstanceOf[Scala])


    //---------------------------------------------

    //scalaTnr.setSubject(new Java)// error // type-safety

    //---------------------------------------------

    val subject3 = scalaTnr.getSubject
    println(subject3.isInstanceOf[Scala])


    //val trainer = new Trainer[String];


  }


}
