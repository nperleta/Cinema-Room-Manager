package cinemaRoomManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("Cinema:");
		char[][] seats = { 
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				{ 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' },
				};

		System.out.print("  ");

		for (int rn = 1; rn < 9; rn++) {                // rn = row numbers
			System.out.print(rn + " ");
		}

		int cn = 0;                                     // cn = column numbers
		for (int r = 0; r < seats.length; r++) {        // r = row (of S)
			System.out.println();
			System.out.print(++cn + " ");
			for (int c = 0; c <= seats.length; c++) {   // c = column(of S)
				System.out.print(seats[r][c] + " ");
			}
		}
	}
}
