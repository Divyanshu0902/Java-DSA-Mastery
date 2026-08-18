
import java.util.Scanner;


class SwitchNewSyntax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit: ");

        String fruit = sc.next();

        switch(fruit){
            case "mango"  -> System.out.println("King of Fruits.");
            case "orange" -> System.out.println("Orange juicy fruit");
            case "banana" -> System.out.println("Yellow Aromatic fruit");
        }
    }
}