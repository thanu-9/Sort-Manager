package sparta.em.engineering50.javabasics;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDivideAndMerge {

    @Test
    public void testDivideAndMergeForArrayIncludingNegatives(){
        int[] array = new int[]{2, 1, 4, -7, 3, -9, 5};
        DivideAndMerge divideAndMerge = new DivideAndMerge();
        assertTrue(Arrays.equals(divideAndMerge.divideSort(array), new int[]{-9, -7, 1, 2, 3, 4, 5 }));
    }

    @Test
    public void testDivideAndMergeForArrayIncludingDuplicates(){
        int[] array = new int[]{2, 1, 4, 1, 3, 9, 5};
        DivideAndMerge divideAndMerge = new DivideAndMerge();
        assertTrue(Arrays.equals(divideAndMerge.divideSort(array), new int[]{1, 1, 2, 3, 4, 5, 9 }));
    }
}

