/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author lenovo
 */
class Toko 
{
    public int id_barang, hargaBarang;
    public String namaBarang, merkBarang;
    
    public Toko(int id_barang, String namaBarang, String merkBarang, int hargaBarang)
    {
        this.id_barang = id_barang;
        this.hargaBarang = hargaBarang;
        this.namaBarang = namaBarang;
        this.merkBarang = merkBarang;
    }
    
    public void barang()
    {
        System.out.println("Id Barang     : "+this.id_barang);
        System.out.println("Harga Barang  : "+this.hargaBarang);
        System.out.println("Nama Barang   : "+this.namaBarang);
        System.out.println("Merk Barang   : "+this.merkBarang);
    }
}
