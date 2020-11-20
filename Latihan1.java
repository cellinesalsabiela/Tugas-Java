package praktikum3;

public class Latihan1 {

    public static void main(String[] args) {
	String hobiSaya = "Bermain Petak umpet";
	boolean apakahPandai = true;
	char jenisKelamin = 'L';
	byte umurSaya = 20;
	double ipk = 3.24, tinggi = 1.78;
	System.out.println("hobySaya");
	System.out.println("Apakah murid ini pandai? " + apakahPandai);
	System.out.println("Jenis kelamin : " + jenisKelamin);
	System.out.println("Umur ku saat ini :" + umurSaya);
	System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
