package partialfunction

object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    println(statusCodeMessage(400))
    println(statusCodeMessage(401))
  }

  private def statusCodeMessage(statusCode: Int): String = {
    statusCode match
      case 200 => "Success"
      case 400 => "Bad Request"
      case 404 => "Not Found"
      case 500 => "Internal Server Error"
  }
}
