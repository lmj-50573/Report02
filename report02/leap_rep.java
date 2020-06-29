package report02;

import java.util.Scanner;

public class leap_rep {

public static void main(String[] args) {
   // TODO Auto-generated method stub
   int a;
   
   while(true){
      System.out.print("년도를 입력하시오 (0미만인 수 입력시 프로그램 종료) : ");
      Scanner input = new Scanner(System.in);
      
      a = input.nextInt();
      
      if(a<0)
         break;
      
      if(a%4 == 0)
         System.out.println(a+"년은 윤년입니다.");
      else
         System.out.println(a+"년은 평년입니다.");
      }
   }
}
