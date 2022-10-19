import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int maxDay= 0;
        int birthHour = 0;
        int birthMin = 0;
        birthYear = SafeInput.getRangedInt(in,"\nWhat is your birth year? ",1950,2010);
        birthMonth = SafeInput.getRangedInt(in,"\nWhat is your birth month? ",1,12);
        switch (birthMonth){
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12): maxDay = 31;
            break;
            case (4):
            case (6):
            case (9):
            case (11): maxDay = 30;
            break;
            case (2):
                if (birthYear%4==0){
                    maxDay = 29;
                }
                else{
                    maxDay = 28;
                }
            default:
        }
        birthDay = SafeInput.getRangedInt(in,"\nWhat is your birth day? ",1,maxDay);
        birthHour = SafeInput.getRangedInt(in,"\nWhat hour were you born? ",1,24);
        birthMin = SafeInput.getRangedInt(in,"\nWhat minute were you born? ",1,59);
    }
}
