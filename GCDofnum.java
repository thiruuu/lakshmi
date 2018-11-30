package fgcvb;
import java.util.Scanner;
import java.lang.*;
public class GCDofnum {
	public static void main(String[] args) 
    {
        System.out.println("Enter the no of switches:");
		int nu=0;
		int count=2;
		Scanner ip=new Scanner(System.in);
		nu=ip.nextInt();
		boolean switches[]=new boolean[n];
		for(int i=0;i<nu;i++){
			switches[i]=true;
					}
	switches[nu-1]=false;
		for(int j=nu-1;j>1;j--){
			if(switches[j]==false){
				switches[j-1]=true;
				count++;
				switches[j-2]=false;
				count++;
				}
			else if(switches[j]==true){
				switches[j]=false;count++;
				switches[j-1]=true;count++;
				switches[j-2]=false;count++;
			}
		}
		for(int i=1;i<nu-1;i++){
			switches[i+1]=true;count++;
			switches[i]=false;count++;
		}
		switches[nu-1]=false;
	System.out.println("Minimum switchings required to switch off all switches:"+count);
	}
}
