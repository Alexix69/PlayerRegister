
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        System.out.println("Give two indices to swap:");
        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();
        interchange(array, pos1, pos2);
        // and then swapping them

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
    
    public static void interchange(int[] array, int pos1, int pos2){
        int aux = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = aux;
    }

}
