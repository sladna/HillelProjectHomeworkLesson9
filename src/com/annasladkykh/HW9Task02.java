package com.annasladkykh;

//2) Попросить пользователя ввести строку и имя файла. Записать строку в файл.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW9Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String fileName = sb.toString();
        sb.delete(0, sb.length());
        System.out.print("\nText: ");
        sb.append(scanner.nextLine());
        String text = sb.toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}