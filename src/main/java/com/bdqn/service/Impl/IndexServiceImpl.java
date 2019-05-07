package com.bdqn.service.Impl;


import com.bdqn.dao.BookMapper;
import com.bdqn.dao.UserMapper;
import com.bdqn.entity.Book;
import com.bdqn.entity.User;
import com.bdqn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public User selectByPrimaryKey(String name, String password) {
        List<User> users = userMapper.selectByName(name);
        if (users != null) {
            if (users.get(0).getPassword().equals(password)) {
                return users.get(0);
            }

        }
        return null;
    }

    @Override
    public List<Book> allBooks() {
        return bookMapper.findAll();
    }



    @Override
    public int addBooks(Book book) {
        int row = bookMapper.insert(book);
        return row;
    }

    @Override
    public Book selectBooksById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }


}
