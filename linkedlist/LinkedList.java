package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedList {
	public DataItem first,last;
	
	//private int size =6;

	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(DataItem newDataItem) {
		DataItem Newlink = newDataItem;
		Newlink.next = this.first ;
		if(Newlink.next == null)
   	 {
   	 this.last = Newlink;
   	 }
	else first.previous = Newlink ;
	
	this.first = Newlink;
	last.next =this.first;

} 
		
	

	public void deleteFirst(int key) {
		DataItem Current = this.first;
		DataItem Previous = this.first;
		while(Current.num != key) { 
			if(Current.next == null)
				System.out.println("null");
			else
			{
					Previous = Current;
					Current = Current.next;
			}
		}	
		if(Current == this.first) {
			System.out.println("Just Delete number:"+Current.num);
			this.first = Current.next;
			last.next = first;
			first.previous = null;
	}
		else if(Current == this.last){
			System.out.println("Just Delete number:"+Current.num);
			this.last = last.previous;
			this.last.next = this.first;
		
		}

 else {
	 System.out.println("Just Delete number:"+Current.num);
	 Current.previous.next = Current.next;
		Current.next.previous = Current.previous;
 }
}	
	/*public DataItem find(int key) {
		DataItem Current = first;
		DataItem Previous = first;
		while(Current.num != key) { 
			if(Current.next == null)
				return null;
		else
			{
					//Previous = Current;
					Current = Current.next;
			}
		}	
		if(Current == first) 
			first = first.next;
		else
			Previous.next = Current.next;
		return Current;
		}*/
	
	
	//public int getSize() {
		//return this.size;
	//}
	
	/*public void setSize() {
		DataItem current = first;
		size=0;
		while( current != null ) {
			current.node = size;
			size++;
			current = current.next;	
		}*/
		
	

	
	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while( current != this.last) {
			System.out.println(current);
			current = current.next;
		}
		System.out.println(current);
	}

}