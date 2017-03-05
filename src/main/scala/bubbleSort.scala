package sorting

object bubble {
  def bubbleSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    unsorted.foldLeft((Seq.empty[T], unsorted)) { (acc, cur) =>
      val (sortedPortion, unsortedPortion) = acc
      (sortedPortion :+ unsortedPortion.min, unsortedPortion.tail)
    }._1
  }
}
