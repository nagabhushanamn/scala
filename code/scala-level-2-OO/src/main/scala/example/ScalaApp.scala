package example


class Circle(private val radius: Int){
  def show()={
    println()
  }
}


object ScalaApp {

  def main(args: Array[String]): Unit = {
    val c = new Circle(5)
  }

}
