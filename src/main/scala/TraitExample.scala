object TraitExample {
   def main(args: Array[String]): Unit ={
      val myTiger = new Tiger()
     myTiger.makeSound()
   }
}

//Trait is similar to interface in java.
// Scala class must extend the trait and provide implementation for all methods of trait
//If the Scala class that extends a trait is abstract then it need not provide implementation for methods of trait
trait Animal{
  def makeSound()
}

class Tiger extends Animal{
  def makeSound(): Unit ={
    println("roar!!")
  }
}


