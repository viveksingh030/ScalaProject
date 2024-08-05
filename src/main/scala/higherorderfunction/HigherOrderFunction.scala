package higherorderfunction

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    println(compute(5, 6, Math.max))
  }

  def compute(x: Int, y: Int, func: (Int, Int) => Int): Int = func(x, y)
}
