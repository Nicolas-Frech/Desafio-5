import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva uma palavra ou frase: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String reversedString = "";

        for(int i = string.length() - 1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);
        }

        System.out.println(reversedString);
    }
}