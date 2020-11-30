//RPL Kel.12
//Belum Lengkap
import java.util.*;

public class OnlineShop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih Kategori Pakaian");
		System.out.println("1. Pakaian Wanita");
		System.out.println("2. Pakaian Laki-Laki");
		System.out.println("Masukkan Kode: ");
		int pilihK = input.nextInt();

		if(pilihK == 1){
			System.out.println("Pilih Brand");
			System.out.println("1. Zara");
			System.out.println("2. H&M");
			System.out.println("Masukkan Kode: ");
			int pilihB = input.nextInt();

			if(pilihB == 1){
				System.out.println("Pilih Produk");
				System.out.println("1. ");
				System.out.println("2. ");
				System.out.println("3. ");
				System.out.println("Masukkan Kode: ");
				int pilihP = input.nextInt();
				System.out.println("Masukkan Size(XL-S): ");
				int pilihS1 = input.next();
				System.out.println("Jumlah: ");
				int pilihJ1 = input.nextInt();
			}else(pilihB == 2){
				System.out.println("Pilih Produk");
				System.out.println("1. ");
				System.out.println("2. ");
				System.out.println("3. ");
				System.out.println("Masukkan Kode: ");
				int pilihP = input.nextInt();
				System.out.println("Masukkan Size(XL-S): ");
				int pilihS2 = input.next();
				System.out.println("Jumlah: ");
				int pilihJ2 = input.nextInt();
			}
			System.out.println("Masukkan Data Diri:");
			System.out.println("Nama: ");
			System.out.println("No.Hp: ");
			System.out.println("Alamat: ");

			System.out.println("Jasa Pengiriman: J&T");

			System.out.println("Pilih Jenis Pembayaran");
			System.out.println("1. ATM");
			System.out.println("2. VA");

			System.out.println("Struk Pembayaran");
			System.out.println("Nama: ");
			System.out.println("No. Hp: ");
			System.out.println("Alamat: ");
			System.out.println("Jumlah Barang: ");
			System.out.println("Total Pembayaran: ");
		}
	}
}