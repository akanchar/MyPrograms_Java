/**
 * <h1>Prime Number</h1>
 * <p>
 * The Prime number class has functions that can return the first N prime numberes,
 * prime numbers between range 'a' and 'b', check if a number is prime or not.
 * </p>
 *
 * @author Abhilash Kancharla
 * @since 04-03-2018
 */
class PrimeNumber
{
  /**
   * @param numberToCheck Pass the number to checked for primeness
   * @return True or false based on whether the parameter received is Prime or not
   */
  boolean checkPrime(int numberToCheck)
  {
    // Returns false if the number if less than or equal to '1'
    // Returns true if the number is equal to '2' as it is the starting prime number
    if(numberToCheck <= 1)
      return false;
    else if(numberToCheck == 2)
      return true;
    // If number greater than '2', loops from '2' to 'number/2' to see if there are any
    // factors of the number. If yes, returns false as the number is not a prime.
    for(int i = 2; i < numberToCheck; i++)
    {
      if(numberToCheck % i == 0)
        return false;
    }
    // Returns true if none of the 'if' conditions are executed in the above for loop
    return true;
  }

  /**
   * @param numberOfPrimes The number of prime numbers needed
   * @return List of the first N prime numbers
   */
  int[] first_N_Primes(int numberOfPrimes)
  {
    int count = 0, startingNumber = 2;
    int[] firstNPrimes = new int[numberOfPrimes];
    // Return NULL on a negative parameter.
    if(numberOfPrimes <= 0)
      return null;

    while(count < numberOfPrimes)
    {
      // Count variable also acts as indexer to the firstNPrimes array as well as
      // keeping track of the total primes added to the array.
      if(checkPrime(startingNumber))
      {
        firstNPrimes[count] = startingNumber;
        count++;
      }
      startingNumber++;
    }
    return firstNPrimes;
  }
  int[] returnBetweenrimes(int rangeStart, int rangeEnd)
  {
    return null;
  }
}