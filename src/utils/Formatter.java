package FinTrack.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static String formatCurrency(double value) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.of("en", "US"));
        return format.format(value);
    }
}
