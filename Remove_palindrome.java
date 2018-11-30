import java.util.*;
public class Remove_palindrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		ArrayList<String>  al1=new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length()+1;j++) {
				String st1=str.substring(i, j);
				al1.add(st1);
			}
		}
		ArrayList<String> al2=new ArrayList<String>();
		for(int i=0;i<al1.size();i++) {
			StringBuffer sb=new StringBuffer();
			sb.append(al1.get(i));
			String temp1=sb.reverse().toString();
			String temp2=al1.get(i);
			if(temp1.equals(temp2)){
				al2.add(temp2);
			}
		}
		
		int ao[]=new int[al2.size()];
		for(int i=0;i<al2.size();i++) {
			ao[i]=al2.get(i).length();
		}
		Arrays.sort(ao);
		int hig= ao[ao.length-1];
		String ans="";
		for(int i=0;i<al2.size();i++) {
			if(hig==al2.get(i).length()) {
				ans=al2.get(i);
			}
			
		}
		String stt=str.replace(ans, "");
		System.out.println(stt.length());
	}

}
