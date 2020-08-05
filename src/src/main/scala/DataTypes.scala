
object DataTypes {
  def examples(): Unit = {
    println("DataType Examples")

    // variables can be declared with 'var' and can have implied type
    var myName = "James"
    var myAge = 39
    println("My name is " + myName + " and I am " + myAge)

    // You can define the type
    var myLocation: String = "London"

    // 'var's are mutable
    myAge += 1
    println("My age is now " + myAge)

    // 'vals' are constant
    val myHeight = 1.82
    println("My height is " + myHeight)
    // This will cause an error because 'val's are constant
    //myHeight += 1

    // All datatypes in Scala are objects and they include
    // (Get the max value with MaxValue)
    println("Byte = " + Byte.MinValue + " - " + Byte.MaxValue)
    println("Char = " + Char.MinValue + " - " + Char.MaxValue)
    println("Short = " + Short.MinValue + " - " + Short.MaxValue)
    println("Int = " + Int.MinValue + " - " + Int.MaxValue)
    println("Long = " + Long.MinValue + " - " + Long.MaxValue)
    println("Float = " + Float.MinValue + " - " + Float.MaxValue)
    println("Double = " + Double.MinValue + " - " + Double.MaxValue)


    var lgPrime = BigInt("622288097498926496141095869268883999563096063592498055290461")
    println("lgPrime = " + lgPrime)
    lgPrime += 1
    println("lgPrime = " + lgPrime)

    var pi50 = BigDecimal("3.14159265358979323846264338327950288419716939937510")
    println("pi50 = " + pi50)
    pi50 += 0.00000000000000000000000000000000000000000000000001
    println("pi50 = " + pi50)
    println("----------------------")
  }
}
