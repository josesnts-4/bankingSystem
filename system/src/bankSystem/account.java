package bankSystem;

import java.util.Scanner;
public class account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        codingCreating Coding = new codingCreating();

        System.out.println("Creating Account: ");
        System.out.println("Enter your name: ");
        String holder = sc.nextLine();
        while (true) {
            System.out.println("what your date of birth");
            String birth = sc.nextLine();
            if (Coding.birth(birth)) {
                break;
            } else {
                System.out.println("Invalid format! Use dd/MM/yyyy: ");
            }
        }

        while (true) {
            System.out.println("What is your CPF (only numbers)");
            String cpf = sc.nextLine();

            if (cpf.length() == 11 && cpf.matches("\\d{11}")) {
                break;
            } else {
                System.out.println("CPF invalid! try with 11 caraters ");
            }

        }
        String confirmPassword;
        while (true) {
            System.out.println("Enter a password: ");
            String password = sc.nextLine();

            System.out.println("Confirm your password: ");
            confirmPassword = sc.nextLine();
            if (password.equals(confirmPassword)) {
                break;
            } else {
                System.out.println("The password does not match: Try again");
            }

        }
        System.out.println("Your account number is");
        int number = Coding.generation();
        System.out.println(number);
        System.out.println("**********************************************************************************************");

        System.out.println("Enter your account details: ");

        while (true) {
            System.out.print("Account Number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();// Limpa o "enter" do int

            System.out.print("Password: ");
            String passwordAccess = sc.nextLine();

            if (accountNumber == number && passwordAccess.equals(confirmPassword)) {
                break; // dados corretos, sai do loop
            } else {
                System.out.println("Account number or Password invalid");
            }

        }
        System.out.println("Access allowed to your account");

        sc.close();
    }
}

