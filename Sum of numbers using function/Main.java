import java.util.Scanner;
class Main
{
  public static int son(int x)
  {
   int sum = 0;
    for(int i = 1; i <=x; i++)
      sum = sum + i;
    return sum;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = son(n);
      System.out.println(sum);
	} 
}