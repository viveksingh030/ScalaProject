package StringInterpollation

object Task1 {

  def main(args: Array[String]): Unit = {
    var str: String = "Vivek"
    println(typeOfString("Vivek"))
    println(typeOfString(""))
  }

  private def typeOfString(str1: String): String = str1 match {
    case s: String if s.isEmpty => "Empty String"
    case s if s.nonEmpty        => "Non Empty String"
  }

}
