package com.fc.basicjavatraining;

import java.util.Scanner;

public final class ScannerUtil {
    private Scanner scanner;
    private static ScannerUtil instance;
    private static Object lock = new Object();
    
    private ScannerUtil() {
        scanner = new Scanner(System.in);
    }
    
    public static ScannerUtil get() {
        synchronized (lock) {
            if (instance == null) {
                instance = new ScannerUtil();
            }
        }
        return instance;
    }
    
    public int readInputNumber() {
        Integer angka = null;
        
        while (angka == null) {
            try {
                int input = scanner.nextInt();
                scanner.nextLine();
                
                angka = input;
            } catch (Exception e) {
                System.out.println("Input bukan angka");
            }
        }
        
        return angka;
    }
}
