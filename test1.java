import java.util.Scanner;

public class Test {
	public static String Reverse(String s) {
		String k="";
		for(int i=s.length()-1;i>=0;i--) {
	    	  k+=s.charAt(i);
	      }
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string=");
		Scanner Sc=new Scanner(System.in);	
      String s=Sc.nextLine();
      
      System.out.println("Reverse String="+Reverse(s));
	}

}
