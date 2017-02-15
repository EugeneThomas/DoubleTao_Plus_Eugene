/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/ 

public class MergeSortTester 

{
    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/

    public static void main( String[] args ) 
    {
	int[] one = new int[1]; 
        MergeSort.mess(one); 
        long begin = System.nanoTime();
	MergeSort.sort(one); 
        long end = System.nanoTime();
	System.out.println("Time for one: " + (end-begin)/1000.0);



	int[] ten = new int[10];
	MergeSort.mess(ten); 
        begin = System.nanoTime();
	MergeSort.sort(ten); 
        end = System.nanoTime();
	System.out.println("Time for ten: " + (end-begin)/1000.0); 



	int[] hun = new int[100]; 
	MergeSort.mess(hun); 
        begin = System.nanoTime();
	MergeSort.sort(hun); 
        end = System.nanoTime();
	System.out.println("Time for hundred: " + (end-begin)/1000.0);



	int[] thou = new int[1000]; 
	MergeSort.mess(thou); 
        begin = System.nanoTime();
	MergeSort.sort(thou); 
        end = System.nanoTime();
	System.out.println("Time for thousand: " + (end-begin)/1000.0);

	int[] tthou = new int[10000]; 
	MergeSort.mess(tthou); 
        begin = System.nanoTime();
	MergeSort.sort(tthou); 
        end = System.nanoTime();
	System.out.println("Time for ten-thousand: " + (end-begin)/1000.0);

	int[] hthou = new int[100000]; 
	MergeSort.mess(hthou); 
        begin = System.nanoTime();
	MergeSort.sort(hthou); 
        end = System.nanoTime();
	System.out.println("Time for hundred-thousand: " + (end-begin)/1000.0);

	int[] mil = new int[1000000]; 
	MergeSort.mess(mil); 
        begin = System.nanoTime();
	MergeSort.sort(mil); 
        end = System.nanoTime();
	System.out.println("Time for million: " + (end-begin)/1000.0);

	int[] mil0 = new int[10000000]; 
	MergeSort.mess(mil0); 
        begin = System.nanoTime();
	MergeSort.sort(mil0); 
        end = System.nanoTime();
	System.out.println("Time for hundred-thousand: " + (end-begin)/1000.0);

	int[] mil00 = new int[100000000]; 
	MergeSort.mess(mil00); 
        begin = System.nanoTime();
	MergeSort.sort(mil00); 
        end = System.nanoTime();
	System.out.println("Time for hundred-thousand: " + (end-begin)/1000.0);
    }//end main

}//end class
