package FinTrack.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static String formatCurrency(double amount) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("en", "US"));
        return format.format(amount);
    }
}
