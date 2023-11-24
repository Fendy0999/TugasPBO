/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.erik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReaderExample {
    public static String bacaFile(String fileName) {
        BufferedReader reader = null;
        try {
            
            reader = new BufferedReader(new FileReader(fileName));

            
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (FileNotFoundException e) {
           
            System.err.println("File tidak ditemukan: " + fileName);
            return null;
        } catch (IOException e) {
            
            System.err.println("Terjadi kesalahan saat membaca file: " + fileName);
            return null;
        } finally {
            
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Terjadi kesalahan saat menutup file");
                }
            }
        }
    }

    public static void main(String[] args) {
 
        String fileName = "contoh.txt";
        String fileContent = bacaFile(fileName);

        if (fileContent != null) {
            System.out.println("Isi file " + fileName + ":\n" + fileContent);
        } else {
            System.out.println("Gagal membaca file " + fileName);
        }
    }
}

