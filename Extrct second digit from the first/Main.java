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
      int temp = 1;
      while(dc != 2)
      {
        temp = temp * 10;
        dc--;
      }
      int fd = n / temp;
      int sd = fd % 10;
      System.out.println(sd);
	}
}