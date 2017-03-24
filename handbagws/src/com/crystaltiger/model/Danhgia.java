package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the danhgia database table.
 * 
 */
@Entity
@NamedQuery(name="Danhgia.findAll", query="SELECT d FROM Danhgia d")
public class Danhgia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int madg;

	@Lob
	private String noidung;

	private int sosao;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANV")
	private Nhanvien nhanvien;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MASP")
	private Sanpham sanpham;

	public Danhgia() {
	}

	public int getMadg() {
		return this.madg;
	}

	public void setMadg(int madg) {
		this.madg = madg;
	}

	public String getNoidung() {
		return this.noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public int getSosao() {
		return this.sosao;
	}

	public void setSosao(int sosao) {
		this.sosao = sosao;
	}

	public Nhanvien getNhanvien() {
		return this.nhanvien;
	}

	public void setNhanvien(Nhanvien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

}