package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class DataItem {
	//public String	subjectName; 	// data item: subject name as String
	public int node;
	public int num; 			// data item: grade as double
	public DataItem next; 
	public DataItem previous;
	

	// Constructor
	public DataItem(int num2,int data2)
	{
		//this.subjectName = subjectName; // initialize data
		this.num = num2;
		this.node = data2;
		
		// 'next' is automatically
		// set to null
	} 


	// Override: toString method
	public String toString() {
		return ("{"+ num +"} ");
	}
}
