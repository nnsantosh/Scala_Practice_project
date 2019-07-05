object PracticeOopProgramming {

  class Box (var length:Int, var width:Int, var height:Int){

    def this(length:Int, width:Int){
      this(length,width,1)
    }

    def this(){
      this(1,1,1)
    }
  }


  class Customer(var firstName : String, var lastName : String){
    //By default class is public in scala
    //Similarly by default variables of a class are public in scala
    //If you do not want automatic getters and setters to be generated for a variable make it private
      private var p_address  = "Bangalore"
    //When you make variable private you will have to write getters and setters
    //This will also give you a chance to implement some validations on the setter

    //getter
    def address = p_address
    //setter
    /*def address_ = (addr:String) ={
      p_address = addr
    }*/
    def setAddress(addr:String): Unit ={
      p_address = addr
    }

  }

  def main(args: Array[String]): Unit ={
    val santosh = new Customer("santosh","nijalingappa")
    println("first Name: "+santosh.firstName)
    println("last Name: "+santosh.lastName)
    santosh.firstName = "Suresh"
    santosh.lastName = "Santosh"
    println("first Name: "+santosh.firstName)
    println("last Name: "+santosh.lastName)
    santosh.setAddress("Mumbai")
    println("address: "+santosh.address)

  }

}
