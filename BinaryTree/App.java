package th.ac.utcc.cpe.BinaryTree;

public class App {
	public static void main (String args[]) {
	TreeStudent test = new TreeStudent();
 
 test.insert(10,"pakkarapol","Math","NC222");
 test.insert(5,"pang","Math","NC222");
 test.insert(20,"Mind","Math","NC222");	
 test.insert(1,"Wararat","Math","NC222");	
	
 
 
 test.DisplayinOrder(test.getRoot());
System.out.println("----------------------------------");
	test.delete(10);
	 test.DisplayinOrder(test.getRoot());
	}
}