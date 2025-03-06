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
Class Botol digunakan untuk membuat objek botol/tumblr 
dengan atribut merk, harga, dan material. 
*/ 
public class Botol {
    
/**
 * Membuat atribut public untuk merk dan harga, dan atribut private untuk 
 * material botol/tumblr.
 */
    public String merk;
    public int harga;
    private String material;

/**
 * Membuat konstruktor class Botol dengan parameter merk, harga, material dan 
 * digunakan untuk menginisialisasi atribut dari objek.
 */
    public Botol(String merk, int harga, String material) {
        this.merk = merk;
        this.harga = harga;
        this.material = material; 
    }
    
/** 
 * Membuat method setMaterial() untuk mengubah nilai dari atribut material,
 * karena atribut material bersifat private.
*/ 
    public void setMaterial(String material) {
        this.material = material;
    }
/** 
 * Membuat method getMaterial() untuk mengambil nilai atribut material yang
 * bersifat private.
 */
    public String getMaterial() {
        return material;        
    }
    
/**
 * /Method ini digunakan untuk menampilkan informasi tentang tumblr, yaitu 
 * merk, harga, dan material.
 */
    public void KriteriaTumblr() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Harga: " + this.harga);
        System.out.println("Material: " + this.material);
    }

/**
 * Method KategoriHarga ini digunakan untuk mengelompokkan tumblr berdasarkan
 * harga jualnya.
 */
    public void KategoriHarga() {
    if (this.harga > 500000) {
        System.out.println(this.merk + " adalah botol mahal.");
    } else {
        System.out.println(this.merk + " adalah botol murah.");
    }

    }
}


