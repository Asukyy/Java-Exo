
public class exo1_2 {

public static void main(String[] args) {

    int min = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[1]);

    for(int y = min; y<=max; y++){
    for(int i = 1; i<=100; i++){
        if(i%3 == 0 && i%5 == 0){
            System.out.print("FizzBuzz ");
        }
        else if(i%3 == 0){
            System.out.print("Fizz ");
        }
        else if(i%5 == 0){
            System.out.print("Buzz ");
        }
        else{
            System.out.print(i + " ");
        }
    }
}
}
}

