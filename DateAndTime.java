package introduction;

import java.util.*;
import java.text.*;

public class DateAndTimeExp {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();

		Date dt2 = new SimpleDateFormat("dd/MM/yyyy").parse(day + "/" + month + "/" + year);

		Calendar c = Calendar.getInstance();
		c.setTime(dt2);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		String dayName = "";
		//switch case for days of the week
		switch (dayOfWeek) {
		case Calendar.MONDAY:
			dayName = "MONDAY";
			break;
		case Calendar.TUESDAY:
			dayName = "TUESDAY";
			break;
		case Calendar.WEDNESDAY:
			dayName = "WEDNESDAY";
			break;
		case Calendar.THURSDAY:
			dayName = "THURSDAY";
			break;
		case Calendar.FRIDAY:
			dayName = "FRIDAY";
			break;
		case Calendar.SATURDAY:
			dayName = "SATURDAY";
			break;
		case Calendar.SUNDAY:
			dayName = "SUNDAY";
			break;
		}
		System.out.println(dayName);

	}
}

