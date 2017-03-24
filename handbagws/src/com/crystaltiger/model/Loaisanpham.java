package com.crystaltiger.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaisanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Loaisanpham.findAll", query="SELECT l FROM Loaisanpham l")
public class Loaisanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int maloaisp;

	@Column(name="MALOAI_CHA")
	private int maloaiCha;

	private String tenloaisp;

	//bi-directional many-to-one association to Sanpham
	@OneToMany(mappedBy="loaisanpham" , fetch=FetchType.EAGER)
	private List<Sanpham> sanphams;

	public Loaisanpham() {
	}

	public int getMaloaisp() {
		return this.maloaisp;
	}

	public void setMaloaisp(int maloaisp) {
		this.maloaisp = maloaisp;
	}

	public int getMaloaiCha() {
		return this.maloaiCha;
	}

	public void setMaloaiCha(int maloaiCha) {
		this.maloaiCha = maloaiCha;
	}

	public String getTenloaisp() {
		return this.tenloaisp;
	}

	public void setTenloaisp(String tenloaisp) {
		this.tenloaisp = tenloaisp;
	}

	public List<Sanpham> getSanphams() {
		return this.sanphams;
	}

	public void setSanphams(List<Sanpham> sanphams) {
		this.sanphams = sanphams;
	}

	public Sanpham addSanpham(Sanpham sanpham) {
		getSanphams().add(sanpham);
		sanpham.setLoaisanpham(this);

		return sanpham;
	}

	public Sanpham removeSanpham(Sanpham sanpham) {
		getSanphams().remove(sanpham);
		sanpham.setLoaisanpham(null);

		return sanpham;
	}

}