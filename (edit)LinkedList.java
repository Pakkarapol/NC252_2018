package th.ac.utcc.eng.cpe.nc252.linkedlist;
// edit 26/12/61
public class LinkedList {
	private DataItem first;
	private int size =6;

	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(DataItem newDataItem) {
		newDataItem.next = first;
		first= newDataItem;
		first.node = this.size;
		size--;
	}

	public DataItem deleteFirst(int key) {
		DataItem Current = first.next;
		DataItem Previous = first;
		while(Current.node != key) { 
			if(Current.next == null)
				return null;
			else
			{
					Previous = Current;
					Current = Current.next;
			}
		}	
		if(Current == first) 
			first = first.next;
		else
			Previous.next = Current.next;
		return Current;
		
		}
	
	public DataItem find(int key) {
		DataItem Current = first;
		DataItem Previous = first;
		while(Current.node != key) { 
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
		}
	
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize() {
		DataItem current = first;
		size=0;
		while( current != null ) {
			current.node = size;
			size++;
			current = current.next;			
		}
	}

	
	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while( current != null ) {
			System.out.println(current);
			current = current.next;
		}
	}

}
