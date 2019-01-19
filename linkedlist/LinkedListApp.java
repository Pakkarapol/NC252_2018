package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedListApp {


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

 DataItem Current = linkedList.first;	
 	while(linkedList.first != linkedList.last){
  		for(int i = 0;i<=3;i++) {
			Current = Current.next;
 		
			
 		}
			
 			
	
				//linkedList.setSize();
		
		linkedList.deleteFirst(Current.num);
		Current = Current.next;
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
