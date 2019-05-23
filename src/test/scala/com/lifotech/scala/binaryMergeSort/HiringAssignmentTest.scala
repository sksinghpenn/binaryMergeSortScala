package com.lifotech.scala.binaryMergeSort

import org.scalatest.{FunSuite, Matchers}

class HiringAssignmentTest extends FunSuite with Matchers{

  test("isPrime") {
    val primes: Vector[Integer] = HiringAssignment.primeNumbers(10)

    primes should be (Vector(2,3,5,7))
  }

  test("arrayIntersection") {
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
    intersect should be (Vector(2,3,25))
  }
}
