package workshop10.binarytree;



/**
 *
 * @author remcoruijsenaars
 */
public class BinaryTree {
    
    private Node root;
    
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right){
        root = new Node(rootData);
        root.setLeft(left.getRoot());
        root.setRight(right.getRoot());
    }
    
    public BinaryTree(Node node){
        root = node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public int getHeight(){
        return height(root);
    }


    //TODO extra huiswerk voor diegene die tijd over hebben.
    public boolean isBalanced(){
        return false;
    }
    
    
    private int height(Node n){
        if(n==null){
            return 0;
        }else{
            return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
        }
    }






}
