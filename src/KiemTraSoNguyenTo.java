import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not Prime");
        } else if (number<4){
            System.out.println(number + " is Prime");
        } else {
            boolean check = true;
            for (int i=2; i<=Math.sqrt(number); i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(number+" is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }
    }
}
