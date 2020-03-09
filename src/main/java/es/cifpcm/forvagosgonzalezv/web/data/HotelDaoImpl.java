package es.cifpcm.forvagosgonzalezv.web.data;



import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.query.Query;

import es.cifpcm.forvagosgonzalezv.web.model.Hoteloffer;



public class HotelDaoImpl implements HotelDao{

	Transaction transaction;
	Session factory= HibernateUtil.getSessionFactory().openSession();
	
	public Hoteloffer insert(Hoteloffer hoteloffer) {
		// TODO Auto-generated method stub
		
		
		 try {
		     transaction=factory.beginTransaction();
		   factory.save(hoteloffer);
		   transaction.commit();
		 }
		 catch (Exception e) {
		     if (transaction!=null) transaction.rollback();
		     throw e;
		 }
		
		return hoteloffer;
	}


	@Override
	public List<Hoteloffer> selectAll() {
		
		// TODO Auto-generated method stub
		List<Hoteloffer> aList=new ArrayList<>();
		 try {
		     transaction=factory.beginTransaction();
		     Query<Hoteloffer> query = factory.createQuery("From hoteloffer");
		   aList=query.list();
		   //aList.addAll(factory..list();
		   transaction.commit();
		 }
		 catch (Exception e) {
		     if (transaction!=null) transaction.rollback();
		     throw e;
		 }
		return aList;
	}
}
