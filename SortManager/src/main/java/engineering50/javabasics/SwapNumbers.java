package sparta.em.engineering50.javabasics;

//method to swap an element in an array with the next element
public class SwapNumbers {

    public void swap(int[] array, int arrayPointer) {
        int spare = array[arrayPointer];
        array[arrayPointer] = array[arrayPointer+1];
        array[arrayPointer+1] = spare;
    }
}

