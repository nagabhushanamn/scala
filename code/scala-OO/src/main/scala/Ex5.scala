

// companion class
class Food private(val name: String, val price: Double, var foodType: String)


//object FoodType {
//  val VEG = "VEG"
//  val NONVEG = "NONVEG"
//}

// companion object  ==> object which includes static variables & static methods like in java
/*

  includes common variables or common methods for // companion class's instances

 */

object Food {

  val VEG = "VEG"
  val NONVEG = "NONVEG"

  // factory method // static method
  def apply(name: String, price: Double, typee: String): Unit = {
    // validation....
    new Food(name, price, typee)
  }

}


//---------------------------------------------------------------------


class Product private(name: String) {

}


object Product {
  var count = 0;

  def apply(name: String) = {
    count = count + 1;
    new Product(name)
  }
}


//---------------------------------------------------------------------


object Ex5 {
  def main(args: Array[String]): Unit = {


    //    val food1 = new Food("food1", 1000, Food.VEG)
    //    val food2 = new Food("food2", 1000, Food.NONVEG)

    //------------------------------------------------------------------
    val food3 = Food("food1", 1000, Food.VEG)
    val list = List(1, 2, 3, 4)
    //------------------------------------------------------------------

    //val p=new Product("product");
    val p1 = Product("product-1");
    val p3 = Product("product-3");
    val p2 = Product("product-2");

    println(Product.count)

  }
}
