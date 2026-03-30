import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class binaryst{
    public static TreeNode insert(TreeNode root, int data){
        if(root == null){
            return new TreeNode(data);
        }
        if(data <= root.data){
            root.left= insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static TreeNode delete(TreeNode root, int val){
        if(root==null) return null;
        if(val < root.data){
            root.left =delete(root.left,val);
        }
        else if(val > root.data){
            root.right = delete(root.right,val);
        }
        else{
            if(root.left == null) return root.right;
            if(root.right==null) return root.left;
            TreeNode successor = inordersuccessor(root.right);
            root.data=successor.data;
            root.right= delete(root.right,successor.data);
        }
        return root;
    }
    public static TreeNode inordersuccessor(TreeNode root){
    while(root.left != null){
        root = root.left;
    }
    return root;
    }
    public static boolean search(TreeNode root, int key){
        if(root == null){
            return false;
        }
        if(key == root.data){
            return true;
        }
        if(key<=root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String args[]){
        int[] arr={5,3,1,8,6};
        TreeNode root = null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root,8));
        delete(root,5);
        inorder(root);
        System.out.println();
    }
}