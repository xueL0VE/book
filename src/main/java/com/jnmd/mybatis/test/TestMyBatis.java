package com.jnmd.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jnmd.mybatis.domain.Book;
import com.jnmd.mybatis.util.MyBatisUtil;


public class TestMyBatis {
	public static void main(String[] args) {
		String resource = "Mybatis.cfg.xml";
		try {
			InputStream is = 
					Resources.getResourceAsStream(resource);
			SqlSessionFactory  factory =
					new SqlSessionFactoryBuilder().build(is);
			SqlSession session = 
					MyBatisUtil.getSession();
			
			//List<Book> book = session.selectOne("getBook");
			
			//Book book = session.selectOne("getBookId",7);
			
			//Book book = new Book();
			//book.setId(9);
			//book.setYear(2017);
			//book = session.selectOne("getBooks",book);
			
			//Map<String, Object> map = new HashMap<String,Object>();
			//map.put("id", 4);
			//map.put("year", 2009);
			//Book book = session.selectOne("leagueMap", map);
			
			//String params = "book";
			//int id = session.selectOne("getById", 11);
			//System.out.println(id);
			//session.close();
			//MyBatisUtil.closeSession(session);
			
			//<insert>标签
			/*Book book = new Book();
			book.setYear(2019);
			book.setSeason("summer");
			book.setTitle("sssss");
			int count = session.insert("insertUser", book);
			session.commit();
			System.out.println(count);
			System.out.println(book);
			MyBatisUtil.closeSession(session);*/
			
			//<selectKey>标签:返回主键值
			/*Book book = new Book();
			book.setYear(2019);
			book.setSeason("summer");
			book.setTitle("sssss");
			int count = session.insert("insertBook", book);
			session.commit();
			System.out.println(count);
			System.out.println(book);
			MyBatisUtil.closeSession(session);*/
			
			
			//<update>标签
			/*Book book = new Book();
			book.setId(7);
			book.setYear(2019);
			book.setSeason("summer");
			book.setTitle("sssss");
			int count = session.insert("updatebook", book);
			session.commit();
			System.out.println(count);
			System.out.println(book);
			MyBatisUtil.closeSession(session);*/
			
			//<delete>标签
			/*int count = session.delete("deletebook",23);
			session.commit();
			System.out.println(count);
			MyBatisUtil.closeSession(session);*/
		} catch (IOException e) {
			e.printStackTrace();
		
		}finally{
		}
	}
}
