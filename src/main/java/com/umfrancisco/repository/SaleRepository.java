package com.umfrancisco.repository;

import java.util.List;
import org.hibernate.query.Query;
import com.umfrancisco.model.Sale;

public class SaleRepository extends AbstractStoreRepository<Sale> {

	@Override
	public void save(Sale sale) {
		commit(sale);
	}

	@Override
	public List<Sale> findAll() {
		Query<Sale> query = session.createQuery("from Sale", Sale.class);
		List<Sale> list = query.getResultList();
		return list;
	}

	@Override
	public Sale findById(long id) {
		Sale s = null;
		s = session.find(Sale.class, id);
		return s;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
	}
	
}
