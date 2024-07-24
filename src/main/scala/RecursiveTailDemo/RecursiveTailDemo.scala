package RecursiveTailDemo

object RecursiveTailDemo {
  def main(args: Array[String]): Unit = {
    println(pow(3, 6))
  }

  @annotation.tailrec
  private def pow(x: Int, n: Int, result: Int = 1): Int = {
    if (n < 1) return result
    pow(x, n - 1, result * x);
  }
}
