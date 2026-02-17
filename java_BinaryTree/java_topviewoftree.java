import java.util.*;
public class java_topviewoftree{
    static class Node {
    int data;
    Node left, right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    public static void  topView(Node root) {
        // code here
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> hp = new HashMap<>();
        int min =0,max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!hp.containsKey(curr.hd)){
                    hp.put(curr.hd,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i = min;i<=max;i++){
            System.out.print(hp.get(i).data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);
    }
}