import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap(){
        heap = new ArrayList<Integer>();
    }

    public int leftChild(int index){
        return 2*index + 1;

    }

    public int rightChild(int index){
        return 2*index + 2;

    }

    public int parent(int index){
        return (index-1)/2;
    }

    public void swap (int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2,temp);
    }

    public void insert(int value){
        heap.add(value);
        int currentIndex = heap.size()-1;
        while(currentIndex > 0){
            int currentElement = heap.get(currentIndex);
            int parenElement = heap.get(parent(currentIndex));
            if( currentElement > parenElement){
                swap(currentIndex, parent(currentIndex));
            }
            currentIndex = parent(currentIndex);
        }

    }

}
