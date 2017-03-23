package introduction;

import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		// assigning pattern to be final
		final Pattern pattern = Pattern.compile("<([\\p{Print}&&[^<>]]+)>([\\p{Print}&&[^<>]]+)</\\1>");
		// if testcase is greater than zero
		while (testCases > 0) {
			final String line = in.nextLine();
			final Matcher m = pattern.matcher(line);
			if (m.find()) {
				System.out.println(m.group(2));
				while (m.find()) {
					System.out.println(m.group(2));
				}
			} else {
				System.out.println("None");
			}
			testCases--;
		}
	}
}

