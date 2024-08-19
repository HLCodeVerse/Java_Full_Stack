package Assignment_3;

import java.util.Scanner;

public class LoginSystem {
    private String username, password;
    LoginSystem(String username, String password){
        this.username=username;
        this.password=password;
    }
    public boolean authenticate( String username, String password){
        if( this.username.equals(username) && this.password.equals(password)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String username;
        String password;
        Scanner sc=new Scanner(System.in);
        System.out.println("Wlcome");
        System.out.println("--------------------------------");
        System.out.println("Enter username");
        username =sc.nextLine();
        System.out.println("-------------------");
        System.out.println("Enter password");
        password = sc.nextLine();
        System.out.println("-------------------");
        LoginSystem ls=new LoginSystem("chandan", "123");
        if(ls.authenticate(username, password)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Credentials");
        }
    }
}
