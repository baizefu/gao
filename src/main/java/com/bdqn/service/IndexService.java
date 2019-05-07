package com.bdqn.service;




import com.bdqn.entity.Book;
import com.bdqn.entity.User;

import java.util.List;

public interface IndexService {

    User selectByPrimaryKey(String name, String password);

    List<Book> allBooks();

    int addBooks(Book book);

    Book selectBooksById(int id);


}
