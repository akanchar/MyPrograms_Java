import static java.lang.System.out;
/**
 * <h1> SHA 256 </h1>
 * <p>
 *   Produces SHA 256 for a given string
 * </p>
 *
 * @author Abhilash Kancharla
 * @since 04-03-2018
 */
// Incomplete
public class Sha256
{
    static final int sha_algo_number = 256;
    static final int initialPrimes = 8;
    static final int secondaryPrimes = 64;
    static final String inputString = "abc";
    public static void main(String[] args)
    {
      PrimeNumber primeNumber = new PrimeNumber();
      for (int i: primeNumber.rangedPrimes(2,110))
        out.println(i);
    }
}
