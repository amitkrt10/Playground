import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int dc = 0;
      int sum = 0;
      while(temp != 0)
      {
       temp = temp / 10;
        dc++;
      }
      temp = n;
      for(int i = 1; i <= dc; i++)
      {
        int r = temp % 10;
        int p = 1;
        int j = 1;
        while(j <=dc)
        {
         p = p * r;
          j++;
        }
        sum = sum + p;
        temp = temp / 10;
      }
      if(sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}