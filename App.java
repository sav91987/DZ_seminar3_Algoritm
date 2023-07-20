public class App {
    public static void main(String[] args) {
        
        
    }
    Node head;

    public class Node {
        //int value;
        Node next;

    }
    

    public void revert(){
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }
    
    private void revert(Node currentNode, Node previosNode){
        if (currentNode == null) {
            head = currentNode;
        }
        else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previosNode;
        previosNode.next = null;
    }
}
