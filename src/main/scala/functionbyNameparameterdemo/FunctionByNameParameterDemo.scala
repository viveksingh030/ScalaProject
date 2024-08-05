package functionbyNameparameterdemo

object FunctionByNameParameterDemo {
  var i: Int = 0;

  def main(args: Array[String]): Unit = {
    funcByNameParameter(func())


    // The message expression is not evaluated if the level is not "DEBUG"
    log("INFO", {
      println("Evaluating message")
      "This is a log message"
    })


    //val Redundant: Nothing = null
    val result = computeTwice(true, {
      println("Computing...")
      42
    })

    val x = 10
    val y = 20
    val result2 = myIf(x > y, x, y)
    println(result2)
  }

  private def funcByNameParameter(x: => Int): Unit = {
    for (i <- 1 to 10) {
      println(x)
    }
  }

  private def func(): Int = {
    this.i = this.i + 1
    println("from func=" + this.i)
    i
  }

  def log(level: String, message: => String): Unit = {
//    if (level == "DEBUG") {
//      println(message)
//    }

    level match
      case "DEBUG" => println(message)
      case _ =>
  }

  def computeTwice(condition: Boolean, computation: => Int): Int = {
    if (condition) computation + computation else 0
  }

  def myIf[T](condition: Boolean, ifTrue: => T, ifFalse: => T): T = {
    if (condition) ifTrue else ifFalse
  }

}
