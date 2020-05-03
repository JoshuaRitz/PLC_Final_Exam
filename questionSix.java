public class questionSix {
	public static void main(String[]args) {
		//Test cases
		int first = 1, second = 2, third = 3;
		//int first = 2, second = 3, third = 1;
		//int first = 3, second = 1, third = 2;
		//int first = 1, second = 3, third = 2;
		//int first = 3, second = 2, third = 1;
		//int first = 2, second = 1, third = 3;
		int min = 0, mid = 0, max = 0;
		
		if(first > second) {
			if( first > third) {
				if(second > third) {
					min = third;
					mid = second;
					max = first;
				} else {
					min = second;
					mid = third;
					max = first;
				}
			} else {
				min = second;
				mid = first;
				max = third;
			}
		} else if(second > first) {
			if(second > third) {
				if(first > third) {
					min = third;
					mid = first;
					max = second;
				} else {
					min = first;
					mid = third;
					max = second;
				}
			} else {
				min = first;
				mid = second;
				max = third;
			}
		} else {
			min = second;
			mid = first;
			max = third;
		}
		
		
		
		System.out.println("min: " + min);
		System.out.println("mid: " + mid);
		System.out.println("max: " + max);
		System.out.println();
		
		//Test cases
		int first1 = 1, second1 = 2, third1 = 3;
		//int first1 = 2, second1 = 3, third1 = 1;
		//int first1 = 3, second1 = 1, third1 = 2;
		//int first1 = 1, second1 = 3, third1 = 2;
		//int first1 = 3, second1 = 2, third1 = 1;
		//int first1 = 2, second1 = 1, third1 = 3;
		int min1 = 0, mid1 = 0, max1 = 0;
		
		if(first1 < second1 && first1 < third1 && second1 < third1) {
			min1 = first1;
			mid1 = second1;
			max1 = third1;
		}
		if(first1 < second1 && first1 < third1 && third1 < second1) {
			min1 = first1;
			mid1 = third1;
			max1 = second1;
		}
		if(second1 < first1 && second1 < third1 && first1 < third1) {
			min1 = second1;
			mid1 = first1;
			max1 = third1;
		}
		if(second1 < first1 && second1 < third1 && third1 < first1) {
			min1 = second1;
			mid1 = third1;
			max1 = first1;
		}
		if(third1 < first1 && third1 < second1 && first1 < second1) {
			min1 = third1;
			mid1 = first1;
			max1 = second1;
		}
		if(third1 < first1 && third1 < second1 && second1 < first1) {
			min1 = third1;
			mid1 = second1;
			max1 = first1;
		}
		
		System.out.println("min: " + min1);
		System.out.println("mid: " + mid1);
		System.out.println("max: " + max1);
	}
}
