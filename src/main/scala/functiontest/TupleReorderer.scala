package functiontest
object TupleReorderer {
  // Function to reorder a 2-sized tuple such that the Int value is in the first position
  private def reorderTuple[T1, T2](tuple: (T1, T2)): (Any, Any) = {
    tuple match {
      case (a, b) if a.isInstanceOf[Int] => (a, b)
      case (a, b) if b.isInstanceOf[Int] => (b, a)
      case _ => tuple // If neither is an Int, return the tuple as is
    }
  }

  def main(args: Array[String]): Unit = {
    val tuple1 = ("hello", 42)
    val tuple2 = (42, "world")
    val tuple3 = ("foo", "bar")

    println(s"Original: $tuple1, Reordered: ${reorderTuple(tuple1)}")
    println(s"Original: $tuple2, Reordered: ${reorderTuple(tuple2)}")
    println(s"Original: $tuple3, Reordered: ${reorderTuple(tuple3)}")
  }
}

