package com.rishabh.firstJavaProject;

public class MultiplicationTable {
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
	}

	void print(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}

	void print(int number, int from, int to) {
		if (from < to) {
			for (int i = from; i <= to; i++) {
				System.out.printf("%d * %d = %d", number, i, number * i).println();
			}
		} else {
			System.out.println("Invalid \"FROM\" and \"TO\" value. \"From\" value should be less than \"to\" value");
		}
	}

}
