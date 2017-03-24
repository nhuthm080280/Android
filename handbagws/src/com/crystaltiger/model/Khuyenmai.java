package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the khuyenmai database table.
 * 
 */
@Entity
@NamedQuery(name="Khuyenmai.findAll", query="SELECT k FROM Khuyenmai k")
public class Khuyenmai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int makm;

	private String tenkm;

	//bi-directional many-to-one association to Chitietkhuyenmai
	@OneToMany(mappedBy="khuyenmai")
	private List<Chitietkhuyenmai> chitietkhuyenmais;

	public Khuyenmai() {
	}

	public int getMakm() {
		return this.makm;
	}

	public void setMakm(int makm) {
		this.makm = makm;
	}

	public String getTenkm() {
		return this.tenkm;
	}

	public void setTenkm(String tenkm) {
		this.tenkm = tenkm;
	}

	public List<Chitietkhuyenmai> getChitietkhuyenmais() {
		return this.chitietkhuyenmais;
	}

	public void setChitietkhuyenmais(List<Chitietkhuyenmai> chitietkhuyenmais) {
		this.chitietkhuyenmais = chitietkhuyenmais;
	}

	public Chitietkhuyenmai addChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().add(chitietkhuyenmai);
		chitietkhuyenmai.setKhuyenmai(this);

		return chitietkhuyenmai;
	}

	public Chitietkhuyenmai removeChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().remove(chitietkhuyenmai);
		chitietkhuyenmai.setKhuyenmai(null);

		return chitietkhuyenmai;
	}

}