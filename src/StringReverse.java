import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Sai Subrahmanyam
 * 09/11/2016
 * String Reverse Using RECURSIVE AND NON RECURSIVE*/
public class StringReverse {
	public static String withRecurrsion(String a) {

		if ((a == null) || (a.length() <= 1))
			return a;
		return withRecurrsion(a.substring(1)) + a.charAt(0);

	}

	public static String withOutRecurrsion(String a) {

		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String : ");
		String reading = br.readLine();

		System.out.println("\nCalling String Reverse With Recursion");
		long startTime = System.nanoTime();
		System.out.println("Reverse of a String is : " + withRecurrsion(reading));
		long stopTime = System.nanoTime();
		System.out.println(
				"Time taken for reversing a string with Recurrsion " + (stopTime - startTime) + " nanoseconds");
		System.out.println("\nCalling String Reverse WithOut Recursion");
		long startTime1 = System.nanoTime();
		System.out.println("Reverse of a String is : " + withOutRecurrsion(reading));
		long stopTime1 = System.nanoTime();
		System.out.println(
				"Time taken for reversing a string without Recurrsion " + (stopTime1 - startTime1) + " nanoseconds");

		System.out
				.println("\nString Reverse With Recursion by giving default input as \nsubbu subrahmanyam james kevin");
		long startTime2 = System.nanoTime();
		System.out.println("Reverse of a given above String is : " + withRecurrsion("subbu subrahmanyam james kevin"));
		long stopTime2 = System.nanoTime();
		System.out.println(
				"Time taken for reversing a string with Recurrsion " + (stopTime2 - startTime2) + " nanoseconds");
		System.out.println(
				"\nString Reverse WithOut Recursion by giving default input as \nsubbu subrahmanyam james kevin");
		long startTime3 = System.nanoTime();
		System.out
				.println("Reverse of a given above String is : " + withOutRecurrsion("subbu subrahmanyam james kevin"));
		long stopTime3 = System.nanoTime();
		System.out.println(
				"Time taken for reversing a string without Recurrsion " + (stopTime3 - startTime3) + " nanoseconds");
	}
}
