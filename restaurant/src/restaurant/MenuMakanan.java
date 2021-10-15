/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author lenovo
 */
public class MenuMakanan {
    private final Restaurant Makanan = new Restaurant();
    private static byte food_id = 0;
	
    public void tambahMenuMakanan(String nama, int harga, int stok) {
        Makanan.setHargaMakanan(harga, food_id);
        Makanan.setNamaMakanan(nama, food_id);
	Makanan.setStok(stok, food_id);
	food_id++;
    }

    public void tampilMenuMakanan(){
        System.out.println("----------------------------");
            for(byte i =0; i<=food_id;i++){
		if(!isOutOfStock(i)){
                    System.out.println(i+1+". "+Makanan.getNamaMakanan(i) +"["+ Makanan.getStok(i) +"]"+"\tRp. "+ Makanan.getHargaMakanan(i));
            }
        }
    }

	public boolean isOutOfStock(byte id){
            return Makanan.getStok(id) == 0;
	}

	public void pesanMakanan(int food_id, int total) {
        food_id= food_id-1;
	int id = (byte) food_id;
        if(total > 0)
            Makanan.cutStok(id, total);
	}
    }
   
