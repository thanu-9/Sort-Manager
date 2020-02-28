package sparta.em.engineering50.javabasics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBubbleSort {

    @Test
    public void testBubbleSortForArrayIncludingNegatives(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{1,-7, 2, 13, 5, 0};
        assertTrue(Arrays.equals(bubbleSort.bubbleSort(array), new int[]{-7, 0, 1, 2, 5, 13}));
    }

    @Test
    public void testBubbleSortForArrayIncludingDuplicates(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{1, 2, 13, 5, 2, 0};
        assertTrue(Arrays.equals(bubbleSort.bubbleSort(array), new int[]{ 0, 1, 2, 2, 5, 13}));
    }
}
