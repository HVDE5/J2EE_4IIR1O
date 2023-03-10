package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

	private IDao dao = null;
	@Override
	public double calcul() {
		return dao.getdata()/Math.PI;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
