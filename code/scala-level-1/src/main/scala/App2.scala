object App2 {

  def main(args: Array[String]): Unit = {

    def rFactorial(n: Int): BigInt = {
      if (n <= 0)
        return 1
      else
        return n * rFactorial(n - 1)
    }


    def Factorial(i: Int): BigInt = {
      println("You called Factorial for " + i)
      def tFactorial(n: Int, f: BigInt): BigInt = {
        if (n <= 0)
          f
        else
          tFactorial(n - 1, n * f)
      }
      return tFactorial(i, 1)
    }

    println("start")
    val v = Factorial(50000)
    println(v)



    // List

    val list=List(1,2,3,4,5,6); // 6M
    list.map(n=>n*n)  // tranformation


  }

}
