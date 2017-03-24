package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the thuonghieu database table.
 * 
 */
@Entity
@NamedQuery(name="Thuonghieu.findAll", query="SELECT t FROM Thuonghieu t")
public class Thuonghieu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int mathuonghieu;

	@Lob
	private String hinhthuonghieu;

	private String tenthuonghieu;

	//bi-directional many-to-one association to Sanpham
	@OneToMany(mappedBy="thuonghieu")
	private List<Sanpham> sanphams;

	public Thuonghieu() {
	}

	public int getMathuonghieu() {
		return this.mathuonghieu;
	}

	public void setMathuonghieu(int mathuonghieu) {
		this.mathuonghieu = mathuonghieu;
	}

	public String getHinhthuonghieu() {
		return this.hinhthuonghieu;
	}

	public void setHinhthuonghieu(String hinhthuonghieu) {
		this.hinhthuonghieu = hinhthuonghieu;
	}

	public String getTenthuonghieu() {
		return this.tenthuonghieu;
	}

	public void setTenthuonghieu(String tenthuonghieu) {
		this.tenthuonghieu = tenthuonghieu;
	}

	public List<Sanpham> getSanphams() {
		return this.sanphams;
	}

	public void setSanphams(List<Sanpham> sanphams) {
		this.sanphams = sanphams;
	}

	public Sanpham addSanpham(Sanpham sanpham) {
		getSanphams().add(sanpham);
		sanpham.setThuonghieu(this);

		return sanpham;
	}

	public Sanpham removeSanpham(Sanpham sanpham) {
		getSanphams().remove(sanpham);
		sanpham.setThuonghieu(null);

		return sanpham;
	}

}