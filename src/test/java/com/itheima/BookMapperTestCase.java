package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.mapper.BookMapper;
import com.itheima.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookMapperTestCase {
   @Autowired
   private BookMapper bookMapper;

    @Test
    void testGetById(){
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,5);
        bookMapper.selectPage(page,null);

        page.getRecords();
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","spring");
        bookMapper.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();

        lqw.like(name != null,Book::getName,name);
        bookMapper.selectList(lqw);
    }

}
