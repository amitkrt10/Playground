import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t = n;
      int dc = 0;
      while(t != 0)
      {
        t = t / 10;
        dc++;
      }
      int r;
      int sum = 0;
      while(dc != 0)
      {
        r = n % 10;
        n = n / 10;
        dc--;
        sum = sum + r;
      }
      System.out.println(sum);
	}
}