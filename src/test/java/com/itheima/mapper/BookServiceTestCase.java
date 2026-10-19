package com.itheima.mapper;

import com.itheima.serivice.impl.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService iBookServicebookService;

    @Test
    void testGetById(){
        iBookServicebookService.getById(4);
    }
}
