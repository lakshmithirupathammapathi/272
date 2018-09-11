import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(s.length()>1){
            System.out.print(s.charAt(1));
            System.out.print(s.charAt(0));
            s = s.substring(2);
        }
        System.out.println(s);
	}
}
