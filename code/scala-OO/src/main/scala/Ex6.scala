
object Single {
  //..
}

class MyClass {

}

object MyClass {
  // can access every private members of companioin class
}


//--------------------------------------------------------------------------


class Food {

  private var name = "";
  private var price = 0.0

  private def this(name: String, price: Double) {
    this();
    this.name = name
    this.price = price
  }
}

object Food {
  def apply(name: String, price: Double): Unit = {
    new Food(name, price)
  }
}

//--------------------------------------------------------------------------


object Ex6 {
  def main(args: Array[String]): Unit = {

    //    val food1 = new Food
    //val food2 = new Food("biryani", 200)
    var food = Food("biryani", 200)

  }
}
