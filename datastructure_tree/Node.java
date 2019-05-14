public class Node {

    Tree tree;
    Node Prev;
    Node Next;

    public Node(Tree tree , Node prev , Node next){
        this.tree = tree;
        this.Prev = prev;
        this.Next = next;
    }

    public Node(){

    }


    public Node getPrev() {
        return Prev;
    }

    public void setPrev(Node prev) {
        Prev = prev;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}
