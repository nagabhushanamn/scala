

//  objects as functions   with 'apply'  methods

/*

 coding rules to overload methods

  must-be same

    ==> method-name

  must be different

    ==> number | type | order of parameters


 */

object Adder {
  def add(x: Int, y: Int) = x + y

  def apply(x: Int, y: Int) = x + y

  def apply(x: Double, y: Double) = x + y
}


class MyClass {
  def apply() = println("im in apply()")
}


object Ex4 {
  def main(args: Array[String]): Unit = {

    val x = 12;
    val y = 13;

    var result = Adder.add(x, y);
    println(result)

    result = Adder.apply(x, y);
    // or
    result = Adder(x, y);
    println(result)



    //


    val list = List(1, 2, 3, 4, 5)

    val my=new MyClass
    my()


  }
}
