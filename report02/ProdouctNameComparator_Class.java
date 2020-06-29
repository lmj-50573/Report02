package report02;

import java.util.Comparator;

   public class ProdouctNameComparator_Class implements Comparator<Prodouct>{
      public int compare(Prodouct p1, Prodouct p2) {
         String productName1 = p1.getProductName();
         String productName2 = p2.getProductName();
         
         return productName1.compareToIgnoreCase(productName2);
      }
}
