package com.mycompany.FileReaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaders {
    public static String bacaFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
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
        }
    }

    public static void main(String[] args) {
        String fileName = "nama_file.txt";
        String fileContent = bacaFile(fileName);

        if (fileContent != null) {
            System.out.println("Isi file " + fileName + ":\n" + fileContent);
        } else {
            System.out.println("Gagal membaca file " + fileName);
        }
    }
}
