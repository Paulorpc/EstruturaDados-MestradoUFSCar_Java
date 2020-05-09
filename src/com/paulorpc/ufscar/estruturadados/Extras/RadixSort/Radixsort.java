package com.paulorpc.ufscar.estruturadados.Extras.RadixSort;


public class Radixsort {
	
	public static void sort(int[] v){
		
	    int RADIX = 10;
	    boolean maxLength = false;
	    int tmp = -1;
	    int placement = 1;
	
	    while (!maxLength) {
	
	        maxLength = true;
	
	        // declare and initialize buckets
	        int buckets[] = new int[RADIX];
	
	        // split v between lists
	        for (int i=0; i<v.length; i++) {
	            tmp = i / placement;
	            buckets[tmp % RADIX] = i;
	
	            if (maxLength && tmp > 0)
	                maxLength = false;
	        }
	
	        // empty lists into v array
	        int bucket[] = new int[RADIX];
	        for (int i=0; i<RADIX; i++) {
	            bucket[i] = buckets[i];
	
	            for (int j=0; j<bucket.length; j++)
	                v[j++] = i;
	        }
	
	        // move to next digit
	        placement *= RADIX;
	    }

	
	}
}