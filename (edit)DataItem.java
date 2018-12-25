package th.ac.utcc.eng.cpe.nc252.linkedlist;
//edit 26/12/61
public class DataItem {
	//public String	subjectName; 	// data item: subject name as String
	public int node; // size
	public int num; 			// data item: grade as double
	public DataItem next; 
	public DataItem previous;
	

	// Constructor
	public DataItem(int num)
	{
		//this.subjectName = subjectName; // initialize data
		this.num = num;
		
		
		// 'next' is automatically
		// set to null
	} 


	// Override: toString method
	public String toString() {
		return ("{"+ this.num +"} " + "{"+this.node+"} " );
	}
}
