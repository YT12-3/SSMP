package com.itheima.serivice.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mapper.BookMapper;
import com.itheima.pojo.Book;
import org.springframework.stereotype.Service;

@Service
public class BookSeriviceImpl extends ServiceImpl<BookMapper, Book> implements IBookService{

}
