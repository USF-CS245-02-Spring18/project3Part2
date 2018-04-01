package sorting;

/**  A class that implements SortInterface. Has various methods
 *   to sort a list of elements. */
public class SortingAlgorithms implements SortInterface {

    /**
     * Sorts a sub-array of records using bucket sort.
     * @param array array of records
     * @param lowindex the beginning index of the sublist to sort
     * @param highindex the end index of the sublist to sort
     */
    @Override
    public void bucketSort(Elem[] array, int lowindex, int highindex) {
        // FILL IN CODE

    }

    /**
     * Sorts a sub-array from lowindex to highindex using radix sort.
     * Uses base 10.
     * @param array
     * @param lowindex
     * @param highindex
     */
    public void radixSort(int[] array, int lowindex, int highindex) {


    }


    /**
     * Implements external sort method
     * @param inputFile The file that contains the input list
     * @param outputFile The file where to output the sorted list
     * @param n number of elements to sort
     * @param k number of elements that fit into memory at once
     */
    public void externalSort(String inputFile, String outputFile, int n, int k) {
        // FILL IN CODE


    }
}
