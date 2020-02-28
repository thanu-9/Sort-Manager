package sparta.em.engineering50.javabasics;

public class App {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        //to sort 1 array
        //valid sortTypes are: bubbleSort, divideAndMerge, binaryTreeAsc, binaryTreeDesc
        //accepts int arrays
        userInput.sortArray("binaryTreeDesc", new int[]{2, 1, 4, -9, 4, 9, 3});

        //to merge and sort two arrays:
        //valid sortTypes: sortedMerge
        //accepts two sorted int arrays
        userInput.sortArray("sortedMerge", new int[]{1, 3, 5, 7, 8}, new int[]{0,1,4,4,10,12});



    }
}
