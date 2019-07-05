object CompanionObjectExample {

//Companion objects are required for separating the static and non static concerns of a class
  //A class can access private methods of a companion object and a companion object can access private methods of a class

  class Graph(path:String){
    println("Load the graph from file")
    def numEdges = 506
    def numVertices =   305
    def persist(storageLevel: Int): Unit ={
      println("Returns a new persisted graph")

    }
  }

  object Graph{
    val DISK_ONLY  = 0
    val MEMORY_ONLY = 1
    val MEMORY_ONLY_COMPRESSED = 2
    val MEMORY_AND_DISK = 3
    val MEMOMRY_AND_DISK_COMPRESSED = 4
    def apply(path: String) = new Graph(path)

  }

  def main(args: Array[String]): Unit ={
    val g = new Graph("file_location")
    val g1 = Graph("file_location")
  }


}
