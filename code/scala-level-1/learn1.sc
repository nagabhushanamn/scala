println("hello")




def sum(x:Int, y:String, z:Int) = x+y+z

//val s1=sum(_:Int,_:Int,_:Int);
// or
var s2=sum _ // wen we skip all params

val s3=sum(_:Int,"-",_:Int)
s3(1,15)


val ar=Array(1,2,3)
ar.reduce(_+_)





// FUnction currying

def sumOfXX(f:Int => Int, a:Int, b:Int):Int =
  if (a>b) 0 else f(a) + sumOfXX(f, a+1, b)

// or


def sumOfXX(f:Int => Int)(a:Int, b:Int):Int =
  if (a>b) 0 else f(a) + sumOfXX(f, a+1, b)

val pfSum=sumOfXX(x=>x*x*x)
pfSum(1,2)












//--------------------------------------
// 1. data-types
//--------------------------------------
val v1: Int = 12; // immutable data
var v2: Int = 13; // mutable data

val v3: Any = 12; // value
val v4: Any = "scala"; // reference

val v5: AnyVal = 13;
val v6: AnyRef = "scala";

//--------------------------------------
// 2. operators/methods
// in scala everything is an objects
//--------------------------------------
val v7 = (1).+(2)
val v8 = (1) + (2)
val v9 = 1 + (2)
val v10 = 1 + 2

//--------------------------------------
// 3. Type Inference
//--------------------------------------
val v11: Int = 12 + 13
// or
val v12 = 12 + 13

//--------------------------------------
// 4. Function - syntax
//--------------------------------------

// a. Named Function

def findMax1(x: Int, y: Int): Int = {
  if (x > y)
    return x;
  else
    return y;
}

// or

def findMax2(x: Int, y: Int): Int = {
  if (x > y)
    return x
  else
    return y
}

def findMax3(x: Int, y: Int): Int = {
  if (x > y)
    x
  else
    y
}

def findMax4(x: Int, y: Int): Int = {
  if (x > y) x else y
}

def findMax5(x: Int, y: Int): Int = if (x > y) x else y


def doSomething() = println("im doing something outside")
doSomething() // way-1
doSomething //way-2


def getSomething2 = 3.14 // if function not doing side-effect( pure function )
getSomething2



// Named
//-------------------------------------------
def transform(x: Int): Int = {
  x * x
}
//-------------------------------------------

// a. Anonymous Function

//when to use ?

// 1. to assign function to variable
// 2. to pass function as argument to other function
// 3. to return function from any function

val transform1 = (x: Int) => {
  x * x
}
transform1(10)


val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
arr.map(transform1)
arr.map((x: Int) => {
  x * x
})
arr.map((x: Int) => x * x)
arr.map(x => x * x)

//--------------------------------------------
// Placeholder syntax
//-------------------------------------------

arr.map(_ * 10)
arr.reduce(_ + _)


//-------------------------------------------
// function currying
//--------------------------------------------

val f1 = (x: Int) => {
  println(x) // parent-scope
  val f2 = (y: Int) => {
    println(x) // child-scope
    x / y
  }
  f2
}

// or

val f = (x: Int) => (y: Int) => x * x;


val v = f1(10)(20)

println("end..")


//-------------------------------------------
// function with variable argumants
//--------------------------------------------

def echo(s: String*) = s foreach println

echo("hello", "hi")


//-------------------------------------------
// function with default & Named params
//-------------------------------------------

def func(x: Int = 1, y: Int = 2) = {
  println(x)
  println(y)
}

func(y = 200)


//---------------------------------------------
//Partially Applied Functions & Function currying
//---------------------------------------------


def div(x: Int, y: Int) = x / y

val x = 10;

val pf = div(x, _: Int)
pf(5)
pf(2)

//e.g


def sumOfX(f: Int => Int, min: Int, max: Int): Int = {
  if (min > max)
    0
  else
    f(min) + sumOfX(f, min + 1, max)
}


sumOfX(x => x * x, 1, 5)
sumOfX(x => x * x, 1, 10)
sumOfX(x => x * x, 1, 100)

val sumOfNums = sumOfX(x => x, _: Int, _: Int)

sumOfNums(1, 10)
sumOfNums(1, 5)
sumOfNums(1, 100)


//--------------------------------------------------











































