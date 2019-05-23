package com.lifotech.scala.binaryMergeSort

/**
  * The object encapsulated methods related to the hiring assignment.
  * @author SK Singh
  */
object HiringAssignment {


  // Problem #1
  //
  // Write a function that returns an vector of all the prime numbers
  // up to the max specified by the argument.
  /**
    * The method returns list of prime numbers.
    *
    * @param max
    * @return { @link Vector} of prime numbers
    */
  def primeNumbers(max: Int): Vector[Integer] = (2 to max).filter((x: Int) => isPrime(x)).toVector.asInstanceOf[Vector[Integer]]


  /**
    * The method returns if the number is prime.
    * <p>
    * Two conditions must be true for a number to be a prime:
    * 1. It should be divisible by 1.
    * 2. It should be divisible by itself.
    * <p>
    * <p>
    * When a number is not a prime, it can be factored into two factors
    * as number = x * y.
    * <p>
    * To find if the number is prime, from 2 to the square root of the number, check if each  number can divide the input number.
    *
    * @param number
    * @return true if the number is prime otherwise return false.
    */
  private def isPrime(number: Int) = {
    if (number <= 1) false

    val range = 2 to Math.sqrt(number).toInt

    range.forall(n => number % n != 0)

  }

  // Problem #2
  //
  // Given two vectors of integers, find the intersection. Return the vector of
  // intersecting values.
  /**
    * The method returns intersetion of two collections.
    *
    * @param a1
    * @param a2
    * @return { @link Vector} intersection of two collections
    */
  def arrayIntersection(a1: Vector[Integer], a2: Vector[Integer]): Vector[Integer] = { // convert them into array
    val a1Array: Array[Integer] = a1.toArray
    val a2Array: Array[Integer] = a2.toArray
    if (a1Array.length > a2Array.length) getIntersection(a1Array, a2Array)
    else getIntersection(a2Array, a1Array)
  }

  private def getIntersection(a1Array: Array[Integer], a2Array: Array[Integer]): Vector[Integer] = {
    import scala.collection.mutable
    val intersectionElement: mutable.ArrayBuffer[Integer] = new mutable.ArrayBuffer[Integer]
    // merge sort(nlogn) the smaller array
    MergeSort.sort(a2Array.toList)

    // Search every element of bigger array in smaller array
    // and add the found into the  the element if found

    for (i <- 0 to a1Array.length - 1) {
      if (BinarySearchUtil.binarySearch(a2Array.toList, a1Array(i)).getOrElse(-1) != -1)
        intersectionElement.append(a1Array(i));
    }

    intersectionElement.toVector
  }


}
