public class java_invertTree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node mirror(Node root){
        if(root == null) return root;
        Node newNode = new Node(root.data);
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        newNode.left = right;
        newNode.right = left;

        return root;
    }
    public static  void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        mirror(root);
        preorder(root);
    }
}