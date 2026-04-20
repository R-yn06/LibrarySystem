/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandregister;

/**
 *
 * @author glyzi
 */
public class UserStorage {
    private String[] usernames = new String[50];
    private String[] passwords = new String[50];
    private int count = 0;
    private static final String FILE = "users.txt";
 
    public UserStorage() {
        loadFromFile();
    }
 
    public String register(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (usernames[i].equals(username)) {
                return "Username already exists.";
            }
        }
        usernames[count] = username;
        passwords[count] = password;
        count++;
        saveToFile();
        return "Registration successful!";
    }
 
    public boolean login(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (usernames[i].equals(username) &&
                passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }
 
    private void saveToFile() {
        try (java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter(FILE))) {
            for (int i = 0; i < count; i++) {
                writer.println(usernames[i] + "|" + passwords[i]);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error saving users: " + e.getMessage());
        }
    }
 
    private void loadFromFile() {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 2) {
                    usernames[count] = parts[0];
                    passwords[count] = parts[1];
                    count++;
                }
            }
        } catch (java.io.IOException e) {
            System.out.println("No existing users found, starting fresh.");
        }
    }
}
