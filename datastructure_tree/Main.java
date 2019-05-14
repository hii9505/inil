import com.sun.jmx.remote.internal.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        Tree n15 = new Tree(15, null, null);
        Tree n14 = new Tree(14, null, null);
        Tree n13 = new Tree(13, null, null);
        Tree n12 = new Tree(12, null, null);
        Tree n11 = new Tree(11, null, null);
        Tree n10 = new Tree(10, null, null);
        Tree n9 = new Tree(9, null, null);
        Tree n8 = new Tree(8, null, null);
        Tree n7 = new Tree(7, n14, n15);
        Tree n6 = new Tree(6, n12, n13);
        Tree n5 = new Tree(5, n10, n11);
        Tree n4 = new Tree(4, n8, n9);
        Tree n3 = new Tree(3, n6, n7);
        Tree n2 = new Tree(2, n4, n5);
        Tree root = new Tree(1, n2, n3);

        Queue queue = new Queue();




//        System.out.println("pre");
//        preOrder(root);
//        System.out.println("\nin");
//        inOrder(root);
//        System.out.println("\last");
//        postOrder(root);
        System.out.println("\nlevel");
        levelOrder(root, queue);




    }

    public static void inOrder(Tree tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.print(tree.number + " ");
            inOrder(tree.right);
        }

    }

    public static void preOrder(Tree tree) {
        if (tree != null) {
            System.out.print(tree.number + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }

    }

    public static void postOrder(Tree tree) {
        if (tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.print(tree.number + " ");
        }

    }


    public static void levelOrder(Tree tree, Queue queue) {

        queue.push(queue.tail , tree);
        Tree tempTree;

    while(true){
        tempTree = queue.pop();
        if(tempTree == null){
            break;
        }
        System.out.print(tempTree.number + " ");

        if(tempTree.left != null){
          queue.push(queue.tail, tempTree.left);
        }
        if(tempTree.right != null){
            queue.push(queue.tail, tempTree.right);
        }

    }


    }

}


