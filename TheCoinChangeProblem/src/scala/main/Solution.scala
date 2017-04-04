object Solution {

  import io.StdIn.readLine

  def main(args: Array[String]): Unit = {


    // Read input from standard input:

    println("Enter two integers separated by a space.  The first is the value you want the coins to add up to.  The second is the number of different coins, each infinitely available.")
    val valueAndCoinListLengthText = readLine()
    println("Enter the integer values for each coin separated by a space.")
    val coinsText = readLine()

    // Get the inputs in a more easily usable form:

    // integer
    val goal = valueAndCoinListLengthText.split(" ").head.toInt

    // integer
    val numberOfCoins = valueAndCoinListLengthText.split(" ").last.toInt

    // array of integers representing coin values
    val coins = coinsText.split(" ").map(coinString => coinString.toInt)

    //println("goal: " + goal)
    //println("numberOfCoins: " + numberOfCoins)
    //println("coins: " + coins.mkString(" "))



  }

}