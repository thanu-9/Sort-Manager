package sparta.em.engineering50.javabasics;

public class BubbleSort {

    //this method implements the sorting of the elements of two arrays by bubblesort
    public int[] bubbleSort(int[] numberSequence) {
        boolean swapChecker = false; //checks if a swap happened
        for (int i = 0; i < numberSequence.length - 1; i++) {
            if (numberSequence[i] > numberSequence[i + 1]) {
                //swap numbers if in wrong order
                SwapNumbers swapNumbers = new SwapNumbers();
                swapNumbers.swap(numberSequence, i);

                swapChecker = true; //and flag that the swap happened
            }

        }
        if (swapChecker == false) {
            return numberSequence; //if no swap happened that means it's in order so return sequence
        } else {
            return bubbleSort(numberSequence); //if there was a swap, go through sort again
        }
    }
}
