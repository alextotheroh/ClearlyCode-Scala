object Solution {

  def main(args: Array[String]): Unit ={
    val numberOfChildren: Int = scala.io.StdIn.readInt()

    // we'll keep one array for the ratings and one for the
    // number of candies per child
    val ratings: Array[Long] = Array.fill(numberOfChildren)(0.toLong)
    val candies: Array[Long] = Array.fill(numberOfChildren)(1.toLong)

    for (i <- 1 to numberOfChildren) {
      ratings(i-1) = scala.io.StdIn.readInt()
    }

    // We can solve this one by looping through the ratings
    // twice: once forward and once backward, setting the
    // number of candies appropriately

    for (i <- 1 to numberOfChildren-1) {
      if (ratings(i) > ratings(i-1)) {
        candies(i) = candies(i-1)+1
      }
    }

    for (j <- (0 to numberOfChildren-2).reverse) {
      if (ratings(j) > ratings(j+1)) {
        candies(j) = Math.max(candies(j), candies(j+1)+1)
      }
    }

    println(candies.sum)

  }

}
