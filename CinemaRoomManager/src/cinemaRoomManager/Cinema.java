package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
	
	final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows:");
		int row = scanner.nextInt();
		System.out.println("Enter the number of seats in each row:");
		int column = scanner.nextInt();
		char[][] seats = new char[row][column];
		makingCinemaRoom(column, seats);
		makingTicket(row, column, seats);
	}
		
	public static void makingCinemaRoom(int column, char[][] seats) {	
		
		System.out.println("Cinema:");
		
		for (char[] row: seats)
		    Arrays.fill(row, 'S');
		System.out.print("  ");

		for (int rn = 1; rn <= column; rn++) {                 // rn = row numbers
			System.out.print(rn + " ");
		}

		int cn = 0;                                            // cn = column numbers
		for (char[] r: seats) {               // r = row (of S)
			System.out.println();
			System.out.print(++cn + " ");
			for (char c: r) {          // c = column(of S)
				System.out.print(c + " ");
			}
		}
		System.out.println("\n");
		
	}

	public static void makingTicket(int row, int column, char[][] seats) {
		
		int ticketPrice = 0;
		final int sum = row * column;
		final int indication = 60;
		final int highPrice = 10;
		final int lowPrice = 8;
		
		System.out.println("Enter a row number:");
		int rB = scanner.nextInt();
		int rowBuy = rB - 1;
		System.out.println("Enter a seat number in that row:");
		int cB = scanner.nextInt();
		int columnBuy = cB - 1;
		int seatNumber = rowBuy * columnBuy;
		System.out.println("\n");
		seats[rowBuy][columnBuy] = 'B';
		
		if (sum <= indication) {
			ticketPrice = highPrice;
		} else if (sum > indication) {
			if (sum % 2 == 0) {
				if (seatNumber < sum / 2) {
					ticketPrice = highPrice;
				} else if (seatNumber > sum / 2) {
					ticketPrice = lowPrice;
				}
			} else if (sum % 2 != 0) {
				if (seatNumber < (sum - column) / 2) {
					ticketPrice = highPrice;
				} else if (seatNumber > (sum + column) / 2) {
					ticketPrice = lowPrice;
				}
			}
		}
			System.out.println("Ticket price: $" + ticketPrice + "\n");
			System.out.println("Cinema:");
			System.out.print("  ");

			for (int rn = 1; rn <= column; rn++) {                 // rn = row numbers
				System.out.print(rn + " ");
			}

			int cn = 0;                                            // cn = column numbers
			for (char[] r: seats) {               // r = row (of S)
				System.out.println();
				System.out.print(++cn + " ");
				for (char c: r) {          // c = column(of S)
					System.out.print(c + " ");
				}
			}
			System.out.println("\n");
	}
}
