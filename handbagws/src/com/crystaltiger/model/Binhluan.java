package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the binhluan database table.
 * 
 */
@Entity
@NamedQuery(name="Binhluan.findAll", query="SELECT b FROM Binhluan b")
public class Binhluan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int mabl;

	private String tieude;

	//bi-directional many-to-one association to Chitietbinhluan
	@OneToMany(mappedBy="binhluan")
	private List<Chitietbinhluan> chitietbinhluans;

	public Binhluan() {
	}

	public int getMabl() {
		return this.mabl;
	}

	public void setMabl(int mabl) {
		this.mabl = mabl;
	}

	public String getTieude() {
		return this.tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public List<Chitietbinhluan> getChitietbinhluans() {
		return this.chitietbinhluans;
	}

	public void setChitietbinhluans(List<Chitietbinhluan> chitietbinhluans) {
		this.chitietbinhluans = chitietbinhluans;
	}

	public Chitietbinhluan addChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().add(chitietbinhluan);
		chitietbinhluan.setBinhluan(this);

		return chitietbinhluan;
	}

	public Chitietbinhluan removeChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().remove(chitietbinhluan);
		chitietbinhluan.setBinhluan(null);

		return chitietbinhluan;
	}

}