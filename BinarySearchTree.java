public class BinarySearchTree{
    private Node root;
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
            return true;
        }
        Node temp = root;
        while(true){
            if(temp.value == node.value){
                break;
            }
            if(node.value < temp.value){
                if(temp.left == null){
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right == null){
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
        return false;
    }

    public boolean contains(int value){
        Node node = new Node(value);
        Node temp = root;
        if(node.value == temp.value) return true;
        while(temp != null){
            if(node.value == temp.value) return true;
            else if(node.value < temp.value){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

}
