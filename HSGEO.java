import java.util.Scanner;

public class HSGEO {

	public static void main(String[] args) {
		int s�cakl�k;
		Scanner inp = new Scanner(System.in);
		System.out.println("S�cakl�k De�erini Giriniz");
		s�cakl�k=inp.nextInt();
		if (s�cakl�k >= 5 && s�cakl�k <= 15  ) {
			System.out.println("Sinema �zlemenizi �neririz");
		}else if (s�cakl�k >= 15 && s�cakl�k <= 25 ) {
			System.out.println("Piknik Yapman�z� �neririz.");
		}
		else if (s�cakl�k >25 ) {
			System.out.println("Y�zmenizi �neririz.");

	}else {
		System.out.println("Kayak yapman�z� �neriririz.");
	}

}}
