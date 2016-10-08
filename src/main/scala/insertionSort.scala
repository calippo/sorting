package object sorting {
  /**
    * Worst case: O(n²)
    * Best case: O(n) comparisons, O(1) swaps
    * Avg case: O(n²) comparisons, O(n) swaps
    * Worst case space: O(n) total, O(1) auxiliary
  **/
  def insertionSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    unsorted.foldLeft((Seq.empty[T], unsorted)) { (acc, cur) =>
      val (sortedPortion, unsortedPortion) = acc
      (insertInSortedPortion(cur, sortedPortion), unsortedPortion.tail)
    }._1
  }

  private[this] def insertInSortedPortion[T <% Ordered[T]](e: T, sortedPortion: Seq[T]): Seq[T] = {
    sortedPortion.foldLeft(Seq.empty[T]) { (acc, cur) =>
      if (e < cur) acc ++ Seq(cur)
      else acc.init ++ Seq(cur, e)
    }
  }
}
