package groupingparameterdemo
object GroupingParameterDemo {
  def main(args: Array[String]): Unit = {
    val factorOf3: (Int) => Boolean = factorOf(3)
    println(factorOf3(27))
  }

  private def factorOf(x: Int)(y: Int): Boolean = y % x == 0
}
