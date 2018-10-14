package com


/*

  module-1:

  top-level: Abstraction/Interface/Trait




 */

// abstraction of List implementations
trait List {
  def add(ele: String): String // abstract
  def remove(idx: Int): Boolean

  def clear: Boolean = {
    //..
    true
  } // concrete
}



object SparkLib {
  def processData(list: List) = {
    list.clear
  }
}



//
class ArrayList extends List {

  def add(ele: String) = {
    println("ArrayList:add()");
    ele
  }

  def remove(idx: Int) = {
    println("ArrayList:remove()");
    true
  }

}


class LinkedList extends List {

  def add(ele: String) = {
    println("LinkedList:add()")
    ele
  }

  def remove(idx: Int) = {
    println("LinkedList:remove()")
    true
  }

}


class BaseList

class MyList extends BaseList with List {
  def add(ele: String) = {
    println("MyList:add()")
    ele
  }

  def remove(idx: Int) = {
    println("MyList:remove()")
    true
  }

  override def clear() = {
    println("MyList:clear()")
    true
  }
}



object App3 {
  def main(args: Array[String]): Unit = {

    val myList = new MyList
    SparkLib.processData(myList);

  }
}
