
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        while(num !=0){
            if(num < 0){
                System.out.println("Unsuitable number");
            }else {
                num *= num;
                System.out.println(num);
            }
            System.out.println("Give a number:");
            num = scanner.nextInt();
        }
    }
}
