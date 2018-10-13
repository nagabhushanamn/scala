package com.bank

// API/spec/interface
trait Wheel {
  def rotate // abstract method
}

trait SportFeature {
  def sportDrive;
}

trait GovSafety {
  def safety = println("Wheel safety..") // normal methods
}


class MRFWheel extends Wheel with SportFeature with GovSafety {

  override def rotate = {
    println("MRF-wheel rotating...")
  }

  override def sportDrive: Unit = println("drive in sport..")

  override def safety = println("Wheel safety by MRF")
}

class CEATWheel extends Wheel {
  override def rotate = {
    println("CEATwheel rotating...")
  }
}


//class Car {
//  var wheel: MRFWheel = null;
//
//  //
//
//  def setWheel(wheel: MRFWheel) = this.wheel = wheel
//
//  def move = {
//    wheel.rotate
//    println("Car is moving...")
//  }
//}

class Car {
  var wheel: Wheel = null;

  def setWheel(wheel: Wheel) = this.wheel = wheel

  def move = {
    wheel.rotate
    if (wheel.isInstanceOf[MRFWheel])
      wheel.asInstanceOf[MRFWheel].safety
    println("Car is moving...")
  }
}


object out{
  def print(x:String)=println(x)
  def print(x:Int)=println(x)
}


object Ex {

  def main(args: Array[String]): Unit = {

    val car1 = new Car
    val mrfWheel = new MRFWheel
    car1.setWheel(mrfWheel)
    car1.move
    car1.move
    car1.move

    val ceatWheel = new CEATWheel
    car1.setWheel(ceatWheel)
    car1.move
    car1.move
    car1.move

  }

}
