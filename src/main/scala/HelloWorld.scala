import java.util.stream.Collectors

import scala.collection.WithFilter

object HelloWorld {

  def main(args: Array[String]): Unit ={

    println(func1(5,"-"))
    println(funcReturnFunc("Hello")("Santosh"));
    println(funcThatAcceptsFunc(5, (x:Integer) => {"* "+ x +" *"}))
    println(funcSomeThing(4)(5))
    println("match func: "+matchFuncExample(5))
    println(forEachTestFunc());
    println(mapFuncTest());
    println(flatMapFuncTest());
    println(filterFuncTest());
    println(withFilterFuncTest());
    println(forLoopFunc());
    println(forLoopWithYieldFunc());
    //val myTestList = Range(1 to 5)
    //println(myTestList);
  }

  val func1 = (parm1:Integer,parm2:String) => parm2 + parm1 + parm2

  def funcReturnFunc(prefix:String)={

    (name:String) => {prefix + " " + name}

  }

  def funcThatAcceptsFunc(x : Integer, f: (Integer) => String): String ={
    f(x)
  }

  def funcSomeThing(x:Int)  ={
    println("sqrt :"+Math.sqrt(x))
    (y:Int) => {Math.sqrt(x+y)}
  }

  def matchFuncExample(x:Int): String ={
    val s =  x match{
      case 1 => "Case One"
      case 2 => "Case Two"
      case _ => "default case"
    }
    s
  }

  def forEachTestFunc(): Unit ={
    val names = List("gates","cook","buffet");
    names.foreach(s => println(s));

  }

  def mapFuncTest(): List[String] ={
    val names = List("gates","cook","buffet")
    val upperNames = names.map(s => s.toUpperCase)
    upperNames

  }

  def f3(s: String): Array[String] ={
    s.split(" ")
  }

  def flatMapFuncTest(): List[String] ={
    val names = List("gates is billionaire","cook is Apple CEO","buffet is great investor")
    val namesArray = names.map(f3)
    val words = names.flatMap(f3)
    words

  }

  def filterFuncTest(): List[String] ={
    val names = List("Apple","Google","AT&T","Boeing")
    val namesStartingWithA = names.filter(s => s.startsWith("A"))
    namesStartingWithA
  }

  def withFilterFuncTest():  List[String] ={
    val names = List("Apple","Google","AT&T","Boeing")
    val namesStartingWithB = names.withFilter(s => s.startsWith("B")).map(s => s)
    namesStartingWithB
  }

  def forLoopFunc(): Unit ={
    val countries = List("India", "USA", "UK")
    for(country <- countries){
      country match{
        case "India" => println("New Delhi")
        case "USA" => println("Washington")
        case "UK" => println("London")
        case _ => println("NO capital")
      }
    }
  }

  def forLoopWithYieldFunc(): List[String] ={
    val countries = List("India", "USA", "UK")
    val capitals = for(country <- countries) yield {
      country match{
        case "India" => "New Delhi"
        case "USA" => "Washington"
        case "UK" => "London"
        case _ => "NO capital"
      }
    }
    capitals
  }

}
