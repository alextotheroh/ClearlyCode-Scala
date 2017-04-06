object Solution {

  import io.StdIn.readLine

  def main(args: Array[String]): Unit = {

    // Read input from standard input:

    println("Enter two integers separated by a space.  The first is the value you want the coins to add up to.  The second is the number of different coins, each infinitely available.")
    val valueAndCoinListLengthText = readLine()
    println("Enter the integer values for each coin separated by a space.")
    val coinsText = readLine()

    // Get the inputs in a more easily usable form:

    // long
    val goal = valueAndCoinListLengthText.split(" ").head.toLong

    // integer
    val numberOfCoins = valueAndCoinListLengthText.split(" ").last.toInt

    // array of longs representing coin values
    val coins = coinsText.split(" ").map(coinString => coinString.toLong)

    // verify
    //println("goal: " + goal)
    //println("numberOfCoins: " + numberOfCoins)
    //println("coins: " + coins.mkString(" "))

    // We'll solve the actual problem using dynamic programming

    // The element at solutionsTable[i] represents the number of solutions for the value i.
    // The 'goal' variable above contains our desired sum. So we will need
    // an array of length 'goal' items (plus one since we start our table at zero).
    val solutionsTable = Array.fill((goal+1).toInt)(0.toLong)

    // How many ways are there to select coins that add up to zero?
    // Well, no matter what coins we have, there is one way. You take no coins.
    // So we'll initialize our table with one.

    solutionsTable(0) = 1.toLong

    // Now, we build up the solutions, using previous solutions to find new ones.
    // In this way, we ensure that we don't duplicate work.

    for (i <- 0 until numberOfCoins) {
      for (j <- coins(i).toInt to goal.toInt) {
        solutionsTable(j) += solutionsTable(j - coins(i).toInt)
      }
    }

    println(solutionsTable(goal.toInt))

    // How would we write what's happening in those for loops in english?

  }

}