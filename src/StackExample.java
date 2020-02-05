import java.util.Random;
import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    Integer[] intz = new Integer[20];
    Integer[] int2 = new Integer[20];
    Random randoom = new Random();

    public StackExample(){
        for(int i = 0; i < 20; i++){
            Integer rand = randoom.nextInt(99) + 1;
            this.intz[i] = rand;
        }

        Arrays.sort(this.intz);

        Stack<Integer> stack = new Stack();

        for(int i = 0; i < 20; i++){
            stack.push(this.intz[i]);
        }

        for(int i = 0; i < 20; i++){
            this.int2[i] = (Integer) stack.pop();
        }

    }

    public void getIntz(){
        for(int i = 0; i < 20; i++){
            System.out.print(this.intz[i] + " ");
        }
        System.out.println();
    }

    public void getInt2(){
        for(int i = 0; i < 20; i++){
            System.out.print(this.int2[i] + " ");
        }
        System.out.println();
    }

}
