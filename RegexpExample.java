package introduction;

import java.util.Scanner;

class RegexpExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// getting the ip address from the user
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}
}

// class for ip pattern
class MyRegex {
	String pattern = "(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";
}

