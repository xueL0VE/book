package com.jnmd.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jnmd.mybatis.domain.Book;
import com.jnmd.mybatis.mapper.Books;
import com.jnmd.mybatis.util.MyBatisUtil;

public class Test001 {

	public static void main(String[] args) {
		SqlSession session = MyBatisUtil.getSession();
		Books books = session.getMapper(Books.class);
		List<Book> book = books.getBook();
		System.out.println (book);
		MyBatisUtil.closeSession(session);
	}

}
