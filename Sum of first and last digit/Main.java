import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t = n;
      int ld = n % 10;
      int dc = 0;
      while(t != 0)
      {
        t = t / 10;
        dc++;
      }
      int temp = 1;
      while(dc != 1)
      {
        temp = temp * 10;
        dc--;
      }
      int fd = n / temp;
      int sum = fd + ld;
      System.out.println(sum);
	}
}