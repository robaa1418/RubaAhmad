class Item {

   char type;
   char item;
   Transaction T;

   public Item()
   {
      type = ' ';
      item = ' ';
      Transaction T = new Transaction(0,0);
   }
   public Item(char type, char item, Transaction T) {
      this.type = type;
      this.item = item;
      this.T = new Transaction(T.getTransNum(), T.getTransTime());
   }

   public char gettype() {
      return type;
   }

   public char getItem() {
      return item;
   }


   public Transaction getT() {
      return T;
   }



}
