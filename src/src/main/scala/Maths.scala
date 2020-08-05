import scala.math._

object Maths {
  def examples(): Unit = {
    println("Maths Examples")

    println("abs(-8) = " + abs(-8))
    println("cbrt(64) = " + cbrt(64)) // Cube root a^3 = n (Find a)
    println("ceil(5.45) = " + ceil(5.45))
    println("round(5.45) = " + round(5.45))
    println("floor(5.45) = "+ floor(5.45))
    println("exp(1) = " + exp(1))  // Euler's number raised to the power
    println("pow(2, 2) = " + pow(2, 2)) // 2^2
    println("sqrt(pow(2,2) + pow(2,2)) = " + sqrt(pow(2,2) + pow(2,2)))
    println("hypot(2, 2) = " + hypot(2, 2)) // sqrt(X^2 + y^2)
    println("log10(1000) =  " + log10(1000))
    println("log(2.7182818284590455) = " + log(2.7182818284590455)) // Natural logarithm to the base e
    println("min(5, 10) = " + min(5, 10))
    println("max(5, 10) = " + max(5, 10))
    println("(random * (11 - 1) + 1).toInt = " + (random * (11 - 1) + 1).toInt) // Random number between 1 and 10
    println("toRadians(90) = " + toRadians(90))
    println("toDegrees(1.5707963267948966) = " + toDegrees(1.5707963267948966))
    println("----------------------")
  }
}
