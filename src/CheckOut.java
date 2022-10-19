import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double itemTotal = 0;
        boolean goAgain = false;
        do {
            itemCost = SafeInput.getRangedDouble(in,"What is the cost of your item? ",0.50,9.99);
            itemTotal = itemCost + itemTotal;
            goAgain = SafeInput.getYNConfirm(in,"Do you have another item [Y/N]?");
        }
        while (goAgain);
        System.out.printf("Your total is $" + "%.2f",itemTotal);

    }
}
