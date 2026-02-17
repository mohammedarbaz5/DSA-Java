public class java_univalued{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean checkunivalued(Node root){
        if(root == null) return true;

        if(root.left != null && root.data != root.left.data) return false;

        if(root.right != null && root.data != root.right.data) return false;

        return checkunivalued(root.left) && checkunivalued(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);

         System.out.println(checkunivalued(root));
        Node subroot = new Node(2);
        subroot.left = new Node(2);
        subroot.right = new Node(2);
        subroot.left.left = new Node(5);
        subroot.left.right = new Node(2);
        System.out.println(checkunivalued(subroot));
    }
}