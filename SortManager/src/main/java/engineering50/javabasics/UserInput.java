package sparta.em.engineering50.javabasics;

import java.util.Arrays;

public class UserInput {

    public int[] sortArray(String sortType, int[] array){
        int[] sortedArray = array;
        if (sortType == "bubbleSort"){
            BubbleSort bubbleSort = new BubbleSort();
            sortedArray = bubbleSort.bubbleSort(array);
            System.out.println("The bubble sorted single array is: " + Arrays.toString( sortedArray) );
        } else if (sortType == "divideAndMerge"){
            DivideAndMerge divideAndMerge = new DivideAndMerge();
            sortedArray = divideAndMerge.divideSort(array);
            System.out.println("Array divided up and then merge sorted: " + Arrays.toString(sortedArray) );
        } else if(sortType == "binaryTreeAsc"){
            BinaryTreeImpl binaryTree = new BinaryTreeImpl(array);
            sortedArray = binaryTree.getSortedTreeAsc();
            System.out.println("Array sorted by binary tree (ascending): " + Arrays.toString(sortedArray));
        } else if(sortType == "binaryTreeDesc"){
            BinaryTreeImpl binaryTree1 = new BinaryTreeImpl(array);
            sortedArray = binaryTree1.getSortedTreeDesc();
            System.out.println("Array sorted by binary tree (descending): " + Arrays.toString(sortedArray));
        } else {
            System.out.println("The sort type entered is invalid, please enter a valid sorting type.");
        }
        return sortedArray;
    }

    public int[] sortArray(String sortType, int[] sortedArray1, int[] sortedArray2) {
        int[] sortedArray = sortedArray1;
        if (sortType == "sortedMerge"){
            SortedMerger sortedMerger = new SortedMerger();
            sortedArray = sortedMerger.sortedMerge(sortedArray1, sortedArray2);
            System.out.println("The two arrays sorted while merging :" + Arrays.toString(sortedArray));
        } else {
            System.out.println("The sort type entered is invalid, please enter a valid sorting type.");
        }
        return sortedArray;
    }
}
