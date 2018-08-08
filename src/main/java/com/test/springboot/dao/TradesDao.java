package com.test.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.springboot.beans.Trades;

@Repository
public class TradesDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Trades> findAll(){
		return jdbcTemplate.query("select * from trade", new BeanPropertyRowMapper(Trades.class));
		
	}
}
