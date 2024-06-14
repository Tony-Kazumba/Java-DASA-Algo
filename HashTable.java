import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;
    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(){
        dataMap = new Node[size];
    }

    public void printTable(){
        for(int i = 0; i < dataMap.length; ++i){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
    private int hash(String key){
        int hash = 0;
        char[] keyChar = key.toCharArray();
        for(int i = 0; i < keyChar.length; ++i) {
            int asciivalue = keyChar[i];
            hash = (hash + asciivalue * 23) % dataMap.length;
        }
        return hash;
    }
    public void set(String key, int value){

        int index = hash(key);
        Node temp = dataMap[index];
        Node node = new Node(key,value);
        if(temp == null){
            temp = node;
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        boolean foundKey = false;
        while(temp != null){
            if(temp.key == key){
                foundKey = true;
                break;
            }
            temp = temp.next;
        }
        if(foundKey) return temp.value;
        return 0;
    }

    public ArrayList<String> keys(){
        ArrayList<String> keys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; ++i){
            Node temp = dataMap[i];
            while (temp != null){
                keys.add(temp.key);
                temp = temp.next;
            }
        }
        return keys;
    }
}
