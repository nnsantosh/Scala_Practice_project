case class Vector2D(x:Int,y:Int){
//Automatically creates companion object with apply method for all the attributes of the class defined in the constructor
  //Overrides equals and hashcode method
  //Creates copy method
}


object CaseClassExample {
  def main(args: Array[String]): Unit ={
    val my2dVector1 = Vector2D(4,5)
    println(my2dVector1.toString)
    val my2dVector2 = Vector2D(4,5)
    println(my2dVector1 == my2dVector2)
    val my2dVector3 = my2dVector1.copy(y=10)
    println(my2dVector3.toString)
  }
}
