
// implicit parameters

object App7 {
  def main(args: Array[String]): Unit = {


    def multiply(implicit x: Int) = x * 10

    val result1 = multiply(10) // explict paramaters
    println(result1)

    implicit val v1 = 20;
    val result2 = multiply
    println(result2)

  }
}
