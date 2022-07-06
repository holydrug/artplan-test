package com.popov.warm.up.util.input;

import java.util.Scanner;

public class ScannerUtil {
    private final Scanner scanner = new Scanner(System.in);

    public String getStringFromConsoleInput() {
        return scanner.nextLine();
    }
}
