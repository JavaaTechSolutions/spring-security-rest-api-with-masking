package com.sc.javaswitchcase;

public class Java12SwitchExample {

	private static String switchcaseWithBreak(String day) {
		return switch (day) {
		case "Monday":
			yield "Weekday";
		case "Tuesday":
			yield "Weekday";
		case "Wednesday":
			yield "Weekday";
		case "Thursday":
			yield "Weekday";
		case "Friday":
			yield "Weekday";
		case "Saturday":
			yield "Weekend";
		case "Sunday":
			yield "Weekend";
		default:
			yield "Unknown";
		};
	}

	private static String arrowSwitchCase(String day) {
		return switch (day) {
		case "Monday" -> "Week day";
		case "Tuesday" -> "Week day";
		case "Wednesday" -> "Week day";
		case "Thursday" -> "Week day";
		case "Friday" -> "Week day";
		case "Saturday" -> "Weekend";
		case "Sunday" -> "Weekend";
		default -> "Unknown";
		};
	}

	private static String multipleIntoOne(String day) {
		return switch (day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Week day";
		case "Saturday", "Sunday" -> "Weekend";
		default -> "Unknown";
		};
	}

	public static void main(String[] args) {
		System.out.println(switchcaseWithBreak("Monday"));
		System.out.println(arrowSwitchCase("Sunday"));
		System.out.println(multipleIntoOne("Wednesday"));
	}
}
