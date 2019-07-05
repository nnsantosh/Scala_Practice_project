object MapAndSetOperationsExample {

  def main(args: Array[String]): Unit ={

    var empMap = Map(1 -> "Santosh", 2 -> "Abhishek")
    //Adding elements to map
    empMap += (3 -> "Savitha")
    println(empMap)
    //empMap.foreach(entry => println("key: "+ entry._1 + "and value: "+entry._2))
    //Removing elements from map
    empMap -= (3)
    println(empMap)

    var mySet = Set("Santosh","Savitha")
    println(mySet)
    mySet += "Abhishek"
    println(mySet)
    mySet -= "Savitha"
    println(mySet)

    var myTuple = (1,"USA")
    println(myTuple)
    var myTuple1 = 1 -> "India"
    println(myTuple1)


  }

}
