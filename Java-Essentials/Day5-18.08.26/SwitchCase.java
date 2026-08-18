import java.util.Scanner;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "mango" :
                System.out.println("King of Fruits!");
                break;
            case "banana" :
                System.out.println("Aromatic Yellow Fruit!");
                break;
            case "apple" :
                System.out.println("Sweet Red Fruit!");
                break;
            case "orange" :
                System.out.println("Juicy orange fruit!");
                break;
            default :
                System.out.println("Wrong CHoice!");
        }
    }
}