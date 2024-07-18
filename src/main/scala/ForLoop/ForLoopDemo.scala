package ForLoop

object ForLoopDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i=" + i)
    }
    for (i <- 11 until (20)) {
      println("i=" + i)
    }

    // two loop
    // for loops can have multiple generators, as shown in this example:
    for (i <- 1 to 10; j <- 1 to 10) {
      println("i=" + i + ",j=" + j);
    }

    // for loops can also contain if statements, which are known as guards:
    var list = List(10, 20, 30, 4, 5)
    for (i <- list; if i > 5) {
      println(i)
    }

    for (i <- 1 to 10 by 2) {
      println("ii=" + i)
    }
    val ints = Seq(11, 22, 33)
    for i <- ints do println(i)

    for i <- ints
      do {
        val x = i * 2
        println(s"i = $i, x = $x")
      }

    // for with Map

    val states = Map(
      "AK" -> "Alaska",
      "AL" -> "Alabama",
      "AR" -> "Arizona"
    )
    for (abbrev, fullName) <- states do println(s"$abbrev: $fullName")

    // for expressions
    var list2 = for i <- 10 to 12 yield i * 2
    println("list2=" + list2)

    var evenSquares = for {
      i <- 1 to 10; if i % 2 == 0
    } yield {
      i * i
    }
    println("evenSquares=" + evenSquares)

    val names = List("_olivia", "_walter", "_peter")

    val capNames = for name <- names yield
      val nameWithoutUnderscore = name.drop(1)
      val capName = nameWithoutUnderscore.capitalize
      capName

    // Using a for expression as the body of a method
    def between3and10(xs: List[Int]): List[Int] =
      for
        x <- xs
        if x >= 3
        if x <= 10
      yield x

    println(
      "between3and10(List(1, 3, 7, 11))" + between3and10(List(1, 3, 7, 11))
    )

    val quote = "Faith,Hope,,Charity"
    for (t <- quote.split(","); if t != null; if t.nonEmpty) {
      println(t)
    }

    val days = for (i <- 1 to 7) yield {
      if (i >= 1 && i <= 5)
        "WeekDay"
      else
        "Weekend"
    }

    for (d <- days) println(d)
  }
}
