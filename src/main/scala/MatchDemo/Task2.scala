package MatchDemo

object Task2 {
  def main(args: Array[String]): Unit = {
    def colorToHex(color: String): String = color.toLowerCase match {
      case "cyan" => "#00FFFF"
      case "magenta" => "#FF00FF"
      case "yellow" => "#FFFF00"
      case _ => throw new IllegalArgumentException(s"Unknown color: $color")
    }

    // Example usage
    try {
      println(colorToHex("cyan"))
      println(colorToHex("MAGENTA"))
      println(colorToHex("Yellow"))
      println(colorToHex("red")) // This will throw an exception
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }
  }
}
