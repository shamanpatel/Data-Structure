import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }

}
public class BinaryTree{
    Node root;
    public void insert(int data){
       root = insertRec(root, data);
    }
    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }
            else if(data < root.data){
                root.left = insertRec(root.left, data);
        }
            else if(data > root.data){
                root.right = insertRec(root.right, data);
        }
            return root;
    }
    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);
    }
    public void preorderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder(){
        postorderRec(root);
    }
    public void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void bfs(){
        if(root == null){
            System.out.println("Tree is empty.");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(2);
        tree.insert(12);
        tree.insert(10);
        tree.insert(15);
        tree.insert(5);

        System.out.print("The inorder traversal is: ");
        tree.inorder();
        System.out.println();
        System.out.print("The preorder traversal is: ");
        tree.preorder();
        System.out.println();
        System.out.print("The postorder traversal is: ");
        tree.postorder();
        System.out.println();
        System.out.print("The BFS (Level Order) traversal is: ");
        tree.bfs();
    }
}

//Output:-
// The inorder traversal is: 2 5 7 8 10 12 15 
// The preorder traversal is: 8 7 2 5 12 10 15 
// The postorder traversal is: 5 2 7 10 15 12 8 
// The BFS (Level Order) traversal is: 8 7 12 2 10 15 5 