package com.lifotech.scala.binaryMergeSort

/**
  * The object encapsulated merge sort functionality.
  */
object MergeSort {

  /**
    * The method sorts a list.
    *
    * @param list
    */
  def  sort(list: List[Integer]): List[Integer] = mergeSort(list);



  private def mergeSort(list: List[Integer]): List[Integer] = {
    // get the mid
    val mid = list.length / 2

    // means list is empty or just one element
    if (mid == 0) list
    else {
      // split the list into left and right from the mid
      val (left, right) = list.splitAt(mid)
      // merge the left side of the list and right side of the list
      merge(mergeSort(left), mergeSort(right))
    }
  }


  private def merge(left: List[Integer], right: List[Integer]): List[Integer] =

    (left, right) match {

      case (left, Nil) => left // if right side of the list is empty
      case (Nil, right) => right // if left list is enpty
      case (leftHead :: leftTail, rightHead :: rightTail) =>
        // merge it recursively
        if (leftHead < rightHead) leftHead :: merge(leftTail, right)
        else rightHead :: merge(left, rightTail)
    }
}
