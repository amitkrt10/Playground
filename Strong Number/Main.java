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
        int fac = 1;
        for(int j = 1; j <= r; j++)
          fac = fac * j;
        sum = sum + fac;
        temp = temp / 10;
      }
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}