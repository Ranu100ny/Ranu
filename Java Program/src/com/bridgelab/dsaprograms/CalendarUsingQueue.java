/******************************************************************************
 *  
 *  Purpose : To take date Input using SimpleDateFormat and make one Standard
 *            Format then after print Calendar Using Queue     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelab.utility.Queue;
import com.bridgelab.utility.Utility;

public class CalendarUsingQueue {
	public static void main(String[] args) {
		System.out.println();
		System.out.print("Enter the Month and Year in form [jan 2018] : ");
		Utility utility = new Utility();
		String dateInput = utility.inputString();

		SimpleDateFormat sdf = new SimpleDateFormat("MMM y");
		Date date = null;

		try {
			date = sdf.parse(dateInput);
		} catch (ParseException e) {
			System.out.println("Invalid date format ");
			System.exit(1);
		}

		int days;

		int start = date.getDay();
		int month = date.getMonth();
		int year = date.getYear() + 1900;

		boolean isPrime = Utility.checkLeapYear(year + "");

		Queue queue = new Queue();

		queue.insert(month);

		queue.insert(year);

		int mon = (int) queue.delete();
		int y = (int) queue.delete();

		String result = "";
		switch (mon) {
		case 0:
			String mon0 = "Jaunary";
			result = mon0;
			break;
		case 1:
			String mon1 = "february";
			result = mon1;
			break;
		case 2:
			String mon2 = "March";
			result = mon2;
			break;

		case 3:
			String mon3 = "April";
			result = mon3;
			break;

		case 4:
			String mon4 = "May";
			result = mon4;
			break;

		case 5:
			String mon5 = "June";
			result = mon5;
			break;

		case 6:
			String mon6 = "July";
			result = mon6;
			break;

		case 7:
			String mon7 = "August";
			result = mon7;
			break;

		case 8:
			String mon8 = "September";
			result = mon8;
			break;

		case 9:
			String mon9 = "October";
			result = mon9;
			break;

		case 10:
			String mon10 = "November";
			result = mon10;
			break;

		case 11:
			String mon11 = "December";
			result = mon11;
			break;

		default:
			System.out.println("Invalid Month");

		}

		System.out.println("******* " + result + " " + y + " ********");
		System.out.println("SUN MON TUE WED THU FRI SAT");
		if (mon == 0 || mon == 2 || mon == 4 || mon == 6 || mon == 7 || mon == 9 || mon == 11) {
			days = 31;
		} else if (month == 1) {
			if (isPrime)
				days = 29;
			else
				days = 28;
		} else {
			days = 30;
		}

		int j;
		for (j = 1; j <= start; j++)
			System.out.print("    ");
		for (int i = 1, startPoint = j; i <= days; i++, startPoint++) {
			if (startPoint == 7) {
				System.out.printf("%3d ", i);
				System.out.println();
				startPoint = 0;
			} else
				System.out.printf("%3d ", i);
		}
		System.out.println("\n");

	}
}
