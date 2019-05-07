package com.bdqn.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.bdqn.entity.Book;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> findAll();


}