public class java_maxpathsum{
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
    static int maxSum =Integer.MIN_VALUE;
    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        leftSum = Math.max(0,leftSum);
        rightSum = Math.max(0,rightSum);
        int currentpath = leftSum + rightSum + root.data;
        maxSum = Math.max(currentpath,maxSum);

        return root.data+ Math.max(leftSum,rightSum); 
    }
    public static void main(String[] args){
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7); 

        Sum(root);
        System.out.print(maxSum);

}
}
