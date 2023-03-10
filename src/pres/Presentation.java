package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.IDao;
import metier.IMetier;

public interface Presentation {
	public static void main(String[] args) {
		File f =new File("src/config.txt");
		try (Scanner scanner = new Scanner(f)) {
			String daoClassname=scanner.next();
			String metierClassName=scanner.next();
			Class<?> cdao=Class.forName(daoClassname);
			IDao dao= (IDao) cdao.getDeclaredConstructor().newInstance();
			Class<?> cmetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cmetier.getDeclaredConstructor().newInstance();
			Method method=cmetier.getMethod("setDao",IDao.class);
			method.invoke(metier,dao);
			System.out.printf("%,.2f °C",metier.calcul());
			} catch (Exception e) { e.printStackTrace(); }

	}
}
