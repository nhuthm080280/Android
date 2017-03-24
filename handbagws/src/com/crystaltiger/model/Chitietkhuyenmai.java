package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietkhuyenmai database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietkhuyenmai.findAll", query="SELECT c FROM Chitietkhuyenmai c")
public class Chitietkhuyenmai implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChitietkhuyenmaiPK id;

	private String ngaybatdau;

	private String ngayketthuc;

	private int phantramkm;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MASP")
	private Sanpham sanpham;

	//bi-directional many-to-one association to Khuyenmai
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MAKM")
	private Khuyenmai khuyenmai;

	public Chitietkhuyenmai() {
	}

	public ChitietkhuyenmaiPK getId() {
		return this.id;
	}

	public void setId(ChitietkhuyenmaiPK id) {
		this.id = id;
	}

	public String getNgaybatdau() {
		return this.ngaybatdau;
	}

	public void setNgaybatdau(String ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	public String getNgayketthuc() {
		return this.ngayketthuc;
	}

	public void setNgayketthuc(String ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}

	public int getPhantramkm() {
		return this.phantramkm;
	}

	public void setPhantramkm(int phantramkm) {
		this.phantramkm = phantramkm;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public Khuyenmai getKhuyenmai() {
		return this.khuyenmai;
	}

	public void setKhuyenmai(Khuyenmai khuyenmai) {
		this.khuyenmai = khuyenmai;
	}

}