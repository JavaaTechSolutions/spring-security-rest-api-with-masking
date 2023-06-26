package com.sc.javaswitchcase;

public class SwitchCaseExample {

	enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	private static void java7SwitchCase() {
		int value = 5;
		switch (value) {
		case 1:
			System.out.println("One");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Unknown");
		}
	}

	private static void java8SwitchCase() {
		String day = "Tuesday";
		switch (day) {
		case "Monday":
			System.out.println("Week day");
			break;
		case "Tuesday":
			System.out.println("Week day");
			break;
		case "Wednesday":
			System.out.println("Week day");
			break;
		case "Thursday":
			System.out.println("Week day");
			break;
		case "Friday":
			System.out.println("Week day");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Unknown");
		}
	}

	private static void java8WithEnum() {
		DAYS days = DAYS.SUNDAY;
		switch (days) {
		case MONDAY:
			System.out.println("Weekdays");
			break;
		case TUESDAY:
			System.out.println("Weekdays");
			break;
		case WEDNESDAY:
			System.out.println("Weekdays");
			break;
		case THURSDAY:
			System.out.println("Weekdays");
			break;
		case FRIDAY:
			System.out.println("Weekdays");
			break;
		case SATURDAY:
			System.out.println("Weekends");
			break;
		case SUNDAY:
			System.out.println("Weekends");
			break;
		default:
			System.out.println("Unknown");
		}
	}

	public static void main(String[] args) {
		java7SwitchCase();
		java8SwitchCase();
		java8WithEnum();
	}
}
