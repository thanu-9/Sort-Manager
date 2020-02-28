package sparta.em.engineering50.javabasics;

import java.util.Arrays;

//this class includes some example of using the methods:
public class ManualTests {
    public static void manualTests(String[] args) {

        //Bubble sort:
        int[] intArray = new int[]{2, 1, 4, -9, 4, 9, 3};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Array to be sorted: " + Arrays.toString(intArray));
        System.out.println("The bubble sorted single array is: " + Arrays.toString( bubbleSort.bubbleSort(intArray)) + "\n");


        //SortedMerger
        int[] intArray1 = new int[]{1, 3, 5, 7, 9, 23}; //already sorted input array
        int[] intArray2 = new int[]{2, 3, 4, 6, 7}; //already sorted input array
        SortedMerger sortedMerger = new SortedMerger();
        int[] sortedMergedArray = sortedMerger.sortedMerge(intArray1, intArray2);
        System.out.println("Arrays to be merge sorted: " + Arrays.toString(intArray1) + " and " + Arrays.toString(intArray2) );
        System.out.println("The two arrays sorted while merging :" + Arrays.toString(sortedMergedArray) + "\n");


        //Sort by Divide and Merge
        int[] intArray4 = new int[]{2, 1, 4, -7, 3, 9, 3};
        DivideAndMerge divideAndMerge = new DivideAndMerge();
        int[] divideAndMergedArray =  divideAndMerge.divideSort(intArray4);
        System.out.println("Array to be sorted: " + Arrays.toString(intArray4));
        System.out.println("Array divided up and then merge sorted: " + Arrays.toString(divideAndMergedArray) + "\n");


        //Sort with Binary tree method
        int[] intArray5 = new int[]{4, 2, 3, 0, 1, 5, 7, 6};
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(intArray5);
        System.out.println("Array to be sorted: " + Arrays.toString(intArray5));
        System.out.println("Array sorted by binary tree (ascending): " + Arrays.toString(binaryTree.getSortedTreeAsc()));
        System.out.println("Array sorted by binary tree (descending): " + Arrays.toString(binaryTree.getSortedTreeDesc()));

        //some manual tests:
        //System.out.println(binaryTree.getNumberOfNodes());
        //System.out.println(binaryTree.findNode(5));
        //System.out.println(binaryTree.getRootNode().getValue());
        //System.out.println(binaryTree.getRootNode().getRightChild().getValue());



    }
}
