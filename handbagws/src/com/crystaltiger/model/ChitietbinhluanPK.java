package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chitietbinhluan database table.
 * 
 */
@Embeddable
public class ChitietbinhluanPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int mabl;

	@Column(insertable=false, updatable=false)
	private int manv;

	@Column(insertable=false, updatable=false)
	private int masp;

	public ChitietbinhluanPK() {
	}
	public int getMabl() {
		return this.mabl;
	}
	public void setMabl(int mabl) {
		this.mabl = mabl;
	}
	public int getManv() {
		return this.manv;
	}
	public void setManv(int manv) {
		this.manv = manv;
	}
	public int getMasp() {
		return this.masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChitietbinhluanPK)) {
			return false;
		}
		ChitietbinhluanPK castOther = (ChitietbinhluanPK)other;
		return 
			(this.mabl == castOther.mabl)
			&& (this.manv == castOther.manv)
			&& (this.masp == castOther.masp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mabl;
		hash = hash * prime + this.manv;
		hash = hash * prime + this.masp;
		
		return hash;
	}
}