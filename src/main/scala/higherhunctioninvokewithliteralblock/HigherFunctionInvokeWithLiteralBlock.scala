package higherhunctioninvokewithliteralblock
import java.util.UUID
object HigherFunctionInvokeWithLiteralBlock {
  def main(args: Array[String]): Unit = {
    println(nullSafeStringWithFuncOperation("Vivek", {
      s => s.toLowerCase()
    }))
    val uuid=UUID.randomUUID().toString
    val timedUUID = safeStringOp(uuid) { s =>
      val now = System.currentTimeMillis
      val timed = s.take(24) + now
      timed.toUpperCase
    }

    println(timedUUID)
  }

  private def nullSafeStringWithFuncOperation(s: String, f: String => String): String = {
    if (s != null) f(s) else s
  }

  def safeStringOp(s: String)(f: String => String) = {
    if (s != null) f(s) else s
  }
}
