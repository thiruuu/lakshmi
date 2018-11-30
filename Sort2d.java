import java.util.Scanner;
import java.util.Arrays;

 class Sort2d {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r,c,j;
		r  = s.nextInt();
		c  = s.nextInt();
		int a[][] = new int[r][c];
		int arr[] = new int[15];
		for( int i = 0 ; i < r ; i++) {
			for ( j = 0 ; j < c; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for( int i = 0 ; i < r ; i++) {
			for ( j = 0 ; j < c; j++) {
				arr[j] = a[i][j];
			}
			for(int k = 0; k < c ;k++) {
				for(int l = k+1; l < c ;l++) {
					if(arr[k]>arr[l]) {
						int temp = arr[k];
						arr[k] = arr[l];
						arr[l] = temp;
					}
				}
			}
			for ( int j1 = 0 ; j1 < c; j1++) {
				a[i][j1] = arr[j1];
			}	
		}
		for( int i = 0 ; i < c ; i++) {
			for ( j = 0 ; j < r; j++) {
				arr[j] = a[j][i];
			}
			for(int k = 0; k < r ;k++) {
				for(int l = k+1; l < r ;l++) {
					if(arr[k]>arr[l]) {
						int temp = arr[k];
						arr[k] = arr[l];
						arr[l] = temp;
					}
				}
			}
			for ( int j1 = 0 ; j1 < r; j1++) {
				a[j1][i] = arr[j1];
			}	
		}
		for( int i = 0 ; i < r ; i++) {
			for ( int j1 = 0 ; j1 < c; j1++) {
				System.out.print(a[i][j1]+" ");
			}System.out.println();
		}
	
	}

}
