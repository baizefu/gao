package com.bdqn.controller;

import com.bdqn.common.utils.JsonUtil;

import com.bdqn.entity.User;
import com.bdqn.entity.Book;
import com.bdqn.service.IndexService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;

    @PostMapping("login")
    public String login(String name,String password) {
        User user = indexService.selectByPrimaryKey(name,password);
        if (user != null) {
            return JsonUtil.getResponseJson(0,"成功",user);
        }
        return JsonUtil.getResponseJson(1,"用户名或密码错误！",null);
    }

    @PostMapping("allBooks")
    public String allBooks(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Book> books = indexService.allBooks();
        PageInfo<Book> bookPageInfo = new PageInfo<>(books);
        return JsonUtil.getResponseJson(0,"ok",bookPageInfo);
    }

    @PostMapping("addBooks")
    public String addBooks(Book book) {
        int books = indexService.addBooks(book);
        if (books != 0) {
            return JsonUtil.getResponseJson(0,"成功",books);
        }
        return JsonUtil.getResponseJson(1,"失败",null);
    }


    @PostMapping("selectBooksById")
    public String selectBooksById(int id) {
        Book book = indexService.selectBooksById(id);
        if (book != null) {
            return JsonUtil.getResponseJson(0,"成功",book);
        }
        return JsonUtil.getResponseJson(1,"失败",null);
    }







}


