package com

import java.util.concurrent.TimeUnit

import scala.collection.mutable.ArrayBuffer


//-------------------------------------------------------------

trait T1

trait T2

trait T3 extends T2

class Super {

}

class Sub extends Super with T1 with T2 {

}

class Sub2 extends T1 {

}

class Sub3 extends T1 with T2 {

}


//-------------------------------------------------------------
trait DoorListener {
  def start

  def stop
}

//-------------------------------------------------------------
// principle : "open for extension & closed modification"
//-------------------------------------------------------------

object door {

  var listeners = new ArrayBuffer[DoorListener]() //array data-structure

  def addDoorListener(listener: DoorListener): Unit = {
    listeners += listener
  }

  def removeDoorListener(listener: DoorListener): Unit = {
    listeners -= listener
  }

  def open = {
    println("door opened...")
    for (listener <- listeners) listener.start
  }

  def close = {
    println("door closed...")
    for (listener <- listeners) listener.stop
  }
}

//-------------------------------------------------------------

object light extends DoorListener {
  override def start: Unit = println("LIGHT ON")

  override def stop: Unit = println("LIGHT OFF")

  def stop(x: Int): Unit = println("LIGHT OFF")
}

//-------------------------------------------------------------

object ac extends DoorListener {
  override def start: Unit = println("AC ON")

  override def stop: Unit = println("AC OFF")
}

object App4 {
  def main(args: Array[String]): Unit = {


    door.addDoorListener(light);
    door.addDoorListener(ac);

    TimeUnit.SECONDS.sleep(2)
    door.open;
    TimeUnit.SECONDS.sleep(2)
    door.close


    door.removeDoorListener(light);


    TimeUnit.SECONDS.sleep(2)
    door.open;
    TimeUnit.SECONDS.sleep(2)
    door.close

  }
}