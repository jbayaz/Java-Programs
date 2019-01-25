/**
 * Date: 23-01-2019
 *
 * Reads a positive number from the standard input and prints the Collatz sequence
 * to the standard output until the sequence has reached 1.
 *
 * @author Jehanzeb Ayaz
 */

import java.util.*;
import java.math.*;

public class CollatzSequence {

	// f(n) in problem statement for 64-bit signed integers
	public static long function(long n)
	{
		assert(n > 0); // Tell compiler using assert keyword:java -ea CollatzSequence
		if ((n % 2) == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}

	// f(n) in problem statement for BigInteger
	public static BigInteger function(BigInteger n)
	{ // By convention, constants are named in all caps
		final BigInteger ZERO = BigInteger.valueOf(0);
		final BigInteger ONE = BigInteger.valueOf(1);
		final BigInteger TWO = BigInteger.valueOf(2);
		final BigInteger THREE = BigInteger.valueOf(3);

		assert(n.compareTo(ZERO) > 0); // Tell compiler using assert keyword:java -ea CollatzSequence

		if (n.mod(TWO).equals(ZERO)) {
			return n.divide(TWO);
		} else {
			return n.multiply(THREE).add(ONE);
		}
	}

	// prints sequence a_i to 1 for 64-bit signed integers
	public static void sequence(long n)
	{
		if (n == 1) {
			System.out.println(n);
		} else {
			System.out.print(n + " ");
			sequence(function(n));
		}
	}

	// prints sequence a_i to 1 for BigIntegers
	public static void sequence(BigInteger n)
	{
		final BigInteger ONE = BigInteger.valueOf(1);

		if (n.equals(ONE)) {
			System.out.println(n);
		} else {
			System.out.print(n + " ");
			sequence(function(n));
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) { // returns true if Scanner has another token in its input
			if (in.hasNextLong()) { // returns true if Scanner has another token of primitive type long in its input
				sequence(in.nextLong());
			} else if (in.hasNextBigInteger()) { // returns true if Scanner has another token of BigInteger class in its input
				sequence(in.nextBigInteger());
			} else {
				System.err.println("unexpected input: " + in.next());
				System.exit(1);
			}
		}
	}
} 
