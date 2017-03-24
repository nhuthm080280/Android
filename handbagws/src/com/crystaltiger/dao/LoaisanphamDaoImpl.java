package com.crystaltiger.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crystaltiger.model.Loaisanpham;
@Repository("loaisanphamDao")
public class LoaisanphamDaoImpl extends AbstractDao<Integer, Loaisanpham> implements LoaisanphamDao {
	 @Autowired
	 SessionFactory sessionFactory;
	@Override
	public Loaisanpham findById(int maloaicha) {
		// TODO Auto-generated method stub
		return getByKey(maloaicha);
	}
	
}
