import scala.collection.mutable.ListBuffer

object ListDemo{
  def main(args: Array[String]): Unit = {
    print("Enter 5 element in the list")
    var Fruits = new ListBuffer[String]()

    for(i <- 0 until 5)
      {
        var str = scala.io.StdIn.readLine()
        Fruits += str
      }
    var x = Fruits.slice(2,5)
    var t = "Kiwi" :: Fruits.toList
    var(l,r) = Fruits.splitAt(3)
    println(Fruits)
    print(t+"\n")
    print(l)
  }
}