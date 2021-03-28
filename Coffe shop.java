package com.company;
import java.util.Scanner;

public class Main {
    public double harga, total = 0, bayar, Kembalian;
    public int pil, jumlah;

    public void hitungTotal (int jml, int pil){

        if (pil == 1){
            harga = 10000;
            total = total + (harga * jml);
        }
        else if (pil == 2) {
            harga = 12000;
            total = total + (harga * jml);
        }
        else if (pil == 3) {
            harga = 13000;
            total = total + (harga * jml);
        }
        else {
            System.out.println(" EROR!!! INPUT YANG ANDA MASUKAN SALAH ");
        }
    }

    public void viewTotal() {
        System.out.println("==========PEMBAYARAN===========");
        System.out.println("TOTAL = RP. " + total);
    }

    public double hitungKembalian (double byr){
        bayar = byr;
        Kembalian = byr - total;
        return Kembalian;
    }

    public void viewkembalian() {
        System.out.println("KEMBALIAN RP. " + Kembalian);
        System.out.println("=====TERIMAKASIH======");
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        Main in = new Main();
        System.out.println ("===================================");
        System.out.println ("===========kedai minuman===========");
        do {
            System.out.println("===================================");
            System.out.println("===============MENU================");
            System.out.println(" 1. thai tea original ( Rp. 10.000)");
            System.out.println(" 2. es kopi susu      ( Rp. 12.000)");
            System.out.println(" 3. Macha Latte       ( Rp. 13.000)");
            System.out.println(" 0. keluar program");
            System.out.println("===================================");
            System.out.print("MASUKAN PILIHAN ANDA = ");
            in.pil = Input.nextInt();

            if (in.pil == 0) {
                break;
            }
            if (in.pil >= 1 && in.pil <= 3) {
                System.out.print("MASUKAN JUMLAH PEMBELIAN = ");
                in.jumlah = Input.nextInt();
                in.hitungTotal(in.jumlah, in.pil);
                in.viewTotal();
                System.out.print("BAYAR : RP. ");
                in.bayar = Input.nextDouble();
                double kembalian = in.hitungKembalian(in.bayar);
                System.out.println (kembalian);
                in.viewkembalian();
                in.pil = 9;
            } else {
                System.out.println("PILIHAN TIDAK VALID!");
            }
        } while (in.pil!=9);

    }
}