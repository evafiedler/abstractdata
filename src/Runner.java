public class Runner {

    public static void main(String[] args){
        Arrays arr = new Arrays();

        arr.printArr(arr.arr);
        arr.printArrList(arr.list);

        Twod arra = new Twod();
        int[] happy = arra.findMax();
        for(int i = 0; i < 2; i++){
            System.out.println(happy[i]);
        }
        for(int i = 0; i < 5; i++){
            for(int a = 0; a < 5; a++){
                System.out.print(arra.arr[i][a]);
            }
            System.out.println();
        }
        StackExample stack = new StackExample();
        stack.getIntz();
        stack.getInt2();

    }

}
