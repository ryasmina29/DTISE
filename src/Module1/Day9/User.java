package Module1.Day9;

import java.util.HashMap;
import java.util.Scanner;

public class User {
    private HashMap<String, String> userInfo;
    Scanner scanner = new Scanner(System.in);

    public User () {
        this.userInfo = new HashMap<>();
    }

    public HashMap<String, String> getUserInfo() {
        return userInfo;
    }

    public boolean isUserExists(String userName) {
        if (!userInfo.containsKey(userName)) {
            return false;
        }
        return true;
    }

    public void addNewUser() {
        System.out.println("Input New Username: ");
        String userName = scanner.nextLine();
        System.out.println("Input New Password: ");
        String userPassword = scanner.nextLine();
        userInfo.put(userName, userPassword);
        System.out.println("User " + userName + " has been created.");
    }
}
