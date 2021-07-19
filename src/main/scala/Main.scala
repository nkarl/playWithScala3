//@main def hello: Unit = 
  //println("Hello world!")
  //println(msg)

//def msg = "I was compiled by Scala 3. :)"
import java.util.Scanner
import scala.util.Random

@main def printInts: Unit =
  print("\nEnter an upper bound to iterate: ")

  // don't use this,
  // because scala.StdIn.readInt doesn't know how to deal with space (\s)
  //Range(0, StdIn.readLine.toInt).map(x => println(x))

  val upperBound = {
    val scanner = new Scanner(System.in)
    scanner.nextInt()
  }
  val rnd = new Random
  val list = (1 to upperBound)
                .toList
                .map(_ * 0 + (rnd.nextGaussian * 10).toInt % 10)

  list.map(x => println(x))

