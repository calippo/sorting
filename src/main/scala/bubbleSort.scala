package sorting

object bubble {
  /**
    * Worst case: O(n²)
    * Best case: O(n) comparisons
    * Avg case: O(n²) comparisons
    * Worst case space: O(1) auxiliary
  **/
  def bubbleSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    if (unsorted.length <= 1) unsorted
    else {
      val slidden = slideMaxToEnd(unsorted)
      bubbleSort(slidden.init) :+ slidden.last
    }
  }

  private[this] def slideMaxToEnd[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    val max = unsorted.max
    (unsorted diff List(max)) :+ max
  }
}
