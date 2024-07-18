package WhileLoopDemo

object WhileLoopDemo {
  def main(args: Array[String]): Unit = {
    var x: Int = 0
    while (x < 10) {
      println(x)
      x += 1
    }

    while x < 20 do {
      println(x)
      x += 1
    }

  }
}
