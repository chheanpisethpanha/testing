import scala.collection.immutable.HashSet.HashSet1
import java.util
object StringDemo {
  def main(args: Array[String]): Unit = {
    var vow = 0
    var con = ""
    var set = scala.collection.mutable.LinkedHashSet[Char]()
    print("Enter a string: ")
    var str = scala.io.StdIn.readLine()
    var s = str.toLowerCase()

    for(i <- 0 until s.length())
      {
        set += s.charAt(i)
      }
    for (s <- set)
      {
        if(s >= 'A' && s <= 'Z'|| (s >= 'a' && s <= 'z'))
        {
          s match {

            case 'a' => vow = vow + 1
            case 'e' => vow = vow + 1
            case 'i' => vow = vow + 1
            case 'o' => vow = vow + 1
            case 'u' => vow = vow + 1
            case 'A' => vow = vow + 1
            case 'E' => vow = vow + 1
            case 'I' => vow = vow + 1
            case 'O' => vow = vow + 1
            case 'U' => vow = vow + 1

            case _ => con = con + s + " "
          }
        }
  }

    print(con)
    print(vow)
  }
}
//    for( i <- 0 until ar.length){
////      for( j <- 1 until ar.length)
////        {
////             {
////
////             }
////              }
//      var ch = ar.charAt(i);
//      ch match {
//
//        case 'a' => vow = vow +1
//        case 'e' =>vow = vow +1
//        case 'i' =>vow = vow +1
//        case 'o' =>vow = vow +1
//        case 'u' =>vow = vow +1
//        case 'A' =>vow = vow +1
//        case 'E' =>vow = vow +1
//        case 'I' =>vow = vow +1
//        case 'O' =>vow = vow +1
//        case 'U' =>vow = vow +1
//
//        case _ => con = con + ch + " "
//            }
//        }




//    while(str != -1){
//
//    }

