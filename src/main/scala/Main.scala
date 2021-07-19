//@main def hello: Unit = 
  //println("Hello world!")
  //println(msg)

//def msg = "I was compiled by Scala 3. :)"
import java.util.Scanner

@main def printInts: Unit =
  print("\nEnter an upper bound to iterate: ")
  //Range(0, StdIn.readLine.toInt).map(x => println(x))
  val upperBound = {
    val scanner = new Scanner(System.in)
    scanner.nextInt()
  }
  Range(0, upperBound).map(x => println(x + 1))

