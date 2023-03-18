package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        int[] winter = {12, 1, 2};
	int[] spring = {3, 4, 5};
	int[] summer = {6, 7, 8};
	int[] autumn = {9, 10, 11};
	for (int monthInt:winter) {
	    if (month == monthInt) {
		System.out.print("Winter");
	    }
	}
	for (int monthInt:spring) {
	    if (month == monthInt) {
		System.out.print("Spring");
	    }
	}
	for (int monthInt:summer) {
	    if (month == monthInt) {
		System.out.print("Summer");
	    }
	}
	for (int monthInt:autumn) {
	    if (month == monthInt) {
		System.out.print("Autumn");
	    }
	}
	if (month <= 0 || month >= 13) {
	    System.out.print("wrong number!");
	}
    }
}
