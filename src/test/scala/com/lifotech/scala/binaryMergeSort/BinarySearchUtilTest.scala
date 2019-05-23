package com.lifotech.scala.binaryMergeSort

import org.scalatest.{FunSuite, Matchers}

/**
  * Test class for the {@link BinarySearchUtil} class
  */

class BinarySearchUtilTest extends FunSuite with Matchers {


  test("list1(List(1,3,5,10); verify that 5 exist") {

    val list1 = List(1, 3, 5, 10).asInstanceOf[List[Integer]]
    val found = BinarySearchUtil.binarySearch(list1, 5)

    found should be(Some(2))

  }

  test("list1(List(1,3,5,10); verify that 6 does not exist") {

    val list1 = List(1, 3, 5, 10).asInstanceOf[List[Integer]]
    val found = BinarySearchUtil.binarySearch(list1, 6)

    found should be(None)

  }


}