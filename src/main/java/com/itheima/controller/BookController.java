package com.itheima.controller;

import com.itheima.controller.utils.R;
import com.itheima.serivice.impl.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;


    @GetMapping
    public R getAll(){

        return new R(true,iBookService.list());
    }


}
