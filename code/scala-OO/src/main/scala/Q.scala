

object Q {

  def main(args: Array[String]): Unit = {


    //----------------------------------------------------
    def f1(x: Int, y: Int) = x + y

    //----------------------------------------------------

    def greet(lang: () => Unit) = {
      println("*" * 50)
      lang()
      println("*" * 50)
    }


    val en = () => println("Hello.....")
    val es = () => println("Ola.....")
    val tn = () => println("Vanakkam.....")

    val ar = (x: Int) => println("Salam....")

    greet(en)
    greet(es)
    greet(tn)

    //----------------------------------------------------

    def lib(a: Int, b: Int, arith: (Int, Int) => Int) = {
      arith(a, b)
    }

    val plus = (a: Int, b: Int) => a + b
    val mul = (a: Int, b: Int) => a * b


    val f = lib(12, 13, _: (Int, Int) => Int); // partially applied
    println(f(plus))
    println(f(mul))


    //----------------------------------------------------


    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    def fOne(list: List[Int], v: Int) = {
      val outList = list.map(x => x + v)
      outList.reduce(_ + _)
    }

    val r = fOne(list, 10)



    //----------------------------------------------------


    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for {
      i <- 1 to 10
      if i > 3
      if i < 6
      if i % 2 == 0
    } println(i)


    //-----------------------------------------------------------------

    var y = 0

    def ShowLinePoint(m: Int, x: Int, c: Int, f: (Int, Int) => Int) = {
      f(x, c)
    }

    def LineFunc(x: Int, c: Int) = {
      y = 3 * x + c;
      y
    }

    //println("Y value of Line where x=1 and c is 5" + LineFunc(1,5))
    ShowLinePoint(3, 5, 6, LineFunc);
    println("Y value of Line where x=1 and c is 5 - " + y)


    //---------------------------------------------------------------------


    var x = {

      val x = 12;
      val y = 13;

      z: Int => x + y + z // function literal

    }

    println(x(100))

  }




}
