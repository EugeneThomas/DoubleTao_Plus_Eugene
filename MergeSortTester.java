/*
Team DoubleTao Plus Eugene - Xing Tao Shi, Iris Tao, EugeneThomas
APCS2 pd4
HW7-- What Does the Data Say?
2017-2-14
 */

/*======================================
  class MergeSortTester

  ALGORITHM:
  Split the array in half until they are 1 element arrays. This guarantees that the arrays are sorted. Then combine the two arrays that are recieved by comparing the first value of each array. Return the array after  sorting it. Rinse and repeat until you have a sorted array. 


  BIG-OH CLASSIFICATION OF ALGORITHM: nlog(n)


  *OLD TIMES================================
  Mean execution times for dataset of size n:
  Batch size: 4
  n=1            time: 0.50975 
  n=5            time: 4.8195
  n=10           time: 11.22800
  n=50           time: 69.4275
  n=100          time: 118.66999
  n=1,000        time: 306.07849
  n=10,000       time: 2820.663
  n=100,000      time: 15178.66499
  n=1,000,000    time: 134361.51275
  n=10,000,000   time: 1149694.99275
  n=100,000,000  time: 1.29494E7
  ===========================================

  *NEW TIMES================================
  Mean execution times for dataset of size n:
  Batch size: 50
  n=1            time: 0.0006
  n=10           time: 0.0247
  n=100          time: 0.0933
  n=1,000        time: 0.7274
  n=10,000       time: 2.2587
  n=100,000      time: 19.358
  n=1,000,000    time: 155.03
  ===========================================


  ANALYSIS:
  After graphing the results, they looked most similiar to O(sqrt(n)). We don't understand our results but we can't find any errors. 
  ======================================*/ 

public class MergeSortTester 

{
    /******************************
     * execution time analysis 
We took the difference between the nanoTime of when the proccess starts and the nanoTime of when it ends. We repeated this process four times and then divided by four in order to find the average amount of time that it would take. 
     ******************************/


    public static void populate(int[] arr, int length) {
	for (int i = 0; i < length; i++) {
	    int arrVal = (int)(Math.random() * 100);
	    arr[i] = arrVal;
	}
    }

    public static double sortTester(int length) {
	int[] arr = new int[length];
	populate(arr, length);

	long startTime = System.nanoTime();
	MergeSort.sort(arr);
	long endTime = System.nanoTime();

	long duration = endTime - startTime;
	return duration/1000000f;
    }

    public static double testSort_avg(int length) {
	double sum = 0;
	for (int i = 0; i < 50; i++)
	    sum += sortTester(length);
	return sum/50;
    }
    
    public static void main( String[] args ) 
    {
	/* PREVIOUS TESTING
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
	
	int[] five = new int[5];
	double time5 = 0.0;

	MergeSort.mess(five); 
        begin = System.nanoTime();
	MergeSort.sort(five); 
        end = System.nanoTime();
	time5 += (end-begin)/1000.0;

	MergeSort.mess(five); 
        begin = System.nanoTime();
	MergeSort.sort(five); 
        end = System.nanoTime();
	time5 += (end-begin)/1000.0;

	MergeSort.mess(five); 
        begin = System.nanoTime();
	MergeSort.sort(five); 
        end = System.nanoTime();
	time5 += (end-begin)/1000.0;

	MergeSort.mess(five); 
	begin = System.nanoTime();
	MergeSort.sort(five); 
        end = System.nanoTime();
	time5 += (end-begin)/1000.0;
	
	System.out.println("Time for five: " + time5/4.0);

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
	
	int[] fifty = new int[50]; 
	double time50 = 0.0;

	MergeSort.mess(fifty); 
        begin = System.nanoTime();
	MergeSort.sort(fifty); 
        end = System.nanoTime();
	time50 += (end-begin)/1000.0;

        begin = System.nanoTime();
	MergeSort.sort(fifty); 
        end = System.nanoTime();
	time50 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(fifty); 
        end = System.nanoTime();
	time50 += (end-begin)/1000.0;

	begin = System.nanoTime();
	MergeSort.sort(fifty); 
        end = System.nanoTime();
	time50 += (end-begin)/1000.0;

	System.out.println("Time for fifty: " + time50/4.0);

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
	*/

	//NEW TESTING

	System.out.println("TEST RUN: The time for " + "1" + " is " + sortTester(1));
	System.out.println("The time for " + "1" + " is " + sortTester(1));
	System.out.println("The time for " + "10" + " is " + sortTester(10));
	System.out.println("The time for " + "100" + " is " + sortTester(100));
	System.out.println("The time for " + "1000" + " is " + sortTester(1000));
	System.out.println("The time for " + "10000" + " is " + sortTester(10000));
	System.out.println("The time for " + "100000" + " is " + sortTester(100000));
	System.out.println("The time for " + "1000000" + " is " + sortTester(1000000));
		  
	//TESTING FROM 500 TO 10000 IN INTERVALS OF 500
	System.out.println("TESTING FROM 500 - 20000");
	for (int x = 500; x <= 20000; x += 500) {
	    System.out.println("The time for " + x + " is " + sortTester(x));
	}
     

	
    }//end main

}//end class
