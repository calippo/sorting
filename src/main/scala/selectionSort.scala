package sorting

object selection {
  /**
    * Worst case: O(n²)
    * Best case: O(n²) comparisons
    * Avg case: O(n²) comparisons
    * Worst case space: O(n) total, O(1) auxiliary
  **/
  def selectionSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    unsorted match {
      case Nil => Nil
      case nonEmptyList =>
        val min = unsorted.min
        min +: selectionSort(unsorted diff List(min))
    }
  }
}
