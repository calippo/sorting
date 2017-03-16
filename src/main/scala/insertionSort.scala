package sorting

object insertion {
  /**
    * Worst case: O(n²)
    * Best case: O(n) comparisons, O(1) swaps
    * Avg case: O(n²) comparisons, O(n) swaps
    * Worst case space: O(n) total, O(1) auxiliary
  **/
  def insertionSort[T <% Ordered[T]](unsorted: List[T]): List[T] = {
    insertionSortAux(List.empty[T], unsorted)
  }

  private[this] def insertionSortAux[T <% Ordered[T]](sorted: List[T], unsorted: List[T]): List[T] = {
    unsorted match {
      case Nil => sorted
      case head :: tail => insertionSortAux(insertInSortedList(head, sorted), tail)
    }
  }

  private[this] def insertInSortedList[T <% Ordered[T]](elem: T, sorted: List[T])(implicit ord: Ordering[T]): List[T] = {
    val (min, maj) = sorted.partition(ord.lt(_, elem))
    min ::: elem :: maj
  }
}
