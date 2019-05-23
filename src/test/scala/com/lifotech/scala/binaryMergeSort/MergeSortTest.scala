package com.lifotech.scala.binaryMergeSort

import org.scalatest.{FunSuite, Matchers}

class MergeSortTest extends FunSuite with Matchers{

  test("list1(List(1,3,5,10); verify that list is sorted") {

    val list1 = List(1, 5, 10, 7).asInstanceOf[List[Integer]]
    val sortedList = MergeSort.sort(list1)

    sortedList should be(List(1,5,7,10))

  }

  test("list1(List.empty; verify that list  as empty") {

    val list1 = List.empty.asInstanceOf[List[Integer]]
    val sortedList = MergeSort.sort(list1)

    sortedList should be(List.empty)

  }
}
