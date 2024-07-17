package StringDemo

object StringDemo {
  def main(args: Array[String]): Unit = {
    val s: String = "ABDFCADWWEWEWE"
    println(s.toLowerCase())
    println(s.charAt(5))
    println(s.substring(4))
    println(s.substring(0, 6))
    println(s.reverse)
    println(s.startsWith("CAD"))
    var str:String=new String("HelloWorld")
    println(str.substring(0,5))
  }

}
