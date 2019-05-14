public class Queue {

    Node head, tail;


    public Queue(){
        this.head = new Node();
        this.tail = new Node();
        head.Next= tail;
        tail.Prev = head;
    }


    Tree pop() {
        Tree temp;
        temp = head.Next.getTree();
        head = head.Next;
        return temp;
    }

    public void push(Node target, Tree tree){
        Node next = target;
        Node prev = target.getPrev();
        Node node = new Node(tree, prev, next);

        next.setPrev(node);
        prev.setNext(node);
    }


    Tree peak() {
        return head.Next.getTree();
    }

    public void remove(){

    }


}