package com.lifotech.scala.binaryMergeSort

import scala.annotation.tailrec

/**
  * The utility class to which implements binary search.
  *
  * @author SK Singh
  *
  */

object BinarySearchUtil {

  /**
    * The method performs binary search to check if the value exist in the list.
    * @param list
    * @param valToSearch
    * @return  if found returns index of the element wraped in  Option otherwise returns None
    */
  def binarySearch(list: List[Integer], valToSearch: Int):Option[Int] = {
    @tailrec
    def binarySearchTailRec(low: Int, high: Int): Option[Int] = (low + high) / 2 match {

      case _ if high < low => None
      case mid if valToSearch < list(mid) => binarySearchTailRec(low, mid - 1)
      case mid if valToSearch > list(mid) => binarySearchTailRec(mid + 1, high)
      case mid => Some(mid)

    }

    binarySearchTailRec(0, list.size - 1)

  }
}