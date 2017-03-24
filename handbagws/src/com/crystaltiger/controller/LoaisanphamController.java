package com.crystaltiger.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crystaltiger.model.Loaisanpham;
import com.crystaltiger.service.LoaisanphamService;

@RestController
@RequestMapping("/loaisanpham")
public class LoaisanphamController {

	private final Logger LOG = LoggerFactory.getLogger(LoaisanphamController.class);

	@Autowired
	private LoaisanphamService loaisanphamService;
	
	// =========================================== Get User By ID
	// =========================================

	@RequestMapping(value = "{MALOAI_CHA}", method = RequestMethod.GET)
	public ResponseEntity<Loaisanpham> get(@PathVariable("MALOAI_CHA") int maloaicha) {
		LOG.info("getting loaisanpham with maloaicha: {}", maloaicha);
		Loaisanpham loaisanpham = loaisanphamService.findById(maloaicha);

		if (loaisanpham == null) {
			LOG.info("loaisanpham with maloaicha  {} not found", maloaicha);
			return new ResponseEntity<Loaisanpham>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Loaisanpham>(loaisanpham, HttpStatus.OK);
	}
	
	
}
