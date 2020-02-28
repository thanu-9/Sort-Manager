package sparta.em.engineering50.javabasics;

public interface BinaryTreeInterface {
    Node getRootNode();


    int getNumberOfNodes();


    void addNode(int value);


    void addNodes(int[] values);


    boolean findNode(int value);


    Node getLeftChild(Node node);


    Node getRightChild(Node node);


    void createArrayInOrder(Node node);


    int[] getSortedTreeAsc();


    int[] getSortedTreeDesc();

}