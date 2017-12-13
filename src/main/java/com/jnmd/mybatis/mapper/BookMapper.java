package com.jnmd.mybatis.mapper;

import java.util.List;

import com.jnmd.mybatis.domain.Book;

public interface BookMapper {
	public List<Book> getBook();
	public Book getBook(int lid);
	public Book getBook(String season,String title);
	
}
