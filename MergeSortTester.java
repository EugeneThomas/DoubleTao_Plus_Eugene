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
        long begin = System.currentTimeMillis(); 
	MergeSort.sort(one); 
        long end = System.currentTimeMillis();
	System.out.println("Time for one: " + (end-begin));



	int[] ten = new int[10];
	MergeSort.mess(ten); 
        begin = System.currentTimeMillis();
	MergeSort.sort(ten); 
        end = System.currentTimeMillis();
	System.out.println("Time for ten: " + (end-begin)); 



	int[] hun = new int[100]; 
	MergeSort.mess(hun); 
        begin = System.currentTimeMillis();
	MergeSort.sort(hun); 
        end = System.currentTimeMillis();
	System.out.println("Time for hundred: " + (end-begin));



	int[] thou = new int[1000]; 
	MergeSort.mess(thou); 
        begin = System.currentTimeMillis();
	MergeSort.sort(thou); 
        end = System.currentTimeMillis();
	System.out.println("Time for thousand: " + (end-begin));



    }//end main

}//end class
