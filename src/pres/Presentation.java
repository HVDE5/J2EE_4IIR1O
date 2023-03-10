package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public interface Presentation {
	
	public static void main(String[] args) {
		DaoImpl dao = new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.printf("%,.2f °C",metier.calcul());
	}
}
