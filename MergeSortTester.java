/*======================================
  class MergeSortTester

  ALGORITHM:
  Split the array in half until they are 1 element arrays. This guarantees that the arrays are sorted. Then combine the two arrays that are recieved by comparing the first value of each array. Return the array after  sorting it. Rinse and repeat until you have a sorted array. 


  BIG-OH CLASSIFICATION OF ALGORITHM: nlog(n)

  Mean execution times for dataset of size n:
  Batch size: 4
  n=1            time: 0.50975 
  n=10           time: 11.22800
  n=100          time: 118.66999
  n=1,000        time: 306.07849
  n=10,000       time: 2820.663
  n=100,000      time: 15178.66499
  n=1,000,000    time: 134361.51275
  n=10,000,000   time: 1149694.99275
  n=100,000,000  time: 1.29494E7

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
	double time1 = 0.0;
       

        MergeSort.mess(one); 
        long begin = System.nanoTime();
	MergeSort.sort(one); 
        long end = System.nanoTime();
	time1 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(one); 
        end = System.nanoTime();
	time1 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(one); 
        end = System.nanoTime();
	time1 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(one); 
        end = System.nanoTime();
	time1 += (end-begin)/1000.0;

	System.out.println("Time for one: " + time1/4.000);
	


	int[] ten = new int[10];
	double time10 = 0.0;

	MergeSort.mess(ten); 
        begin = System.nanoTime();
	MergeSort.sort(ten); 
        end = System.nanoTime();
	time10 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(ten); 
        end = System.nanoTime();
	time10 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(ten); 
        end = System.nanoTime();
	time10 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(ten); 
        end = System.nanoTime();
	time10 += (end-begin)/1000.0;

	System.out.println("Time for ten: " + time10/4.0);
	


	int[] hun = new int[100]; 
	double time100 = 0.0;

	MergeSort.mess(hun); 
        begin = System.nanoTime();
	MergeSort.sort(hun); 
        end = System.nanoTime();
	time100 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(hun); 
        end = System.nanoTime();
	time100 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(hun); 
        end = System.nanoTime();
	time100 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(hun); 
        end = System.nanoTime();
	time100 += (end-begin)/1000.0;

	System.out.println("Time for hundred: " + time100/4.0);


	int[] thou = new int[1000];
	double time1000 = 0.0;
	
	MergeSort.mess(thou); 
        begin = System.nanoTime();
	MergeSort.sort(thou); 
        end = System.nanoTime();
	time1000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(thou); 
        end = System.nanoTime();
	time1000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(thou); 
        end = System.nanoTime();
	time1000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(thou); 
        end = System.nanoTime();
	time1000 += (end-begin)/1000.0;

	System.out.println("Time for thousand: " + time1000/4.0);MergeSort.mess(thou);
	


	
	int[] tthou = new int[10000]; 
	double time10000 = 0.0;

	MergeSort.mess(tthou); 
        begin = System.nanoTime();
	MergeSort.sort(tthou); 
        end = System.nanoTime();
	time10000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(tthou); 
        end = System.nanoTime();
	time10000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(tthou); 
        end = System.nanoTime();
	time10000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(tthou); 
        end = System.nanoTime();
	time10000 += (end-begin)/1000.0;

	System.out.println("Time for ten-thousand: " + time10000/4.0);MergeSort.mess(tthou);
	


	

	int[] hthou = new int[100000]; 
	double time100000 = 0.0;
	MergeSort.mess(hthou);
	
        begin = System.nanoTime();
	MergeSort.sort(hthou); 
        end = System.nanoTime();
	time100000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(hthou); 
        end = System.nanoTime();
	time100000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(hthou); 
        end = System.nanoTime();
	time100000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(hthou); 
        end = System.nanoTime();
	time100000 += (end-begin)/1000.0;

	System.out.println("Time for hundred-thousand: " + time100000/4.0);


	

	int[] mil = new int[1000000]; 
       	double time1000000 = 0.0;
	MergeSort.mess(mil);
	
        begin = System.nanoTime();
	MergeSort.sort(mil); 
        end = System.nanoTime();
	time1000000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(mil); 
        end = System.nanoTime();
	time1000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil); 
        end = System.nanoTime();
	time1000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil); 
        end = System.nanoTime();
	time1000000 += (end-begin)/1000.0;

	System.out.println("Time for million: " + time1000000/4.0);


	

	int[] mil0 = new int[10000000]; 
       	double time10000000 = 0.0;
	MergeSort.mess(mil0);
	
        begin = System.nanoTime();
	MergeSort.sort(mil0); 
        end = System.nanoTime();
	time10000000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(mil0); 
        end = System.nanoTime();
	time10000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil0); 
        end = System.nanoTime();
	time10000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil0); 
        end = System.nanoTime();
	time10000000 += (end-begin)/1000.0;

	System.out.println("Time for ten-million: " + time10000000/4.0);





        
	int[] mil00 = new int[100000000]; 
        double time100000000 = 0.0;
	MergeSort.mess(mil00);
	
        begin = System.nanoTime();
	MergeSort.sort(mil00); 
        end = System.nanoTime();
	time100000000 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(mil00); 
        end = System.nanoTime();
	time100000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil00); 
        end = System.nanoTime();
	time100000000 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(mil00); 
        end = System.nanoTime();
	time100000000 += (end-begin)/1000.0;

	System.out.println("Time for hundred-million: " + time100000000/4.0);


    }//end main

}//end class
