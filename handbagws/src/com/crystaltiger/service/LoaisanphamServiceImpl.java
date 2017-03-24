package com.crystaltiger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crystaltiger.dao.LoaisanphamDao;
import com.crystaltiger.model.Loaisanpham;


@Service("loaisanphamService")
@Transactional
public class LoaisanphamServiceImpl implements LoaisanphamService {

	@Autowired
	private LoaisanphamDao loaisanphamDao;

	@Override
	public Loaisanpham findById(int maloaicha) {
		// TODO Auto-generated method stub
		return loaisanphamDao.findById(maloaicha);
	} 
	
	   
}
