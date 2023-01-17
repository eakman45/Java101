import java.util.Scanner;

public class logging {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);
        System.out.println("Username = ");
        username = inp.nextLine();
        System.out.println("Password = ");
        password = inp.nextLine();

        if(username.equals("Ege Akman") && password.equals("Java123")) {
            System.out.println("Logged in Succesfully");

        }
        else{
            System.out.println("Wrong information!");
        }
    }
}