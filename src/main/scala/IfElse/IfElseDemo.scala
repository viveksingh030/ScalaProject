package IfElse

object IfElseDemo {
  def main(args: Array[String]): Unit = {
    var x: Int = 10
    if (x < 5) {
      println(s"x is less than ${x}")
    } else {
      println(s"x is greater or equal than 5")
    }

  }
}
