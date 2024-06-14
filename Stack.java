public class Stack {
    private int height;
    private Node top;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node node = new Node(value);
        top = node;
        ++height;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }
    public void push(int value){
        Node node = new Node(value);
        if(height == 0){
            top = node;
        }else {
            node.next = top;
            top = node;
        }
        ++height;
    }

    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        if(height == 1){
            top = null;
            height = 0;
            return temp;
        }
        top = top.next;
        temp.next = null;
        --height;
        return temp;
    }
}
