package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class BubbleSort {
	private int [] element;
	private int eSize;
	
	public BubbleSort(int size) {
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
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in] > this.element[in + 1]) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		// 
		int max = 1000;
		BubbleSort bubble = new BubbleSort(max);
		long t0,t1;
		Calendar cal0 = Calendar.getInstance();
		t0 = cal0.getTime().getTime();
		bubble.sort();
		Calendar cal1 = Calendar.getInstance();
		t1 = cal1.getTimeInMillis();

		
		System.out.println(t0);
		System.out.println(t1);
		System.out.println(t1-t0);
		// show original order
		System.out.print("Original Order: ");
		bubble.show();
		
		// sort and then show the result
		bubble.sort();
				
		System.out.print("Sorted Order: ");
		bubble.show();
	}
}
