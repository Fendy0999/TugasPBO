/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermarket;

/**
 *
 * @author Lenovo
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// Kelas Exception khusus
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Supermarket {
    static String kode_barang, nama_barang, gudang;
    static double harga_beli, harga_jual;
    static int jumlah_barang;

    // Method untuk menetapkan harga dan jumlah barang, dengan penanganan MyException
    static void setHarga(double harga_jual, int jumlah_barang) throws MyException {
        if (harga_jual <= 0 || jumlah_barang < 1) {
            throw new MyException("Terjadi Kesalahan: Harga jual dan jumlah barang harus lebih dari 0 dan 1, masing-masing.");
        }
        System.out.println("Transaksi berhasil! Harga Jual: " + harga_jual + " & Jumlah Barang yang dibeli: " + jumlah_barang);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan Harga Jual: ");
            double input_harga_jual = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            int input_jumlah_barang = scanner.nextInt();

            setHarga(input_harga_jual, input_jumlah_barang);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi Kesalahan: Masukan harus berupa angka.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

