object ListCombine{
  def main (args: Array[String]): Unit =
  {
    var list1 = List(25,17,12)
    var list2 = List(44,2,6,77)
    var list3 = List.concat(list1, list2)
    var relist = list3.reverse
    print("Reverse\n")
    relist.foreach((element: Int) => println(element))
    print("Reverse Odd\n")
    for(i <- 0 until relist.length)
      {
        if(relist(i) % 2 != 0)
          {
            println(relist(i)+" ")
          }
      }
  }
}
