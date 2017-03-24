package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chitietkhuyenmai database table.
 * 
 */
@Embeddable
public class ChitietkhuyenmaiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int masp;

	@Column(insertable=false, updatable=false)
	private int makm;

	public ChitietkhuyenmaiPK() {
	}
	public int getMasp() {
		return this.masp;
	}
	public void setMasp(int masp) {
		this.masp = masp;
	}
	public int getMakm() {
		return this.makm;
	}
	public void setMakm(int makm) {
		this.makm = makm;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChitietkhuyenmaiPK)) {
			return false;
		}
		ChitietkhuyenmaiPK castOther = (ChitietkhuyenmaiPK)other;
		return 
			(this.masp == castOther.masp)
			&& (this.makm == castOther.makm);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masp;
		hash = hash * prime + this.makm;
		
		return hash;
	}
}