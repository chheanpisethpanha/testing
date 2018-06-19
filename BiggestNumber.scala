object BiggestNumber{
  def main(args: Array[String]): Unit = {
    print("Enter 3 numbers: ")
    var ar: Array[Int] = new Array[Int](3)
    for(i <- 0 until ar.size)
      {
        var num = scala.io.StdIn.readInt()
        ar(i) = num
      }
    for (i <- 0 until ar.size)
      {
        for(j <- i+1 until ar.size)
          {
            if(ar(i) < ar(j))
              {
                var temp = ar(j)
                ar(j)= ar(i)
                ar(i) = temp
              }
          }
      }
    for(i <- 0 until ar.size)
      {
        print(ar(i))
        print(" ; ")
      }
  }
}
