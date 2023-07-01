package com.prowings.single_table_strategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.FourWheeler;
import com.prowings.entity.TwoWheeler;
import com.prowings.entity.Vehicle;

public class TestSigleTableStrategyFetch {
	
	public static void main(String[] args) {
		
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		TwoWheeler tw = session.get(TwoWheeler.class, 2);
		
		System.out.println(tw);
		
		txn.commit();
		session.close();

		
	}

}
