object App3 {


  def main(args: Array[String]): Unit = {


    def func(rice:String)(curry:String)(curd:String)={
      println(rice)
      println(curry)
      println(curd)
    }

    //func("RICE")("CHICKEN CURRY")("CURD")

    val funcWithRice=func("RICE")_

    def part(e:Int,f:Int,t:Int)  =  println("Welcome to partialll")

    part(1,_:Int,_:Int)



  }

}
