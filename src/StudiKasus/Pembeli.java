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
class Pembeli extends Toko
{
    private int id_pembeli;
    private String namaPembeli, alamat, no_telp;
    
   public Pembeli(int id_pembeli, String namaPembeli, String alamat, String no_telp, 
                  int id_barang, String namaBarang, String merkBarang, int hargaBarang)
   {
       super(id_barang, namaBarang, merkBarang, hargaBarang);
       this.id_pembeli = id_pembeli;
       this.namaPembeli = namaPembeli;
       this.alamat = alamat;
       this.no_telp = no_telp;
   }
   
   public void barang()
   {
       System.out.println("Id Pembeli    : "+this.id_pembeli);
       System.out.println("Nama Pembeli  : "+this.namaPembeli);
       System.out.println("Alamat        : "+this.alamat);
       System.out.println("No. Telepon   : "+this.no_telp);
       super.barang();
   }
}
