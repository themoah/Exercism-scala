object SumOfMultiples {
  def sumOfMultiples(multiples: Set[Int], maxInt: Int): Int = {
    val result = for {
      x <- multiples
      i <- 1 to maxInt
      a = x * i
      if (a < maxInt)
    } yield a

    result sum
  }
}