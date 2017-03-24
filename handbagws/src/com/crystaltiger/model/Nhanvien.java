package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the nhanvien database table.
 * 
 */
@Entity
@NamedQuery(name="Nhanvien.findAll", query="SELECT n FROM Nhanvien n")
public class Nhanvien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int manv;

	private String diachi;

	private byte gioitinh;

	private String matkhau;

	private String ngaysinh;

	private String sodt;

	private String tendangnhap;

	private String tennv;

	//bi-directional many-to-one association to Chitietbinhluan
	@OneToMany(mappedBy="nhanvien")
	private List<Chitietbinhluan> chitietbinhluans;

	//bi-directional many-to-one association to Danhgia
	@OneToMany(mappedBy="nhanvien")
	private List<Danhgia> danhgias;

	//bi-directional many-to-one association to Loainhanvien
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MALOAINV")
	private Loainhanvien loainhanvien;

	public Nhanvien() {
	}

	public int getManv() {
		return this.manv;
	}

	public void setManv(int manv) {
		this.manv = manv;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public byte getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(byte gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getMatkhau() {
		return this.matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getSodt() {
		return this.sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public String getTendangnhap() {
		return this.tendangnhap;
	}

	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}

	public String getTennv() {
		return this.tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public List<Chitietbinhluan> getChitietbinhluans() {
		return this.chitietbinhluans;
	}

	public void setChitietbinhluans(List<Chitietbinhluan> chitietbinhluans) {
		this.chitietbinhluans = chitietbinhluans;
	}

	public Chitietbinhluan addChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().add(chitietbinhluan);
		chitietbinhluan.setNhanvien(this);

		return chitietbinhluan;
	}

	public Chitietbinhluan removeChitietbinhluan(Chitietbinhluan chitietbinhluan) {
		getChitietbinhluans().remove(chitietbinhluan);
		chitietbinhluan.setNhanvien(null);

		return chitietbinhluan;
	}

	public List<Danhgia> getDanhgias() {
		return this.danhgias;
	}

	public void setDanhgias(List<Danhgia> danhgias) {
		this.danhgias = danhgias;
	}

	public Danhgia addDanhgia(Danhgia danhgia) {
		getDanhgias().add(danhgia);
		danhgia.setNhanvien(this);

		return danhgia;
	}

	public Danhgia removeDanhgia(Danhgia danhgia) {
		getDanhgias().remove(danhgia);
		danhgia.setNhanvien(null);

		return danhgia;
	}

	public Loainhanvien getLoainhanvien() {
		return this.loainhanvien;
	}

	public void setLoainhanvien(Loainhanvien loainhanvien) {
		this.loainhanvien = loainhanvien;
	}

}