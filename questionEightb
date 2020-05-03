#import <stdio.h>

int main() {
	int i, j;
	j = -3;
	i = 0;
	
	for(i = 0; i < 3; i++) {
		if((j + 2) == 3) {
			goto B;
		} else if((j + 2) == 2) {
			goto B;
		} else if((j + 2) == 0) {
			goto C;
		} else {
			j = 0;
		}
		if(j > 0) goto end;
		j = 3 - i;
		printf("%d %d\n",i,j);
		B: j--;
		C: j += 2;
	}
	end: return 0;
}
