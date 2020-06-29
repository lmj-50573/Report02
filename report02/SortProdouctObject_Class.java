package report02;

import java.util.Arrays;

public class SortProdouctObject_Class {
   public static void main(String[] args) {
      Prodouct[] prodouct = new Prodouct[3];
      prodouct[0] = new Prodouct("A", 11);
      prodouct[1] = new Prodouct("B", 13);
      prodouct[2] = new Prodouct("C", 10);
      
      System.out.println("[compareTo sort productNum]");
      Arrays.sort(prodouct);
      printProduct(prodouct);
      
      System.out.println("[compare sort productName]");
      Arrays.sort(prodouct, new ProdouctNameComparator_Class());
      printProduct(prodouct);
   }
   
   public static void printProduct(Prodouct[] prodouct) {
      for(int i = 0; i < prodouct.length; i++)
         System.out.println(prodouct);
   }
}
