package com.hrm.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyUtil {
    public static String getLastMonth() {
        LocalDate today = LocalDate.now();
        today = today.minusMonths(1);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM");
        return formatters.format(today);
    }
}
