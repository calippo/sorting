package sorting

object insertion {
  /**
    * Worst case: O(n²)
    * Best case: O(n) comparisons, O(1) swaps
    * Avg case: O(n²) comparisons, O(n) swaps
    * Worst case space: O(n) total, O(1) auxiliary
  **/
  def insertionSort[T <% Ordered[T]](unsorted: List[T]): List[T] = {
    val (sorted, _) = unsorted.foldLeft((List.empty[T], unsorted)) { (acc, cur) =>
      val (sortedPortion, unsortedPortion) = acc
      (insertInSortedList(cur, sortedPortion), unsortedPortion.tail)
    }

    sorted
  }

  private[this] def insertInSortedList[T <% Ordered[T]](elem: T, sortedPortion: List[T]): List[T] = {
    val ord = implicitly[Ordering[T]]
    val (min, maj) = sortedPortion.partition(ord.lt(_, elem))
    min ::: elem :: maj
  }
}
