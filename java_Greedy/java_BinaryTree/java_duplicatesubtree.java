import java.util.*;
public class java_duplicatesubtree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static HashMap<String,Integer> map = new HashMap<>();
    static List<Node> result = new ArrayList<>();
    public static String duplicates(Node root){
        if(root == null) return "null";

        String left = duplicates(root.left);
        String right = duplicates(root.right);

        String subtree = root.data + "," + left + "," + right;

        map.put(subtree,map.getOrDefault(subtree,0)+1);

        if(map.get(subtree) == 2){
            result.add(root);
        }
        return subtree;
    }
    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(2);
        root.right.left.left = new Node(3);

        duplicates(root);

        for(Node node : result){
            System.out.println();
            preorder(node);
        }
        
    }
}