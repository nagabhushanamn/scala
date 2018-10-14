package com

//import business.customer.doBusiness;
//import business.customer.doSomething;


import business.customer._;

import business.customer.{doSomething => doThis}
import business.customer.{doBusiness => doWork}

import hotel.customer.{doEat => _, doPay => _, _} // excluding doEat from hotel.customer


import java.util.{List => _, _} // Java List


// default/imlicit imports on every scala file
import java.lang._
import scala._
import Predef._


object App {

  //import business.customer.doBusiness;  ===> object scope

  def main(args: Array[String]): Unit = {

    //business.customer.doBusiness
    //println(trainer)

    //  import business.customer.doBusiness;  ==> method scope
    doBusiness
    doBusiness

    anotherMethod

    doSomething
    doThis

    //doPay

    val list = List(1, 2, 3, 4)

    val v: Int = 12;

    println("hello..")


    def f = {

      import business.{customer => bcustomer}
      import hotel.customer

      bcustomer.doBusiness
      customer.doEat

    }


  }

  def anotherMethod = {
    doBusiness
  }

}


object obj {
  def func = {
    doBusiness
  }
}