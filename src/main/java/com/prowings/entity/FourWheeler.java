package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FOUR_WHEELER")
//@DiscriminatorValue("FourWheelerRecord")
public class FourWheeler extends Vehicle {
	
	@Column(name="STEERING_TYPE")
	String steeringFourWheeler;
	
	@Column(name ="VIPER")
	String viper;

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}

	public String getViper() {
		return viper;
	}

	public void setViper(String viper) {
		this.viper = viper;
	}

	@Override
	public String toString() {
		return "FourWheeler [steeringFourWheeler=" + steeringFourWheeler + ", viper=" + viper + ", id=" + id + ", name="
				+ name + "]";
	}
	
	
}
