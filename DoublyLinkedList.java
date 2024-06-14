public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("head: " + head.value);
    }

    public void getTail(){
        System.out.println("tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("length: " + length);
    }

    public void append(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        ++length;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        --length;
        return temp;
    }

    public void prepend(int value){

        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;

        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;

        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i < index; ++i){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int j = length-1; j > index; --j){
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp == null) return false;
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        return true;

    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();
        Node temp = get(index);
        Node pre = temp.prev;
        pre.next =temp.next;
        temp.next.prev = pre;
        temp.next = null;
        temp.prev = null;
        --length;
        return temp;
    }

}
