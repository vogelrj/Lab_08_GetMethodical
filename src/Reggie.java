import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String UserSSN = "";
        String UserID = "";
        String MenuChoice = "";
        UserSSN = SafeInput.getRegExString(in,"What is your SSN [XXX-XX-XXXX]?","\\d{3}-\\d{2}-\\d{4}");
        UserID = SafeInput.getRegExString(in,"What is your UC Student ID number?", "(M|m)\\d{5}");
        MenuChoice = SafeInput.getRegExString(in,"Please select Open [O], Save [S], View [V], or Quit [Q]: ","[OoSsVvQq]");


    }
}
