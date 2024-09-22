package topic_1_arraylist_operations;
public class Main {
	public static void main(String[] args) {
		
		 ItemManager list = new ItemManager();

		 list.insertItem("Tristan");
		 list.insertItem("Onyl");
         list.insertItem("Bonifacio")
	     
		 list.displayItems();
	     
	     System.out.println();
	     list.updateItem(0, "blue");
	     list.updateItem(1, "White");
	     
	     System.out.println();
	     list.displayItems();
	     list.findItem("ds");
	     list.findItem("dk");
	     
	     System.out.println();
	     list.deleteItem(0);
	     list.displayItems();
	}
}