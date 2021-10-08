/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori;

/**
 *
 * @author lenovo
 */
class Barang {
    String kode_barang;
    String nama_barang;
    private int Stok;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        setStok(stk);
    }
    
    public int getStok(){
        return Stok;
    }
    
    public void setStok(int Stok){
        this.Stok += Stok;
    }
}
