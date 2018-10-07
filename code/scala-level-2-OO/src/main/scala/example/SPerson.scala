package example

class SPerson(private val name: String, private val age: Int) {

  //
  //  // way-1
  // accessor methods
  //    def setName(name: String) = {
  //      if (name.isEmpty) throw new IllegalArgumentException("Name cannot be empty")
  //      pname = name
  //    }
  def getName = name;

  //  // way-2
  //    def name_=(name: String) = {
  //      if (name.isEmpty) throw new IllegalArgumentException("Name cannot be empty")
  //      name = name
  //    }
  //    def name = name;


}
