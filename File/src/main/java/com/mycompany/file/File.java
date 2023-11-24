/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        String fileName = "Latihan.txt";
        FileReader reader = bacaFile(fileName);
        if (reader == null) {
            // Tambahkan pengecekan untuk pesan kesalahan spesifik
            System.out.println("File tidak ditemukan: " + fileName + " (The system cannot find the file specified)");
        } else {
            try {
                // Lakukan operasi membaca file di sini jika perlu
                reader.close(); // Tutup file setelah selesai membaca
            } catch (IOException e) {
                System.out.println("File tidak dapat ditutup: " + e.getMessage());
            }
        }
    }

    public static FileReader bacaFile(String fileName) {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            // Kembalikan null dan biarkan pesan kesalahan ditangani di main
            return null; // Mengembalikan null jika file tidak ditemukan
        }
        return reader;
    }
}
