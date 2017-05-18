/******************************************************************************
 *  Compilation:  javac ThreeSum.java
 *  Execution:    java ThreeSum < input.txt
 *                java Generator n | java ThreeSum
 *  Data files:   http://www.cs.princeton.edu/introcs/41analysis/8ints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/1Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/2Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/4Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/8Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/16Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/32Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/64Kints.txt
 *                http://www.cs.princeton.edu/introcs/41analysis/128Kints.txt
 *
 *  A program with cubic running time. Reads in n integers
 *  and counts the number of triples that sum to exactly 0.
 *
 *  % java ThreeSum < 8ints.txt
 *  4
 *  30 -30 0
 *  30 -20 -10
 *  -30 -10 40
 *  -10 0 10
 *
 *  % java ThreeSum < 1Kints.txt
 *  0
 *
 *
 *  Limitations
 *  -----------
 *     - we ignore integer overflow
 *
 *
 ******************************************************************************/

public class ThreeSum {

    public static void printAll(int[] arr){
        int len = arr.length;

        for (int i=0; i < len; i++){
            for (int j = i+1; i < len; j++){
                for (int y= j+1; y < len; y++){
                    if (arr[i]+arr[j]+arr[y] == 0){
                        System.out.println("You get triplets with: " + arr[i] + " , " + arr[j] + " , " + arr[y])
                    }
                }
            }
        }
    }


    public static void main(String[] args){
        int [] garr = Std.readAllInts();
        Stopwatch timer = new Stopwatch();
        String triplets = printAll(garr);

    }

}