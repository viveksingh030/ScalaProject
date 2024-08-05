package partiallyappliedfunction

object PartiallyAppliedFunction {
  def main(args: Array[String]): Unit = {
    val multipleOf3: Int =>Boolean=factorOf(3,_:Int)
    println(multipleOf3(27))
  }

  private def factorOf(x: Int, y: Int): Boolean = y % x == 0
}
