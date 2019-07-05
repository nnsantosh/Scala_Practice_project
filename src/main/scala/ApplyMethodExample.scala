import scala.collection.mutable

object ApplyMethodExample {

  private val propMap : mutable.HashMap[String,String] = mutable.HashMap("1" -> "Santosh","2" -> "Abhishek")

  def apply(s:String): String = propMap(s)

  def main(args: Array[String]): Unit ={
    println("value of key 1 is : "+ApplyMethodExample("1"))
  }

}

