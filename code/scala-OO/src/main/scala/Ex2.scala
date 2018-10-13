
/*

  -------------------------------------------------------
    what is object ?

    ==> state    : data,properties,attributes,info,...
    ==> behavior : function,method,work,oprn,..
    ==> identity : reference,addrs,location

    obj ==> sbi

    -------------------------------------------------------

    if i want to single/unique object ?


    object Name{

      // state

      // behav

    }

    -------------------------------------------------------

    if i want to create many similar type of objects ?

    we need obj's template / class


    syntax of class

    class Name{
    // state-definition==> variables
    // behavior        ==> functions/methods
    }

    -------------------------------------------------------

    how to create object from class?


    2 steps:

      step-1 : dynamic memory allocation     ===> 'new' keyword
      step-2 : intialize that memory with object's data  ==> constructor


      val ref= new Constructor     ==> object



    //-----------------------------------------------------


 */

// #1
class Person1 {

  private var p_name = "Anonymous"
  private var p_age = 0


  //way-1  -> java-style
  //-------------------------------------------------------------------
  //  def getName() = p_name
  //
  //  def setName(name: String) = {
  //    if (!name.isEmpty)
  //      p_name = name
  //    else
  //      throw new IllegalArgumentException("Name is not valid")
  //  }

  ////way-2  ==> scala/math style
  //-------------------------------------------------------------------

  def name = p_name

  def name_=(name: String) = {
    if (!name.isEmpty)
      p_name = name
    else
      throw new IllegalArgumentException("Name is not valid")
  }

  //-------------------------------------------------------------------

  //
  //  def getAge() = age
  //
  //  def setAge(newAge: Int) = age = newAge

  //-----------------------------------------------------------------

  def age = p_age

  def age_=(age: Int) = {
    p_age = age
  }

  //-----------------------------------------------------------------


  def sayName() = println(s"im $p_name")

  def sayAge() = println(s"im $p_name,  $age yr old")

}


// #2
//-----------------------------------------------------------------
class Person2 {
  var name = "Anonymous"
  var age = 0
}

//-----------------------------------------------------------------


//#3   Primary constructor
//-----------------------------------------------------------------
class Person3(var name: String, var age: Int) {

  var address = "";
  var mobile = "";

  if (name.isEmpty) throw new IllegalArgumentException("name is not valid")

  def sayName() = println(s"im $name")

  def sayAge() = println(s"im $age,  $age yr old")
}

//-----------------------------------------------------------------


//#4   Auxilary constructor
//-----------------------------------------------------------------
class Person4(var name: String, var age: Int) {

  var address = "";
  var mobile = "";

  def this(name: String) = {
    this(name, 18)
  }

  def this(age: Int) = {
    this("Anonymous", age)
  }

  if (name.isEmpty) throw new IllegalArgumentException("name is not valid")

  def sayName() = println(s"im $name")

  def sayAge() = println(s"im $age,  $age yr old")
}

//-----------------------------------------------------------------


object Ex2 {
  def main(args: Array[String]): Unit = {


    val p4 = new Person4("Nag")
    val p5 = new Person4(36)



  }
}
