package classdemo


class ClassDemo(var firstName: String, var lastName: String) {
  def this() = {
    this("Vivek", "Singh")
  }

  def this(firstName: String) = {
    this(firstName, "Singh")
  }

  def print() = {
    printf(s"firstname=${firstName} lastName=${lastName}")
  }

  def print(a:Int):Unit={
    println(a)
  }
}

object Demo {
  def main(args: Array[String]): Unit = {
    var classDemo: ClassDemo = ClassDemo("Vivek", "Singh")
    println("classDemo.firstNam=" + classDemo.firstName)
    classDemo = ClassDemo()
    println(classDemo.print())
  }
}
