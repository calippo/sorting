package sorting

object selection {
  def selectionSort[T <% Ordered[T]](unsorted: Seq[T]): Seq[T] = {
    unsorted.foldLeft((Seq.empty[T], unsorted)) { (acc, cur) =>
      val (sortedPortion, unsortedPortion) = acc
      //TODO improve efficiency of deletion here
      val remainingPortion = unsortedPortion diff List(unsortedPortion.min)
      (sortedPortion :+ unsortedPortion.min, remainingPortion)
    }._1
  }
}
