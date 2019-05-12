package Loops;

import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {

		String s1 = JOptionPane.showInputDialog("Ogrencinin notunu giriniz (0-100) : ");
		int not = Integer.parseInt(s1);

		String s;

		if (not >= 90) {
			s = "A";
		} else if (not >= 75) {
			s = "B";
		} else if (not >= 60) {
			s = "C";
		} else if (not >= 50) {
			s = "D";
		} else if (not >= 40) {
			s = "E";
		} else {
			s = "F";
		}
		s = " ogrencinin notu = " + s;
		JOptionPane.showMessageDialog(null, s);

	}
}