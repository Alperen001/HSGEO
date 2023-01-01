import java.util.Scanner;

public class HSGEO {

	public static void main(String[] args) {
		int sýcaklýk;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sýcaklýk Deðerini Giriniz");
		sýcaklýk=inp.nextInt();
		if (sýcaklýk >= 5 && sýcaklýk <= 15  ) {
			System.out.println("Sinema Ýzlemenizi Öneririz");
		}else if (sýcaklýk >= 15 && sýcaklýk <= 25 ) {
			System.out.println("Piknik Yapmanýzý Öneririz.");
		}
		else if (sýcaklýk >25 ) {
			System.out.println("Yüzmenizi Öneririz.");

	}else {
		System.out.println("Kayak yapmanýzý öneriririz.");
	}

}}
