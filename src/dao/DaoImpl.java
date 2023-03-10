package dao;

public class DaoImpl implements IDao{

	@Override
	public double getdata() {
		return Math.random()*100;
	}

}
