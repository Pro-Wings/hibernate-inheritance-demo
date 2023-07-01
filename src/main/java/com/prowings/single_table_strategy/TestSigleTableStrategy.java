package com.prowings.single_table_strategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.FourWheeler;
import com.prowings.entity.TwoWheeler;
import com.prowings.entity.Vehicle;

public class TestSigleTableStrategy {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("Car");
		
		TwoWheeler tw = new TwoWheeler();
		tw.setName("Yamaha");
		tw.setSteeringTwoWheeler("yamaha handle");
		tw.setStand("single side");
		
		FourWheeler fw = new FourWheeler();
		fw.setName("Suzuki");
		fw.setSteeringFourWheeler("Suzuki sport steering");
		fw.setViper("Bosch");
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(v);
		session.save(tw);
		session.save(fw);
		
		txn.commit();
		session.close();

		
	}

}
