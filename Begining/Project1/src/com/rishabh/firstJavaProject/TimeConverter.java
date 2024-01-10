package com.rishabh.firstJavaProject;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		int min = -1;
		if (hours >= 0) {
			min = hours * 60;
		}
		return min;
	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		int min = convertHoursToMinutes(days * 24);
		return min;
	}
}
