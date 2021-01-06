//Kelompok-12
import java.util.*;


public class OnlineShop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		ArrayList<String> arrNama = new ArrayList<String>();
		ArrayList<Integer> arrJumlah = new ArrayList<Integer>();
		
		String nama = "";
		String alamat = "";
		String noHP= "";
		int pilihPem = 0;
		String pilihJ = "";
		int pilihP = 0;
		String pilihS = "";
		int pilihB = 0;
		long harga = 0;
		long total = 0;
		String lanjut = "";
		String text = "";
		int pilihL = 0;
		int totalBarang = 0;
		int pilihK = 0;
		boolean pro = true;
		String namaP = "";
		int pilihO = 0;

		System.out.println("**********************************************");
		System.out.println("\tSelamat Datang di Toko Kel12");
		System.out.println("**********************************************");
		do{
			do{
				System.out.println("Pilih Kategori Pakaian");
				System.out.println("1. Pakaian Wanita");
				System.out.println("2. Pakaian Laki-Laki");
				System.out.print("Masukkan Kode(Pilih satu angka): ");
				try{
					pilihK = input.nextInt();
					if(pilihK == 1){
						do{
							System.out.println("");
							System.out.println("Pilih Brand");
							System.out.println("1. Zara");
							System.out.println("2. H&M");
							System.out.print("Masukkan Kode(Pilih satu angka): ");
							try{
								pilihB = input.nextInt();
								if(pilihB == 1){
									do{
										System.out.println("");
										System.out.println("Pilih Produk");
										System.out.println("1. Meanswear Shirt        Rp 150.000");
										System.out.println("2. Paperbag Elastic Jeans Rp 200.000");
										System.out.println("3. Cropped Top            Rp 300.000");
										System.out.print("Masukkan Kode(Pilih satu angka): ");
										try{
											pilihP = input.nextInt();
											if (!(pilihP == 1 || pilihP == 2 || pilihP == 3)) {
												System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
											}
										}catch(Exception e){
											System.out.println("   Input Hanya Boleh Angka!");
											input.nextLine();
										}
									}while(!(pilihP == 1 || pilihP == 2 || pilihP == 3));
									switch(pilihP){
										case 1:
										   namaP = "Meanswear Shirt";
										   harga = 150000;
										   break;
										case 2:
										   namaP = "Paperbag Elastic Jeans";
										   harga = 200000;
										   break;
										case 3: 
										   namaP = "Cropped Top";
										   harga = 100000;
										   break;
									}
									System.out.println("");
								}else if(pilihB == 2){
									do{
											System.out.println("");
											System.out.println("Pilih Produk");
											System.out.println("1. Alpaca Blend Sweater Rp 110.000");
											System.out.println("2. Hoodie               Rp 100.000");
											System.out.println("3. Mom High Ankle Jeans Rp 150.000");
											System.out.print("Masukkan Kode(Pilih satu angka): ");
										try{
										    pilihP = input.nextInt();
										    if (!(pilihP == 1 || pilihP == 2 || pilihP == 3)) {
												System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
											}
										}catch(Exception ex){
											System.out.println("   Input Hanya Boleh Angka!");
											input.nextLine();
										}
									}while(!(pilihP == 1 || pilihP == 2 || pilihP == 3));
									switch(pilihP){
										case 1:
										   namaP = "Alpaca Blend Sweater";
										   harga = 110000;
										   break;
										case 2:
										   namaP = "Hoodie";
										   harga = 100000;
										   break;
										case 3:
										   namaP = "Mom High Ankle Jeans"; 
										   harga = 150000;
									}
									System.out.println("");
									
								}else{
									System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
								}
						    }catch(Exception e){
						    	System.out.println("   Input Hanya Boleh Angka!");
								input.nextLine();
						    }
						}while(!(pilihB == 1 || pilihB == 2));
						
						
					}else if(pilihK == 2){
						do{
							System.out.println("");
							System.out.println("Pilih Brand");
							System.out.println("1. Crocodile");
							System.out.println("2. Cardinal");
							System.out.print("Masukkan Kode(Pilih satu angka): ");
							try{
								pilihB = input.nextInt();
								System.out.println("");
								if(pilihB == 1){
									do{
										System.out.println("Pilih Produk");
										System.out.println("1. Dale Ivory (Shirt)  Rp 200.000");
										System.out.println("2. Sloe Black (1 set)  Rp 100.000");
										System.out.println("3. Clas Gray (T-Shirt) Rp 150.200");
										try{
											System.out.print("Masukkan Kode(Pilih satu angka): ");
											pilihP = input.nextInt();
											if (!(pilihP == 1 || pilihP == 2 || pilihP == 3)) {
												System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
											}
										}catch(Exception e){
											System.out.println("   Input Hanya Boleh Angka!");
											input.nextLine();
										}
									}while(!(pilihP == 1 || pilihP == 2 || pilihP == 3));
									switch(pilihP){
										case 1:
										   namaP = "Dale Ivory (Shirt)";
										   harga = 200000;
										   break;
										case 2:
										   namaP = "Sloe Black (1 set)";
										   harga = 100000;
										   break;
										case 3: 
										   namaP = "Clas Gray (T-Shirt)";
										   harga = 150000;
										   break;
									}
									System.out.println("");
									
									
								}else if(pilihB == 2){
									do{
										System.out.println("Pilih Produk");
										System.out.println("1. Jeans Skinny Rp 300.000");
										System.out.println("2. Jeans Jacket Rp 250.000");
										System.out.println("3. Jeans Kemeja Rp 150.000");
										System.out.print("Masukkan Kode(Pilih satu angka): ");
										try{
											pilihP = input.nextInt();
											if (!(pilihP == 1 || pilihP == 2 || pilihP == 3)) {
												System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
											}
										}catch(Exception e){
											System.out.println("   Input Hanya Boleh Angka!");
											input.nextLine();
										}
									}while(!(pilihP == 1 || pilihP == 2 || pilihP == 3));
									switch(pilihP){
										case 1:
										   namaP = "Jeans Skinny";
										   harga = 300000;
										   break;
										case 2:
										   namaP = "Jeans Jacket";
										   harga = 250000;
										   break;
										case 3: 
										   namaP = "Jeans Kemeja";
										   harga = 150000;
									}System.out.println("");
								}else{
									System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
								}
							}catch(Exception e){
								System.out.println("   Input Hanya Boleh Angka!");
								input.nextLine();
							}
						}while(!(pilihB == 1 || pilihB == 2));
					}else{
						System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
					}
				}catch(Exception e){
				    System.out.println("   Input Hanya Boleh Angka!");
					input.nextLine();	
				}
			}while(!(pilihK == 1 || pilihK == 2));
			do{
				System.out.print("Masukkan Size(XL/L/M/S): ");
				pilihS = input.next();
				if(!(pilihS.equalsIgnoreCase("XL") || pilihS.equalsIgnoreCase("L") || pilihS.equalsIgnoreCase("M") || pilihS.equalsIgnoreCase("S"))){
					System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
				}
			}while(!(pilihS.equalsIgnoreCase("XL") || pilihS.equalsIgnoreCase("L") || pilihS.equalsIgnoreCase("M") || pilihS.equalsIgnoreCase("S")));
			
			System.out.println("");
			do{
				System.out.print("Jumlah: ");
				pilihJ = input.next();
				if(!pilihJ.matches("[0-9]*"))
					System.out.println("   Input Hanya Boleh Angka!");
			}while(!pilihJ.matches("[0-9]*"));

			
			if (arrNama.size() == 0) {
				arrNama.add(namaP);
				arrJumlah.add(Integer.parseInt(pilihJ));
			}else if ((arrNama.size() > 0)){
				for (int i = 0; i < arrNama.size(); i++) {
					System.out.println(arrNama.get(i));
					System.out.println(arrJumlah.get(i));
					if(arrNama.get(i).equals(namaP)){
						arrJumlah.set(i, arrJumlah.get(i)+Integer.parseInt(pilihJ));
					}else if(!arrNama.get(i).equals(namaP)){
						arrNama.add(namaP);
						arrJumlah.add(Integer.parseInt(pilihJ));
						break;
					}
				}
			}
				totalBarang += Integer.parseInt(pilihJ);
				total +=(Integer.parseInt(pilihJ)*harga);

			do{
				System.out.println("");
				System.out.println("Apakah ingin menambah pesanan?");
				System.out.println("1. Ya");
				System.out.println("2. Tidak");
				System.out.print("Masukkan Kode: ");
				try{
					pilihL = input.nextInt();
					if(!(pilihL == 1 || pilihL == 2)){
						System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
					}
				}catch(Exception e){
					System.out.println("   Input Hanya Boleh Angka!");
					input.nextLine();
				}
			}while(!(pilihL == 1 || pilihL == 2));
		}while(pilihL == 1 );
		System.out.println("");
		System.out.println("Konfrimasi Pesanan:");
		for (int j = 0; j < arrNama.size(); j++) {
			System.out.println(arrNama.get(j) + "\t" + arrJumlah.get(j));
		}
		do{
			System.out.println("");
			System.out.println("Opsi:");
			System.out.println("1. Lanjutkan(Check Out)");
			System.out.println("2. Keluar Aplikasi");
			System.out.print("Masukkan Opsi: ");
			try{
				pilihO = input.nextInt();
				if(pilihO == 1){
					System.out.println("");
					System.out.println("Masukkan Data Diri:");
					do{
						System.out.print("Nama: ");
						nama = input1.nextLine();
						if(!nama.matches("[a-zA-Z\\s]*")){
							System.out.println("   Input Hanya Boleh Huruf!");
						}
					}while(!nama.matches("[a-zA-Z\\s]*"));
					do{
						System.out.print("No.Hp: ");
						noHP = input.next();
						if(!noHP.matches("[0-9*]") && (noHP.length() <= 10 || noHP.length() > 13)){
							System.out.println("   Input Hanya Boleh Angka!");
						}
					}while(!noHP.matches("[0-9*]") && (noHP.length() <= 10 || noHP.length() > 13));
					//System.out.print("No.Hp: ");
					//noHP = input.next();
					System.out.print("Alamat: ");
					alamat =input1.nextLine();
					System.out.println("");
					System.out.println("Jasa Pengiriman: J&T");
					System.out.println("");
					System.out.println("Pilih Jenis Pembayaran");
					System.out.println("1. BNI");
					System.out.println("2. BRI");
					do{
						System.out.print("Masukkan Kode: ");
						try{
							pilihPem = input.nextInt();
							if (!(pilihPem == 1 ||pilihPem == 2)) {
								System.out.println("Maaf Kode Yang Anda Masukkan Salah. Silahkan Ulangi Kembali!");
							}
						}catch(Exception e){
							System.out.println("   Input Hanya Boleh Angka!");
							input.nextLine();
						}
					}while(!(pilihPem == 1 ||pilihPem == 2));
					switch(pilihPem){
						case 1:
						text = "Lakukan Pembayaran Ke Rekening 0264146096/a.n Kel.12";
						break;
						case 2:
						text = "Lakukan Pembayaran Ke Rekening 322701040260536/a.n Kel.12";
					}
				
					System.out.println("");
					System.out.println("Struk Pembayaran");
					System.out.println("Nama: " + nama);
					System.out.println("No. Hp: " + noHP);
					System.out.println("Alamat: " + alamat);
					System.out.println("Jumlah Barang: " + totalBarang);
					System.out.println("Ongkir: 20000");
					if(total >= 500000){
						total = total - ((total * 10)/100);
						System.out.println("Total Pembayaran: " + (total + 20000));
						System.out.println("Anda mendapatkan potongan sebesar 10%");
					}else if(total < 500000){
						System.out.println("Total Pembayaran: " + (total + 20000));
					}

					System.out.println("");
					System.out.println(text);
					System.out.println("Silahkan lanjutkan pembayaran paling lambat 1*24 jam, \njika lebih dari waktu yang ditentukan, sistem akan membatalkan pesanan secara otomatis.");
					System.out.println("Terima Kasih, Sudah Berbelanja. Semoga Hari Anda Menyenangkan.");
				}else if(pilihO == 2){
					System.out.println("Terim kasih sudah berkunjung di aplikasi kami.");
					break;
				}else if(pilihO != 1 || pilihO != 2){
					System.out.println("Maaf kode yang anda masukkan salah, silahkan ulangi kembali");
				}
			}catch(Exception e){
				System.out.println("   Input Hanya Boleh Angka!");
				input.nextLine();
			}
		}while(!(pilihO == 1 || pilihO == 2));
		

	}
}
