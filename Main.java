/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumblr;

/**
 *
 * @author Norisa Defriani
 */
/**
 * Class Main digunakan untuk menjalankan method yang ada pada class Botol.
 */
public class Main {
 
    public static void main(String[] args) {
/**
 * Membuat objek dengan nama variabel botol1 dan botol2 dengan menginisialisasi
 * atribut merk, harga, dan material.
 */        
        Botol botol1 = new Botol("Corkcicle", 800000, "Stainless");
        Botol botol2 = new Botol("Quokka", 180000, "Plastik");
    
/**
 * Menggunakan method KriteriaTumblr() pada objek botol1 dan botol2
 * untuk menampilkan informasi Tumblr
 * Dan menggunakan method KategoriHarga() untuk mengelompokkan tumblr 
 * berdasarkan kategori harga.
 */
    botol1.KriteriaTumblr();
    botol1.KategoriHarga();
    System.out.println("--------------------------"); //digunakan untuk pemisah 
    botol2.KriteriaTumblr();
    botol2.KategoriHarga();
        
    }
}

