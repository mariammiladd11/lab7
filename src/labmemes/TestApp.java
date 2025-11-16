/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmemes;

/**
 *
 * @author CYBER-TECH
 */
public class TestApp {
    public static void main(String[] args) {

        System.out.println("===== TEST SIGNUP =====");
        boolean ok = SignupService.signup(
                "mariam",
                "mariam@test.com",
                "1234",
                "student"
        );
        System.out.println("Signup success? " + ok);

        System.out.println("\n===== TEST DUPLICATE EMAIL =====");
        boolean duplicate = SignupService.signup(
                "other",
                "mariam@test.com",
                "9999",
                "student"
        );
        System.out.println("Duplicate signup? " + duplicate);

        System.out.println("\n===== TEST LOGIN (CORRECT) =====");
        User u1 = LoginService.login("mariam@test.com", "1234");
        System.out.println(u1 != null ? "Logged in: " + u1.getUsername() : "Login failed");

        System.out.println("\n===== TEST LOGIN (WRONG PASSWORD) =====");
        User u2 = LoginService.login("mariam@test.com", "0000");
        System.out.println(u2 != null ? "Logged in" : "Login failed (as expected)");

        System.out.println("\n===== TEST LOGIN (EMAIL NOT FOUND) =====");
        User u3 = LoginService.login("nothing@test.com", "1234");
        System.out.println(u3 != null ? "Logged in" : "Email not found (correct)");

        System.out.println("\n===== DONE =====");
    }
}

