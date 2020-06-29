package report02;

public class Prodouct implements Comparable <Prodouct>{
	 private String prodouctName;
	   private int prodouctNum;
	   
	   public Prodouct(String productName, int productNum) {
	      this.prodouctName = productName;
	      this.prodouctNum = productNum;
	   }
	   
	   public String getProductName() {
	      return prodouctName;
	   }
	   
	   public int getProductNum() {
	      return prodouctNum;
	   }

	   @Override
	   public int compareTo(Prodouct compareProdouct) {
	      return this.prodouctNum - compareProdouct.prodouctNum;
	   }
	   
	   public String toString() {
	      return "prodouctName: " + prodouctName + ", prodouctNum: " + prodouctNum;
	   }
	}

