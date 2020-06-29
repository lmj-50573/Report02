package report02;

import java.util.Scanner;

public class gugu {
   public static void main(String[] args) {
      
      int a;
      System.out.print("수 하나만 입력하시오: ");
      Scanner input = new Scanner(System.in);
      a = input.nextInt();
      
      for(int i = 1; i < 10; i++)
         System.out.println(a + "X" + i + " = " + a*i);
   }
}
