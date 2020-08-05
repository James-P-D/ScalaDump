import scala.math._

object Conditionals {
  def examples(): Unit = {
    println("Conditionals Examples")

    // Conditional Operators : ==, !=, >, <, >=, <=
    // Logical Operators : &&, ||, !

    // If can be used as the tenary operator (?:)
    val age = 19
    val canVote = if (age >= 18) "yes" else "no"
    println("canVote = " + canVote)

    // You have to use { } in the REPL, but not otherwise
    if ((age >= 5) && (age <= 6)) {
      println("Go to Kindergarten")
    } else if ((age > 6) && (age <= 7)) {
      println("Go to Grade 1")
    } else {
      println("Go to Grade " + (age - 5))
    }

    // We have a switch statement
    age match {
      case 17 => println("Start driving")
      case 18 => println("Start voting")
      case _ => println("Nothing exciting")
    }

    // 'match' can also return a value
    val i = 3
    val dayOfWeek = i match {
      case 1 => "sun"
      case 2 => "mon"
      case 3 => "tue"
      case 4 => "wed"
      case 5 => "thur"
      case 6 => "fri"
      case 7 => "sat"
      case _ => "UNKNOWN!"
    }
    println("dayOfWeek = " + dayOfWeek)

    // TODO: Update for @switch
    println("----------------------")
  }
}
