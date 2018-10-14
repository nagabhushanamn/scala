package com

object App5 {

  def main(args: Array[String]): Unit = {


    def en1(name: String): Unit = println(s"Hello $name")


    val name1: String = "Naga"
    // or
    val name2 = "Naga" // Type Inference


    //val enV1: (String, Int) => Unit = (name: String, n: Int) => println(s"Hello $name")
    // or
    val enV2 = (name: String) => println(s"Hello $name") // Type Inference


    //en1("Nag")
    //enV1("Nag", 10)

    //-----------------------------------------------------------------------------

    // Named function : to bind any function to an object

    object person {
      def sayHello() = {
        println("hello..")
      }
    }
    //-----------------------------------------------------------------------------

    def add(x: Int, y: Int) = x + y

    def greet(name: String, f: String => Unit): Unit = {
      println("*" * 50)
      f(name)
      println("*" * 50)
    }

    greet("Nag", enV2)
    greet("Nag", name => println("Nag"))
    greet("Nag", println(_))

    //-----------------------------------------------------------------------------


    def teach() = {
      println("teach")
      () => println("learn")
    }

    teach()()


  }

}
