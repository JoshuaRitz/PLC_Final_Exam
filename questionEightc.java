public class questionEight {
	public static void main(String[]args) {
		int j = -3, i = 0;
		do {
			if((j + 2) == 3) {
				j--;
			} else if((j + 2) == 2) {
				j--;
			} else if((j + 2) == 0) {
				j += 2;
			} else {
				j = 0;
				if(j <= 0) {
					j = 3 - i;
					System.out.println(i + "" + j);
				}
				i++;
			}
		} while(i < 3);
	}
}
