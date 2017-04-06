object Solution {

  def main(args: Array[String]): Unit ={
    val numberOfChildren: Int = scala.io.StdIn.readInt()
    val ratings: Array[Int] = Array.fill(numberOfChildren)(0)

    for (i <- 1 to numberOfChildren) {
      ratings(i-1) = scala.io.StdIn.readInt()
    }

    //verify
    //println(ratings.mkString(" "))
  }

}
