package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedListApp {

	public LinkedListApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		DataItem item1 = new DataItem(6);
		DataItem item2 = new DataItem(5);
		DataItem item3 = new DataItem(4);
		DataItem item4 = new DataItem(3);
		DataItem item5 = new DataItem(2);
		DataItem item6 = new DataItem(1);
		DataItem item7 = new DataItem(0);
		
		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);
		linkedList.insertFirst(item5);
		linkedList.insertFirst(item6);
		linkedList.insertFirst(item7);
		

		
		
		System.out.println("Number");
		linkedList.displayList();
		
		
		
		
			
				for(int i = 1; i<=7;i++) {
				DataItem D = linkedList.deleteFirst(4);
				linkedList.setSize();
				System.out.println("\nAfter deleteFirst"+"("+i+")");
				linkedList.displayList();
				} 
				
				
				/*linkedList.setSize();
		System.out.println("\nAfter deleteFirst()#1");
		linkedList.displayList();*/
	



		//linkedList.deleteFirst();
		//System.out.println("\nAfter deleteFirst()#2");
		//linkedList.displayList();*/
	}

}