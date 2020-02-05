import java.util.Random;

public class Twod {
    int[][] arr = new int[5][5];
    Random rand = new Random();

    public Twod(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int random = rand.nextInt(5);
                this.arr[i][j] = random;
            }
        }
    }

    public int[] findMax(){
        int max = 0;
        int vert = 0;
        int hori = 0;
        int test;
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 4; j++){
                test = this.arr[i - 1][j] + this.arr[i + 1][j] + this.arr[i][j - 1] + this.arr[i][j + 1] + this.arr[i][j];
                if(test > max){
                    max = test;
                    vert = i;
                    hori = j;
                }
            }
        }

        int[] arr = {vert, hori};

        return arr;
    }

}
