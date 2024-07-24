package MatchDemo

object Task3 {
  def main(args: Array[String]): Unit = {
    printTypeSafe(15)
  }

  def printTypeSafe(num: Int): Unit = {
    for (i <- 1 to num) {
      i match
        case j if j % 5 == 0 && j % 3 == 0 => println("Type Safe")
        case j if j % 3 == 0               => println("Type")
        case j if j % 5 == 0               => println("Safe")
        case _                             => println(i.toString)
    }
  }
}
