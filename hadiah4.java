import java.util.Scanner;
public class hadiah4 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan nilai tugas 1: ");
		double nilai1 = input.nextDouble();
		System.out.print("Masukkan nilai tugas 2: ");
		double nilai2 = input.nextDouble();
		System.out.print("Masukkan nilai tugas 3: ");
		double nilai3 = input.nextDouble();
		System.out.print("Masukkan nilai MID: ");
		double mid = input.nextDouble();
		System.out.print("Masukkan nilai final: ");
		double nilaifinal = input.nextDouble();
		double rata2tugas = (nilai1 + nilai2 + nilai3)/3;
		double nilaiakhir = (rata2tugas*0.3) + (mid*0.3) + (nilaifinal*0.4);
		
		char nilaihuruf;
		if((nilaiakhir>=80)&&(nilaiakhir<=100)) {
			nilaihuruf = 'A';
		}	else if ((nilaiakhir>=60)&&(nilaiakhir<80)) {
			nilaihuruf = 'B';
		}	else if ((nilaiakhir>=50)&&(nilaiakhir<60)) {
			nilaihuruf = 'C';
		}	else if ((nilaiakhir>=40)&&(nilaiakhir<50)) {
			nilaihuruf = 'D';
		}	else 
				nilaihuruf = 'E';
		
		System.out.println("Nama: " + nama);
		System.out.println("Nilai akhir: " + nilaiakhir);
		System.out.println("Nilai huruf: " + nilaihuruf);
	}
}