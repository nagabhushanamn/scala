

class Person(val name: String, val age: Int) {

  var mobile = ""
  var address = ""

  def this(name: String) = {
    this(name, 0)
  }

  def this(name: String, age: Int, mobile: String) = {
    this(name, age);
    this.mobile = mobile
  }


  // methods...


}


object Ex3 {
  def main(args: Array[String]): Unit = {

    val p1 = new Person("Nag")
    val p2 = new Person("Nag", 35)
    p2.mobile = "123456789";

    val p3 = new Person("Nag", 35, mobile = "1234567890")

    println(p1.name)


  }
}
