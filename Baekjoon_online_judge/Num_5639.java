import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        Node root = null;
        String input;
        try{
            while (!(input = br.readLine()).equals("")) {
                root = insertNode(root, Integer.parseInt(input));
            }
        }catch (Exception e){
            
        }
        post(root);
    }

    static void post(Node node){
        if(node != null){
            post(node.left);    // 왼쪽
            post(node.right);   // 오른쪽
            System.out.println(node.val);
        }
    }

    static Node insertNode(Node node, int n){
        Node current = null;
        if(node == null){
           return new Node(n);
        }

        if(node.val > n){
            current = insertNode(node.left, n);
            node.left = current;
        }else {
            current = insertNode(node.right, n);
            node.right = current;
        }

        return node;
    }

    static class Node{
        Node left, right;
        int val;
        Node (int val_){
            this.val = val_;
            this.left = null;
            this.right = null;
        }
    }
}
