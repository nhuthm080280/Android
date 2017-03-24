package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietbinhluan database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietbinhluan.findAll", query="SELECT c FROM Chitietbinhluan c")
public class Chitietbinhluan implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChitietbinhluanPK id;

	private String ngaybl;

	@Lob
	private String noidung;

	//bi-directional many-to-one association to Binhluan
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MABL")
	private Binhluan binhluan;

	//bi-directional many-to-one association to Nhanvien
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANV")
	private Nhanvien nhanvien;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MASP")
	private Sanpham sanpham;

	public Chitietbinhluan() {
	}

	public ChitietbinhluanPK getId() {
		return this.id;
	}

	public void setId(ChitietbinhluanPK id) {
		this.id = id;
	}

	public String getNgaybl() {
		return this.ngaybl;
	}

	public void setNgaybl(String ngaybl) {
		this.ngaybl = ngaybl;
	}

	public String getNoidung() {
		return this.noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public Binhluan getBinhluan() {
		return this.binhluan;
	}

	public void setBinhluan(Binhluan binhluan) {
		this.binhluan = binhluan;
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