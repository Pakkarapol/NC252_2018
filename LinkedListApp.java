package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedListApp {

	public LinkedListApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		DataItem item1 = new DataItem(1,1);
		DataItem item2 = new DataItem(3,2);
		DataItem item3 = new DataItem(5,3);
		DataItem item4 = new DataItem(7,4);
		DataItem item5 = new DataItem(9,5);
		DataItem item6 = new DataItem(10,6);
		DataItem item7 = new DataItem(13,7);
		
		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);
		linkedList.insertFirst(item5);
		linkedList.insertFirst(item6);
		linkedList.insertFirst(item7);
		

		
		
		System.out.println("Number");
		linkedList.displayList();
		
		
		
		
			DataItem A =linkedList.find(4);
			if(A!=null)
				System.out.println("Found It");
			
				DataItem D = linkedList.deleteFirst(1);
				if(D!=null)
					System.out.println("Found It" + D.node);
			
		
		
		System.out.println("\nAfter deleteFirst()#1");
		linkedList.displayList();
		
		//linkedList.deleteFirst();
		//System.out.println("\nAfter deleteFirst()#2");
		//linkedList.displayList();*/
	}

}
