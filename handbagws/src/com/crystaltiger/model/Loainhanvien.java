package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loainhanvien database table.
 * 
 */
@Entity
@NamedQuery(name="Loainhanvien.findAll", query="SELECT l FROM Loainhanvien l")
public class Loainhanvien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int maloainv;

	private String tenloainv;

	//bi-directional many-to-one association to Nhanvien
	@OneToMany(mappedBy="loainhanvien")
	private List<Nhanvien> nhanviens;

	public Loainhanvien() {
	}

	public int getMaloainv() {
		return this.maloainv;
	}

	public void setMaloainv(int maloainv) {
		this.maloainv = maloainv;
	}

	public String getTenloainv() {
		return this.tenloainv;
	}

	public void setTenloainv(String tenloainv) {
		this.tenloainv = tenloainv;
	}

	public List<Nhanvien> getNhanviens() {
		return this.nhanviens;
	}

	public void setNhanviens(List<Nhanvien> nhanviens) {
		this.nhanviens = nhanviens;
	}

	public Nhanvien addNhanvien(Nhanvien nhanvien) {
		getNhanviens().add(nhanvien);
		nhanvien.setLoainhanvien(this);

		return nhanvien;
	}

	public Nhanvien removeNhanvien(Nhanvien nhanvien) {
		getNhanviens().remove(nhanvien);
		nhanvien.setLoainhanvien(null);

		return nhanvien;
	}

}