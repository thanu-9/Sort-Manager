package sparta.em.engineering50.javabasics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUserInput {
    UserInput userInput = new UserInput();
    @Test
    public void testTypeBubbleSort(){
        int[] array = new int[]{3, -1, 4, -9, 4, 9, 3};
        int[] sorted = new int[]{-9, -1, 3, 3, 4, 4, 9};
        assertEquals(Arrays.toString(sorted), Arrays.toString(userInput.sortArray("bubbleSort", array)));
    }

    @Test
    public void testTypeDivideAndMerge(){
        int[] array = new int[]{6, -1, 5, -9, -2, 9, 3};
        int[] sorted = new int[]{-9, -2, -1, 3, 5, 6, 9};
        assertEquals(Arrays.toString(sorted), Arrays.toString(userInput.sortArray("divideAndMerge", array)));
    }

    @Test
    public void testTypeBinaryTreeAsc(){
        int[] array = new int[]{-10, 3, 4, 2, 0, 0, -3, 7};
        int[] sorted = new int[]{-10, -3, 0, 0, 2, 3, 4, 7};
        assertEquals(Arrays.toString(sorted), Arrays.toString(userInput.sortArray("binaryTreeAsc", array)));
    }

    //again, this test only runs separate from the one above
    @Test
    public void testTypeBinaryTreeDesc(){
        int[] array = new int[]{-10, 3, 4, 2, 0, 0, -3, 7};
        int[] sorted = new int[]{7, 4, 3, 2, 0, 0, -3, -10};
        assertEquals(Arrays.toString(sorted), Arrays.toString(userInput.sortArray("binaryTreeDesc", array)));
    }

    @Test
    public void testTypeSortedMerge(){
        int[] array = new int[]{1, 3, 4, 4, 8};
        int[] array2 = new int[]{-1, 0, 5, 6, 10};
        int[] sorted = new int[]{-1, 0, 1, 3, 4, 4, 5, 6, 8, 10};
        assertEquals(Arrays.toString(sorted), Arrays.toString(userInput.sortArray("sortedMerge", array, array2)));
    }

    @Test
    public void testTypeSortedMergeCombinedLengthIsCorrect(){
        int[] array = new int[]{1, 3, 4, 4, 8};
        int[] array2 = new int[]{-1, 0, 5, 6, 10};
        int[] sorted = new int[]{-1, 0, 1, 3, 4, 4, 5, 6, 8, 10};
        assertEquals(sorted.length, userInput.sortArray("sortedMerge", array, array2).length);
    }

    @Test
    public void testTypeInvalidGivesBackUnsortedArray(){
        int[] array = new int[]{-10, 3, 4, 2, 0, 0, -3, 7};
        int[] sorted = new int[]{7, 4, 3, 2, 0, 0, -3, -10};
        assertEquals(Arrays.toString(array), Arrays.toString(userInput.sortArray("bubbleSor", array)));
    }

    @Test
    public void testTypeInvalidGivesBackTheFirstArray(){
        int[] array = new int[]{1, 3, 4, 4, 8};
        int[] array2 = new int[]{-1, 0, 5, 6, 10};
        int[] sorted = new int[]{-1, 0, 1, 3, 4, 4, 5, 6, 8, 10};
        assertEquals(Arrays.toString(array), Arrays.toString(userInput.sortArray("sortedMergr", array, array2)));
    }













}
