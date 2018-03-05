import static java.lang.System.out;
/**
 * <h1>Produces SHA 256 output for a given String</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * @author Abhilash Kancharla
 * @since 04-03-2018
 */

public class Sha256
{
    static final int sha_algo_number = 256;
    static final int initialPrimes = 8;
    static final int secondaryPrimes = 64;
    static final String inputString = "abc";
    public static void main(String[] args)
    {
      PrimeNumber primeNumber = new PrimeNumber();
      for (int i: primeNumber.first_N_Primes(10))
        out.println(i);
    }
    private static String[] fractionalPrimes(int numberOfPrimes, String root)
    {
        String[] primeInBits = new String[numberOfPrimes];
        return null;
    }
}
