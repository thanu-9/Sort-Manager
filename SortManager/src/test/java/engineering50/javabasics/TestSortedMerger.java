package sparta.em.engineering50.javabasics;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSortedMerger {

    @Test
    public void testSortedMergerForArrayIncludingNegatives(){
        SortedMerger sortedMerger = new SortedMerger();
        int[] array1 = new int[]{1, 4, 6, 13, 20};
        int[] array2 = new int[]{-8,-7, 2, 10, 15 };
        assertTrue(Arrays.equals(sortedMerger.sortedMerge(array1, array2), new int[]{-8, -7 , 1, 2 , 4, 6, 10, 13, 15, 20 }));
    }

    @Test
    public void testSortedMergerForArrayIncludingDuplicates(){
        SortedMerger sortedMerger = new SortedMerger();
        int[] array1 = new int[]{1, 4, 6, 13, 20};
        int[] array2 = new int[]{ 2, 4, 10, 13, 15 };
        assertTrue(Arrays.equals(sortedMerger.sortedMerge(array1, array2), new int[]{ 1, 2 , 4, 4, 6, 10, 13, 13, 15, 20 }));
    }

}
