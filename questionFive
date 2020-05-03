import java.util.*;

public class questionFive {	
	public static void main(String[]args) {
		int i, j, zeroRow = -1;
		int[][] mtrx = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 9, 8, 5}, {0, 0, 0, 0}};
		int n = mtrx.length;
		System.out.println(mtrx.length);
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(mtrx[i][j] != 0) {
					break;
				} else if(j == n-1 && mtrx[i][j] == 0) {
					zeroRow = i;
					break;
				}
			}
		}
		if(zeroRow == -1) {
			System.out.println("No such row was found");
		} else {
			System.out.println("The row with all zeros is row " + (zeroRow + 1));
		}
	}
}
