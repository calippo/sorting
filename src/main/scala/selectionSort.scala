package sorting

object selection {
  /**
    * Worst case: O(n²)
    * Best case: O(n²) comparisons
    * Avg case: O(n²) comparisons
    * Worst case space: O(n) total, O(1) auxiliary
  **/
  def selectionSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    unsorted.foldLeft((Seq.empty[T], unsorted)) { (acc, cur) =>
      val (sortedPortion, unsortedPortion) = acc
      val remainingPortion = unsortedPortion diff List(unsortedPortion.min)
      (sortedPortion :+ unsortedPortion.min, remainingPortion)
    }._1
  }
}
