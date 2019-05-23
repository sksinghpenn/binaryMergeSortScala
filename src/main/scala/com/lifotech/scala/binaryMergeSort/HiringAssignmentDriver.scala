package com.lifotech.scala.binaryMergeSort

/**
  * This is a driver object to do some basic test.
  * The real tests are written in the test classes.
  *
  * @author SK Singh
  */
object HiringAssignmentDriver {

  def main(args: Array[String]): Unit = {
    System.out.println("Hello Java")

    // Problem 1
    val primes: Vector[Integer] = HiringAssignment.primeNumbers(100)
    System.out.println(primes)

    import scala.collection.mutable
    // Problem 2
    val inter1 = new mutable.ArrayBuffer[Integer]
    inter1.append(1);
    inter1.append(2);
    inter1.append(3)
    inter1.append(25)

    val inter2 = new mutable.ArrayBuffer[Integer]
    inter2.append(2)
    inter2.append(3)
    inter2.append(15)
    inter2.append(25)

    val intersect: Vector[Integer] = HiringAssignment.arrayIntersection(inter1.toVector, inter2.toVector)
    System.out.println(intersect)
  }

}
