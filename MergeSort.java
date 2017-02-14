/*
Xing Tao Shi
APCS2 pd4
HW6 --  Step 1: Split, Step 2: ?, Step 3: Sorted!
2017-2-12
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  Split the array in half until they are 1 element arrays. This gaurentees that they are sorted. Then combine the two arrays that you gave out by comparing the first value of each array. Return the array to the one who gave you it after you are done sorting it. Rinse and repeat.

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int aVal = 0;
	int bVal = 0;
	int[] c = new int[a.length+b.length];
	for (int x = 0; x < a.length + b.length; x++) {
	    if (aVal == a.length) {
		c[x] = b[bVal];
		bVal ++;
	    }
	    else if (bVal == b.length) {
		c[x] = a[aVal];
		aVal ++;
	    }
	    else if (a[aVal] > b[bVal]) {
		c[x] = b[bVal];
		bVal ++;
	    }
	    else {
		c[x] = a[aVal];
		aVal ++;
	    }
	}
	return c;
		
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	if (arr.length == 1) {
	    return arr;
	}
	
	int[] firstHalf = new int[arr.length / 2];
	int[] secondHalf = new int[arr.length - firstHalf.length];
	int splitTracker = 0;
	
	for (int x = 0; x < firstHalf.length; x++) {
	    firstHalf[x] = arr[x];
	    splitTracker = x + 1;
	}

	for (int y = 0; y < secondHalf.length; y++) {
	    secondHalf[y] = arr[splitTracker];
	    splitTracker ++;
	}
	
	return merge(sort(firstHalf), sort(secondHalf));
    }//end sort()

    


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );

	printArray( sort( arr6 ) );

	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort

