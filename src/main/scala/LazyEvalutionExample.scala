object LazyEvalutionExample {


  def main(args: Array[String]): Unit ={

    //val x = doubleNumber(factorialOfNumber(5))
    //println("x: "+x)
    //lazy val y = doubleNumber(factorialOfNumber(5))
    //println("y: "+y)
    //val twiceVal = twice(factorialOfNumber(5))
    //val twiceEfficentVal = twiceEfficent(factorialOfNumber(5))
    val twiceLazyVal = twiceLazy(factorialOfNumber(5))


  }


  def factorialOfNumber(n:Int): Int ={
    println("calling factorialOfNumber "+n)
    if(n <= 1) 1 else n * factorialOfNumber(n-1)

  }

  def doubleNumber(n:Int): Int ={
    n*2
  }

  def twice(f: => Int): Int ={
    println("We haven't use f yet")
    f + f
  }

  def twiceEfficent(f: => Int): Int ={
    println("We haven't use f yet")
    val i = f
    i + i
  }

  def twiceLazy(f: => Int): Int ={
    println("We haven't use f yet")
    lazy val i = f
    i + i
  }





}
