
class Transaction {

   int trnsNum;
   int transTime;

   public Transaction() {
      trnsNum = 0;
      transTime = 0;
   }    
   public Transaction(int trnsNum, int transTime) {
      this.trnsNum = trnsNum;
      this.transTime = transTime;
   }

   public int getTransNum() {
      return trnsNum;
   }

   public int getTransTime() {
      return transTime;
   
   }

   public void setTransNum(int trnsNum) {
      this.trnsNum = trnsNum;
   }

   public void setTransTime(int transTime) {
      this.transTime = transTime;
   
   }

}
