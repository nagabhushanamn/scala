


//
//class NewProduct1(val id: Int, val name: String, val price: Double) {
//
//  override def equals(obj: Any): Boolean = {
//    val other = obj.asInstanceOf[NewProduct];// type casting
//    if (this.id == other.id) true else false
//  }
//
//}
//
//object  NewProduct1{
////  def apply()
//}


// or

// case classes
case class NewProduct(id: Int, name: String, price: Double)


object Ex7 {
  def main(args: Array[String]): Unit = {

    val p1 = new NewProduct(123, "item-1", 100.00);
    val p2 = new NewProduct(123, "item-1", 100.00);

    println(p1 == p2)
    println(p1.equals(p2))


    //p1.id=100; // error. obj is immutable


    val p3 = p2.copy(price = 3000);



    //

    def matchProduct(x: Any) = {
      x match {
        //case x:NewProduct=>x.price
        //case x: NewProduct => if(x.price == 100) "HUNDRED"
        case NewProduct(_,_,price)=>if(price == 100) "HUNDRED"
      }
    }

    val s = matchProduct(p1);
    println(s)


  }
}
