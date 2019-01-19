package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class SelectionSort {

	private int [] element;
	private int eSize;
	
	public SelectionSort(int size) {
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];

		eSize = 0;
	}
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}

	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		System.out.println("");

	}

	

	public void sort() {
		int out, in, min;
		for(out = 0; out < eSize-1; out++) {
			min = out;
			for(in = out+1; in < eSize; in++) {
				if(this.element[in] < this.element[min]) {
					min = in;
				}
			}
			this.swap(out, min);
		}
	}
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}

	public static void main(String[] args) {
		// 
		CodeTime time = new CodeTime();
		long avg = 0;
		long sum = 0;
		int total = 10;
		
		for(int i=0; i<=total; i++) {
			int max = 6000;
			SelectionSort selection = new SelectionSort(max);
			int rd = (int)(Math.random()* max );
			long t0,t1;
			for(int j=0; j < max; j++) {
				selection.insert((int)(Math.random()*max));
		}
		// show original order
			time.startTime();
		//Calendar cal0 = Calendar.getInstance();
		//t0 = cal0.getTime().getTime();
		selection.sort();
		//Calendar cal1 = Calendar.getInstance();
		//t1 = cal1.getTimeInMillis();
			time.stopTime();
		//System.out.print("Original Order: ");
		//selection.show();
		//System.out.print("  Sorted Order: ");
		//selection.show();
		//System.out.println(t0);
		//System.out.println(t1);
		//System.out.println(t1-t0);
			sum+=time.getActionTime();
		}
		avg = sum / total;
		System.out.println("Avg = " + avg);
}

}
