package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter product quantity, pcs.: ");
        String quantity = scanner.nextLine().trim();
        System.out.print("Enter product price, USD: ");
        String price = scanner.nextLine().trim();
        scanner.close();

        return new String[]{quantity, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

