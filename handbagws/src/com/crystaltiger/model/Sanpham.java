package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the sanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Sanpham.findAll", query="SELECT s FROM Sanpham s")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int masp;

	@Lob
	private String anhlon;

	@Lob
	private String anhnho;

	private BigDecimal gia;

	private int soluong;

	private String tensp;

	@Lob
	private String thongtin;

	//bi-directional many-to-one association to Chitietbinhluan
	@OneToMany(mappedBy="sanpham")
	private List<Chitietbinhluan> chitietbinhluans;

	//bi-directional many-to-one association to Chitietkhuyenmai
	@OneToMany(mappedBy="sanpham")
	private List<Chitietkhuyenmai> chitietkhuyenmais;

	//bi-directional many-to-one association to Danhgia
	@OneToMany(mappedBy="sanpham")
	private List<Danhgia> danhgias;

	//bi-directional many-to-one association to Loaisanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MALOAISP")
	private Loaisanpham loaisanpham;

	//bi-directional many-to-one association to Thuonghieu
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MATHUONGHIEU")
	private Thuonghieu thuonghieu;

	public Sanpham() {
	}

	public int getMasp() {
		return this.masp;
	}

	public void setMasp(int masp) {
		this.masp = masp;
	}

	public String getAnhlon() {
		return this.anhlon;
	}

	public void setAnhlon(String anhlon) {
		this.anhlon = anhlon;
	}

	public String getAnhnho() {
		return this.anhnho;
	}

	public void setAnhnho(String anhnho) {
		this.anhnho = anhnho;
	}

	public BigDecimal getGia() {
		return this.gia;
	}

	public void setGia(BigDecimal gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getTensp() {
		return this.tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public String getThongtin() {
		return this.thongtin;
	}

	public void setThongtin(String thongtin) {
		this.thongtin = thongtin;
	}

	public List<Chitietbinhluan> getChitietbinhluans() {
		return this.chitietbinhluans;
	}

	public void setChitietbinhluans(List<Chitietbinhluan> chitietbinhluans) {
		this.chitietbinhluans = chitietbinhluans;
	}

	public Chitietbinhluan addChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().add(chitietbinhluan);
		chitietbinhluan.setSanpham(this);

		return chitietbinhluan;
	}

	public Chitietbinhluan removeChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().remove(chitietbinhluan);
		chitietbinhluan.setSanpham(null);

		return chitietbinhluan;
	}

	public List<Chitietkhuyenmai> getChitietkhuyenmais() {
		return this.chitietkhuyenmais;
	}

	public void setChitietkhuyenmais(List<Chitietkhuyenmai> chitietkhuyenmais) {
		this.chitietkhuyenmais = chitietkhuyenmais;
	}

	public Chitietkhuyenmai addChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().add(chitietkhuyenmai);
		chitietkhuyenmai.setSanpham(this);

		return chitietkhuyenmai;
	}

	public Chitietkhuyenmai removeChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().remove(chitietkhuyenmai);
		chitietkhuyenmai.setSanpham(null);

		return chitietkhuyenmai;
	}

	public List<Danhgia> getDanhgias() {
		return this.danhgias;
	}

	public void setDanhgias(List<Danhgia> danhgias) {
		this.danhgias = danhgias;
	}

	public Danhgia addDanhgia(Danhgia danhgia) {
		getDanhgias().add(danhgia);
		danhgia.setSanpham(this);

		return danhgia;
	}

	public Danhgia removeDanhgia(Danhgia danhgia) {
		getDanhgias().remove(danhgia);
		danhgia.setSanpham(null);

		return danhgia;
	}

	public Loaisanpham getLoaisanpham() {
		return this.loaisanpham;
	}

	public void setLoaisanpham(Loaisanpham loaisanpham) {
		this.loaisanpham = loaisanpham;
	}

	public Thuonghieu getThuonghieu() {
		return this.thuonghieu;
	}

	public void setThuonghieu(Thuonghieu thuonghieu) {
		this.thuonghieu = thuonghieu;
	}

}