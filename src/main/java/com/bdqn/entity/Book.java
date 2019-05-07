package com.bdqn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    /**
    * 
    */
    private Integer id;

    /**
    * 
    */
    private String name;

    /**
    * 
    */
    private String author;

    /**
    * 
    */
    private String publish;

    /**
    * 
    */
    private Date pulishdate;

    /**
    * 
    */
    private Integer page;

    /**
    * 
    */
    private BigDecimal price;

    /**
    * 
    */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public Date getPulishdate() {
        return pulishdate;
    }

    public void setPulishdate(Date pulishdate) {
        this.pulishdate = pulishdate;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}