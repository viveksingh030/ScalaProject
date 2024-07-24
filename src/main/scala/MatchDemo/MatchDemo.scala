package MatchDemo
import scala.util.matching.Regex

object MatchDemo {
  def main(args: Array[String]): Unit = {
    var i = 5
    var evenOrOdd = i match
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
      case _ => println("some other number")
    i = 11
    evenOrOdd = i match
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
      case what => println(s"some other number ${what}")
    i = 5
    i match
      case 1 => println("one, a lonely number")
      case x if x == 2 || x == 3 => println("two’s company, three’s a crowd")
      case x if x > 3 => println("4+, that’s a party")
      case _ => println("i’m guessing your number is zero or less")


    case class Person(name: String, age: Int)

    def speak(p: Person) = p match
      case Person(name, age) if name == "Fred" => println(s"$name says, Yubba dubba doo having age ${age}")
      case Person(name, age) if name == "Bam Bam" => println(s"$name says, Bam bam having age ${age}!")
      case _ => println("Watch the Flintstones!")

    speak(Person("Fred", 20)) // "Fred says, Yubba dubba doo"
    speak(Person("Bam Bam", 18))


    def pattern(x: Matchable): String = x match

      // constant patterns
      case 0 => "zero"
      case true => "true"
      case "hello" => "you said 'hello'"
      case Nil => "an empty List"

      // sequence patterns
      case List(0, _, _) => "a 3-element list with 0 as the first element"
      case List(1, _*) => "list, starts with 1, has any number of elements"
      case Vector(1, _*) => "vector, starts w/ 1, has any number of elements"

      // tuple patterns
      case (a, b) => s"got $a and $b"
      case (a, b, c) => s"got $a, $b, and $c"

      // constructor patterns
      case Dog("Zeus") => "found a dog named Zeus"

      // type test patterns
      case s: String => s"got a string: $s"
      case i: Int => s"got an int: $i"
      case f: Float => s"got a float: $f"
      case a: Array[Int] => s"array of int: ${a.mkString(",")}"
      case as: Array[String] => s"string array: ${as.mkString(",")}"
      case d: Dog => s"dog: ${d.name}"
      case list: List[?] => s"got a List: $list"
      case m: Map[?, ?] => m.toString

      // the default wildcard pattern
      case _ => "Unknown"

    case class Dog(name: String)

    println(pattern(45))


    val input = "Frank,123 Main,925-555-1943,95122"

    // Extract the phone number using regex
    val phoneRegex: Regex = """(\d{3})-(\d{3})-(\d{4})""".r
    val phoneNumber = phoneRegex.findFirstIn(input).getOrElse("No match")
    println("phoneNumber=" + phoneNumber)

    // Convert each part to an integer and store in a tuple
    val phoneTuple: Option[(Int, Int, Int)] = phoneNumber match {
      case phoneRegex(area, prefix, line) =>
        Some((area.toInt, prefix.toInt, line.toInt))
      case _ => None
    }

    // Print the result
    phoneTuple match {
      case Some((area, prefix, line)) =>
        println(s"Phone parts: ($area, $prefix, $line)")
      case None =>
        println("Could not parse phone number")
    }
  }
}
