package com.my.test.LinkOracle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class testService {
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 
	    public List getList(){
	    	
	        String sql = "select * from table0";
	        return (List) jdbcTemplate.query(sql, new RowMapper(){
	 
	            public Table0 mapRow(ResultSet rs, int rowNum) throws SQLException {
	            	Table0 bnUser = new Table0();
	                bnUser.setHaoma(rs.getString("haoma"));	  
	                bnUser.setName(rs.getString("name"));	  
	                return bnUser;
	            }
	        });
	    }
  public List getCount(){
	    	
	        String sql = "select count(*) shu from table0";
	        return (List) jdbcTemplate.query(sql, new RowMapper(){
	 
	            public Table0 mapRow(ResultSet rs, int rowNum) throws SQLException {
	            	Table0 bnUser = new Table0();
	                bnUser.setCount(rs.getInt("shu"));	     //  将结果中的XX列写入到  实体类的  某个变量。    
	                return bnUser;
	            }
	        });
	    }
}
