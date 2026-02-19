 public class java_validbst{
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
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static boolean isValidate(Node root,Node min,Node max){
        if(root == null) return true;
        
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return isValidate(root.left,min,root) && isValidate(root.right,root,max);
    }
    public static void main(String args[]){
        int values[] = {1,1,1};
        Node root = null;

        for(int i= 0;i<values.length;i++){
            root = insert(root,values[i]);
        }

        if(isValidate(root,null,null)){
            System.out.print("valid");
        }else{
            System.out.print("not valid");
        }
    }
 }
