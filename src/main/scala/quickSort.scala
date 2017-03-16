package sorting

object quick {
  /**
    * Worst case: O(n²)
    * Best case: O(n logn) comparisons
    * Avg case: O(n logn) comparisons
    * Worst case space: O(n) auxiliary
  **/
  def quickSort[T <% Ordered[T]](unsorted: List[T])(implicit ord: Ordering[T]): List[T] = {
    if (unsorted.isEmpty) return unsorted

    val pivot = unsorted.last
    val (min, maj) = (unsorted diff List(pivot)).partition(ord.lt(_, pivot))
    quickSort(min) ::: pivot :: quickSort(maj)
  }
}
