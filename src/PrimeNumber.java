import java.util.ArrayList;

/**
 * <h1>Prime Number</h1>
 * <p>
 * The Prime number class has functions that can return the first N prime numbers,
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

  /**
   *
   * @param rangeStart Starting number range (included)
   * @param rangeEnd Ending number range (included)
   * @return Returns the total prime numbers in between the given range of numbers
   */
  int[] rangedPrimes(int rangeStart, int rangeEnd)
  {
    int[] primeNumbers;
    ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();

    // Returns NULL if either is negative OR if rangeEnd is less than rangeStart
    if(rangeEnd < 0 || rangeStart < 0 || rangeEnd < rangeStart)
      return null;

    for(int i = rangeStart; i <= rangeEnd; i++)
      if(checkPrime(i))
        primeNumbersList.add(i);

    // Initialize the Array
    primeNumbers = new int[primeNumbersList.size()];
    for (int i = 0; i < primeNumbersList.size(); i++)
      primeNumbers[i] = primeNumbersList.get(i);
    return primeNumbers;
  }
}
