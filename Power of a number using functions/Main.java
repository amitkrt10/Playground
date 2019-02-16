import java.util.Scanner;
class Main
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
   int base = in.nextInt();
   int exponent = in.nextInt();
   int pwr = power(base, exponent);
   System.out.println(pwr);
 }
  public static int power(int x, int y)
  {
   int p = 1;
    for(int i = 1; i <= y; i++)
      p = p * x;
    return p;
  }
}