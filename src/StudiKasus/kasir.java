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
class kasir extends Pembeli
{
  private String tanggal;
    private String namaKasir;
    
    public kasir(String tanggal, String namaKasir,
                 int id_pembeli, String namaPembeli, String alamat, String no_telp,
                 int id_barang, String namaBarang, String merkBarang, int hargaBarang)
    {
        super(id_pembeli, namaPembeli, alamat, no_telp, id_barang, namaBarang, merkBarang, hargaBarang);
        this.tanggal = tanggal;
        this.namaKasir = namaKasir;
    }
    
    public void barang()
    {
        System.out.println("Tanggal       : "+this.tanggal);
        System.out.println("Nama Kasir    : "+this.namaKasir);
        super.barang();
    }  
}
