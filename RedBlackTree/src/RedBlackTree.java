public class RedBlackTree {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Color color;
    }

    enum Color{
        BLACK,
        RED
    }

    public void ins(int value){
        if(root != null){
            ins(root, value);
            root = rebalance(root);
        }else{
            root = new Node();
            root.value = value;
        }
        root.color = Color.BLACK;
    }

    private void ins(Node node, int value){
        if(node.value != value){
            if(node.value < value){
                if(node.right == null){     //right
                    node.right = new Node();
                    node.right.value = value;
                    node.right.color = Color.RED;
                }else{
                    ins(node.right, value);
                    node.right = rebalance(node.right);
                }
            }else{                          //left
                if(node.left == null){
                    node.left = new Node();
                    node.left.value = value;
                    node.left.color = Color.RED;
                }else{
                    ins(node.left, value);
                    node.left = rebalance(node.left);
                }
            }
        }
    }

    public Node find(int value){
        return find(root, value);
    }

    private Node find(Node node, int value){
        if(node == null){
            return null;
        }
        if(node.value == value){
            return node;
        }
        if(node.value < value){
            return find(node.right, value);
        }else{
            return find(node.left, value);
        }
    }

    private Node leftTurn(Node node){
        Node cur = node.right;
        node.right = cur.left;
        cur.left = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private Node rightTurn(Node node){
        Node cur = node.left;
        node.left = cur.right;
        cur.right = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    private void swapColors(Node node){
        node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
    }

    private Node rebalance(Node node){
        boolean needBalance = true;
        Node cur = node;
        do{
            needBalance = false;
            if(cur.right != null && cur.right.color == Color.RED && (cur.left == null || cur.left.color == Color.BLACK)){
                cur = leftTurn(cur);
                needBalance = true;
            }
            if(cur.left.left != null){
                if(cur.left != null && cur.left.color == Color.RED && cur.left.left.color == Color.RED){
                    cur = rightTurn(cur);
                    needBalance = true;
                }
            }
            if(cur.left != null && cur.left.color == Color.RED && cur.right != null && cur.right.color == Color.RED){
                swapColors(cur);
                needBalance = true;
            }
        }while(needBalance);
        return cur;
    }

    public void print(){
        print(root, 0);
    }

    private void print(Node node, int depth){
        if(node == null){
            return;
        }
        print(node.left, depth+4);
        for (int i = 0; i < depth; i++)
            System.out.print(" ");
        System.out.println("Value: "+node.value+" {color: "+node.color+"}");
        print(node.right, depth+4);
    }
}
