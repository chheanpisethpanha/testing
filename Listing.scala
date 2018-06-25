object Listing
{
  def main(args: Array[String]): Unit = {
    var list1 = List(1,2,3,4)
    var list2 = List(5,6,7,8)
    //List concant
    var list3 = List.concat(list1,list2)
    print(list3)
    //Reverse List
    var relist = list3.reverse
    println(relist)

    //print reverse *odd only
    print("Reverse odd:\n")
    for(i <- 0 until relist.length)
      {
        if(relist(i) %2 != 0)
          {
            println(relist(i))
          }
      }

    //Print all except last
    print("Print all except last\n")
    print(relist.init+"\n")

    //List of lists
    print("List of Lists\n")
    var list4 = List(list1,list2,list3)
    print(list4+"\n")

    //List to String conversion
    print("List to String conversion\n")
    var liststr = list3.mkString
    print(liststr+"\n")



  }
}
