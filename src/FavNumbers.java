import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in,"\nWhat is your favorite Whole Number?");
        favDouble = SafeInput.getDouble(in,"\nWhat is your favorite decimal Number?");

    }
}
