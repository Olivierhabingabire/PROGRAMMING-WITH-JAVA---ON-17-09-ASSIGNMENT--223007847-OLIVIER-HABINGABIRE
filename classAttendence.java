package Classroom;

import java.util.Scanner;

public class classAttendence {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter total number of students in the class: ");
	        int totalStudents = input.nextInt();
	        int[] attendance = new int[30];
	        int dayCount = 0; 
	        String choice = null;
	        do {
	            if (dayCount >= 30) {
	                System.out.println("Maximum of 30 days reached.");
	                break;
	            }

	            System.out.print("Enter number of students present on Day " + (dayCount + 1) + ": ");
	            int present = input.nextInt();

	            // Validate input
	            if (present < 0 || present > totalStudents) {
	                System.out.println("Invalid input! Must be between 0 and " + totalStudents);
	                continue; // ask again for the same day
	            }

	            attendance[dayCount] = present;
	            dayCount++;

	            System.out.print("Do you want to enter attendance for another day? (yes/no): ");
	            choice = input.next();
	        } while (choice.equalsIgnoreCase("yes"));

	        // 3. After data entry: calculate summary
	        int totalPresent = 0;
	        int lowAttendanceDays = 0;

	        System.out.println("\n=== Attendance Report ===");
	        System.out.println("Day\tStudents Present");

	        for (int i = 0; i < dayCount; i++) {
	            System.out.println((i + 1) + "\t" + attendance[i]);
	            totalPresent += attendance[i];

	            // Check if attendance < 50% of total class size
	            if (attendance[i] < (totalStudents / 2.0)) {
	                lowAttendanceDays++;
	            }
	        }

	        // Average attendance
	     // Average attendance
	        double averageAttendance = (double) totalPresent / dayCount;

	     // Average attendance
	        double averageAttending = (double) totalPresent / dayCount;

	        // Percentage of low attendance days
	        double lowAttendancePercent = ((double) lowAttendanceDays / dayCount) * 100;

	        // Round to 2 decimal places for printing
	        double avgRounded = Math.round(averageAttending * 100.0) / 100.0;
	        double lowPercentRounded = Math.round(lowAttendancePercent * 100.0) / 100.0;

	        // 4. Print summary
	        System.out.println("\nTotal days recorded: " + dayCount);
	        System.out.println("Average attendance: " + avgRounded);
	        System.out.println("Days with low attendance (<50%): " + lowAttendanceDays);
	        System.out.println("Percentage of low attendance days: " + lowPercentRounded + "%");


	}
}
