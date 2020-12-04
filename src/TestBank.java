
public class TestBank{
public static void main(String[] args){
   HDFCBank hdfc = new HDFCBank();
   hdfc.debit();
   hdfc.credit();
   hdfc.transfermoney();
   hdfc.getHDFCSpecificROI();
  
   Citibank citi = new Citibank();
   citi.debit();
   citi.credit();
   citi.transfermoney();
   citi.getMinBal();

   //we can point the classes implementing the interface to the interface object itself - then we have one object reference for both the citibank and HDFCBank classes and we can only access the common behavior of both the class which is nothing specified in the interface
  Bank b = new HDFCBank();
  b.debit();
  b.credit();
  b.transfermoney();
  //b.getHDFCSpecificROI(); //will not be accessible here sincewe  //are pointing to the interfac
  b = new Citibank();
   b.debit();
   b.credit();
   b.transfermoney();
  }
}