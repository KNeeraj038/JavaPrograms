package DSA.linkedlist;

public class LinkedList {

    static class Node{
        int data;
        Node nextNode;
        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }

    public static void printLinkedList(Node node){
        Node tempNode = node;

        while(tempNode != null){
            System.out.print(" --> "+tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }

    public static void main(String[] args){

        Node headNode = new Node(10);
        Node rootNode = headNode;
        Node node2 = new Node(11);
        Node node3 = new Node(201);
        Node node4 = new Node(4);
        Node node5 = new Node(1);

        headNode.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;

        printLinkedList(rootNode);

        // At the front of the linked list
        rootNode = insertNodeAtFront(rootNode, new Node(25));
        System.out.println("\nAfter Inserting data at front.");
        printLinkedList(rootNode);

        // After a given node.
        insertNodeAfterGivenNode(rootNode, 201, 420);
        System.out.println("\nInserting data after 201");
        printLinkedList(rootNode);

        // At a specific position.
        insertAtIndex(rootNode,100, 3);
        System.out.println("\nInserting [100] at index 3.");
        printLinkedList(rootNode);

        // At the end of the linked list.
        inserNodeAtEnd(rootNode,500);
        System.out.println("\nInserting data at last.");
        printLinkedList(rootNode);
    }

    private static void inserNodeAtEnd(Node rootNode, int data) {
        Node tempNode = rootNode;
        while(tempNode.nextNode != null){
            tempNode = tempNode.nextNode;
        }

        Node newNode =  new Node(data);
        tempNode.nextNode =newNode;
        newNode.nextNode = null;
    }

    private static Node insertAtIndex(Node rootNode, int data, int index) {
        Node tempNode = rootNode;
        int indexCountDown = index;
        while(indexCountDown != 1){
            tempNode = tempNode.nextNode;
            indexCountDown--;
        }
        if(tempNode == null){
            return rootNode;
        }

        Node newNode = new Node(data);
        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
        return tempNode;
    }

    private static Node insertNodeAfterGivenNode(Node rootNode, int key, int newdata) {
        Node tempNode = rootNode;
        while(tempNode != null){
            if(tempNode.data == key){
                break;
            }
            tempNode = tempNode.nextNode;
        }

        if(tempNode == null){
            return rootNode;
        }

        Node newNode = new Node(newdata);
        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
        return rootNode;
    }

    private static Node insertNodeAtFront(Node headNode, Node node) {
        Node newNode = node;
        Node tempNode = headNode;
        if(headNode != null){
            newNode.nextNode = headNode;
        }
        return newNode;
    }


}
