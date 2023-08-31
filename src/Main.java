import java.util.Random;

public class Main {
    public static void main(String[] args) {


            int tomb[] = new int [20];
            Random random = new Random();
            for (int i = 0; i < tomb.length; i++){
                tomb[i] = random.nextInt(1,100);

            }
        }
        public static void getMinFromArray(int tomb[]){
        int min=tomb[0];
            for (int i = 1; i < tomb.length ; i++) {
                if(min>tomb[i]){
                    min=tomb[i];
                }

            }
        }
        public static void countEvenNumbers(int tomb[]){
        int sum=0;
            for (int i = 0; i < tomb.length ; i++) {
                if(tomb[i]%2==0){
                    sum++;
                }
            }
        }
        public static void sumUnevenNumbers(int tomb[]){
        int sum=0;

            for (int i = 0; i < tomb.length ; i++) {
                if(tomb[i]%2!=0){
                    sum+=tomb[i];
                }

            }
    }
    }






