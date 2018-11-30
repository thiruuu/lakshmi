import java.util.*;
public class ArrayUtoV {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int sum = 0;
int n = sc.nextInt();
int q = sc.nextInt();
int a[] = new int[n+1];
int u[] = new int[q+1];
int v[] = new int[q+1];
for ( int i = 1 ; i <= n ; i++){
a[i] = sc.nextInt();
}
for(int i = 1 ; i <= q ; i++){
u[i] = sc.nextInt();
v[i] = sc.nextInt();
}
for ( int i = 1 ; i <= q ; i++){
sum = 0;
for( int j = u[i]; j<=v[i] ; j++){
sum = sum + a[j];
}
System.out.println(sum);
}
}
}
