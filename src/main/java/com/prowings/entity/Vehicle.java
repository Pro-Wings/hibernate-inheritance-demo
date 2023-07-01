package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_DETAILS")
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(
//		  name="VEHICLE_TYPE", 
//		  discriminatorType=DiscriminatorType.STRING
//		  )
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	int id;
	@Column(name = "VEHICLE_NAME")
	String name;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + "]";
	}

}
