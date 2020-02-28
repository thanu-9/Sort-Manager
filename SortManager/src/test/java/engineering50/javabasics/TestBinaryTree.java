package sparta.em.engineering50.javabasics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBinaryTree {

    int[] array = new int[]{2, 1, 4, -7, 3, 4, 9, 5};
    BinaryTreeImpl binaryTree = new BinaryTreeImpl(array);

    //can only run tests separately
    @Test
    public void testBinaryTreeAscending() {
        int[] sorted = binaryTree.getSortedTreeAsc();
        assertTrue(Arrays.equals(sorted, new int[]{-7, 1, 2, 3, 4, 4, 5, 9}));
    }

    @Test
    public void testBinaryTreeDescending() {
        int[] sortedDesc = binaryTree.getSortedTreeDesc();
        assertTrue(Arrays.equals( sortedDesc, new int[]{9, 5, 4, 4, 3, 2, 1, -7}));
    }
}

