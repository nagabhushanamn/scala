package com



//-------------------------------------------------------------------------------------------
//               same-type same-instance  sub-type   other-type  companion-object  other-package
//--------------------------------------------------------------------------------------------

//private          Y         Y               N          N           Y                N
//private[this]    Y         N               N          N           N                N
//private[package] Y         Y               N          N           Y                Y*
//protected        Y                         Y          Y           Y                N
//public           y         y               y          y           y                y



//---------------------------------------------------------------------




package p1 {

  class A {

    private val pri = 1
    private[this] val pri2 = 1
    protected val pro = 2
    var pub = 3;


    def m1 = println("im m1()" + A.v)

    def display1 = {
      println(pri)
      println(pro)
      println(pub)
      m1;
    }

    def compareTwoAInstances(other: A) = {
      //if (this.pri2 == other.pri2) true else false
    }


  }


  object A {
    private val v = 100;

    def m = {
      val a = new A();
      println(a.pri)
    }
  }


  class B extends A {
    def display2 = {
      //println(pri)
      println(pro)
      println(pub)
      m1
    }
  }

  class C {
    def display3 = {
      val a1 = new A()
      //println(a1.pri)
      //println(a1.pro)
      println(a1.pub)
      a1.m1
    }
  }


}

package p2 {

  import com.p1.A

  class D extends A {
    def display4 = {
      //println(pri)
      println(pro)
      println(pub)
      //println(pub2)
    }
  }

  class E {
    def display1 = {
      val a1 = new A()
      //println(a1.pri)
      //println(a1.pro)
      println(a1.pub)
    }
  }

}


package org.acme.app.model {

  class Foo {
    private[model] def doX = {
      println("doX")
    }

    private[app] def doY = {
      println("doY")
    }

    private[acme] def doZ = {
      println("doZ")
    }
  }

}

import org.acme.app.model._;

package org.acme.app.view {

  class Bar {
    val foo = new Foo
//    foo.doX
    foo.doY
    foo.doZ
  }

}


object App2 {

  def main(args: Array[String]): Unit = {


    //new p1.A().display1


    //    val a1 = new p1.A
    //    val a2 = new p1.A

    //    println(a1 compareTwoAInstances a2)

    new p2.D().display4

  }

}
