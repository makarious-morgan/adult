import java.util.Scanner;

public class adult {
    public static void main (String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        String Nation ="egyption";
        System.out.println("Enter your nationality");
        String  nation =scanner.nextLine();
        System.out.println("Enter your age");
        int   age = scanner.nextInt();
        if(age>=18&&nation.equals(Nation))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible ");
    }
}
