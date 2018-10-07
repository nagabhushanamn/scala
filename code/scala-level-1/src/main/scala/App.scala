object App {

  def main(args: Array[String]): Unit = {

//    def sumOfX(f: Int => Int, min: Int, max: Int): Int = {
//      if (min > max)
//        return 0;
//      else
//        f(min) + sumOfX(f, min + 1, max)
//    }

    def sumOfX(f: Int => Int, min: Int, max: Int): Int = {
      if (min > max)
        return 0;
      else
        f(min) + sumOfX(f, min + 1, max)
    }


    //call-stack
    //55
      // stack-frame-1 : min=1, max=5 ,   1 + 55
      // stack-frame-2 : min=2, max=5 ,   4 + 50
      // stack-frame-3 : min=3, max=5 ,   9 + 41
      // stack-frame-4 : min=4, max=5 ,   16 + 25
      // stack-frame-4 : min=5, max=5 ,   25 + 0  ==
      //............


    //way-1
    val v1 = sumOfX(x => x * x, 1, 5000000)
//    val v2 = sumOfX(x => x * x, 1, 10)
//    val v3 = sumOfX(x => x * x, 1, 100)

//    //
//    //way-2
//    val sum = sumOfX(x => x * x, _: Int, _: Int)
//
//    val v4 = sum(1, 5)
//    val v5 = sum(1, 10)
//    val v6 = sum(1, 100)


  }

}
