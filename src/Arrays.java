import java.util.*;

public class Arrays {
    int[] arr = new int[3];
    ArrayList<Integer> list = new ArrayList<>();

    public Arrays(){
        this.arr[0] = 1;
        this.arr[1] = 2;
        this.arr[2] = 3;

        this.list.add(5);
        this.list.add(6);
        this.list.add(7);
    }

    public void printArr(int[] arr){
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void printArrList(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
