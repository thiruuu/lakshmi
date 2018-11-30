
import java.util.*;
public class Triplets
{
    int find3Numbers(int A[], int arr_size, int sum) 
    {
        int l, r;
        for (int i = 0; i < arr_size - 2; i++) 
        {
            for (int j = i + 1; j < arr_size - 1; j++) 
            {
                for (int k = j + 1; k < arr_size; k++) 
                {
                    if (A[i] + A[j] + A[k] == sum) 
                    {
                        System.out.print(A[i] + " ," + A[j]+ " ," + A[k]);
                        return 1;
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Triplets triplet = new Triplets();
        int n=sc.nextInt();
        int A[] =new int[n]; 
        int sum =7;
        int arr_size = A.length;
    triplet.find3Numbers(A, arr_size, sum);
                
    }
}
