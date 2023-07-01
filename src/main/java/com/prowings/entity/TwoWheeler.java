package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TWO_WHEELER")
//@DiscriminatorValue("TwoWheelerRecord")
public class TwoWheeler extends Vehicle {
	
	@Column(name="STEERING_TYPE")
	String steeringTwoWheeler;
	
	@Column(name = "TWO_WHL_STAND")
	String stand;

	public String getSteeringTwoWheeler() {
		return steeringTwoWheeler;
	}

	public void setSteeringTwoWheeler(String steeringTwoWheeler) {
		this.steeringTwoWheeler = steeringTwoWheeler;
	}

	public String getStand() {
		return stand;
	}

	public void setStand(String stand) {
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "TwoWheeler [steeringTwoWheeler=" + steeringTwoWheeler + ", stand=" + stand + ", id=" + id + ", name="
				+ name + "]";
	}


	
	
}
