public class LinkedList {
    Node headNode; //node type instance variable

    public void addHeadNode(int x, int y){

        Node newNode = new Node();

        newNode.xPosition = x;
        newNode.yPosition = y;

        newNode.nextNode = headNode;

        headNode = newNode;

    }

    public Node removeHeadNode(){
        headNode = headNode.nextNode;
        return headNode;
    }



}
