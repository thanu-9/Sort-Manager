package sparta.em.engineering50.javabasics;


import java.util.ArrayList;

public class BinaryTreeImpl implements BinaryTreeInterface {

    //constructor
    public BinaryTreeImpl(int[] array) {
        addNodes(array);
    }

    private Node rootNode; //initialise variable

    @Override
    public Node getRootNode() {
        return rootNode;
    }

    @Override
    public int getNumberOfNodes() {
        return Node.getNodeCounter();
    }


    @Override
    public void addNode(int value) {
        //if smaller than next childless node, set as left node:
        if (Node.getChildlessNode(rootNode, value).getValue() >= value) { // null pointer exception
            Node.getChildlessNode(rootNode, value).setLeftChild(value);
         //if larger, set as right node:
        } else if (Node.getChildlessNode(rootNode, value).getValue() < value) {
            Node.getChildlessNode(rootNode, value).setRightChild(value);
        }
    }

    @Override
    public void addNodes(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (Node.getNodeCounter() == 0) {
                this.rootNode = new Node(null, values[0]);//set rootNode as the first element
            } else {
                addNode(values[i]); //populate tree
            }
        }
    }

    //method to see if node exists:
    @Override
    public boolean findNode(int value) {
        Node node = rootNode;
        while (true) {
            if (node == null) {
                return false;
            } else if (node.getValue() == value) {
                return true;
            } else {
                if (node.getValue() >= value) {
                    node = node.getLeftChild();
                } else if (node.getValue() <= value) {
                    node = node.getRightChild();
                }
            }
        }
    }

    @Override
    public Node getLeftChild(Node node) {
        return node.getLeftChild();
    }

    @Override
    public Node getRightChild(Node node) {
        return node.getRightChild();
    }

    //Sort:
    private ArrayList<Integer> sortedArray = new ArrayList<>(); //create array list to keep values in
    @Override
    public void createArrayInOrder(Node node) { //step through tree and add to sortedArray
        if (node != null) {
            createArrayInOrder(node.getLeftChild());
            sortedArray.add(node.getValue());
            createArrayInOrder(node.getRightChild());
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedArray.clear(); //clears arrayInOrder so that it  can be called multiple times
        createArrayInOrder(rootNode);
        int[] ascArray = new int[sortedArray.size()];
        for (int i = 0; i < sortedArray.size(); i++) {
            ascArray[i] = sortedArray.get(i);
        }
        return ascArray;
    }

    @Override
    public int[] getSortedTreeDesc() {
        sortedArray.clear(); //clears arrayInOrder so that it  can be called multiple times
        createArrayInOrder(rootNode);
        int[] descArray = new int[sortedArray.size()];
        for (int i = 0; i <= sortedArray.size() - 1; i++) {
            descArray[sortedArray.size() - 1 - i] = sortedArray.get(i);
        }
        return descArray;
    }
}
