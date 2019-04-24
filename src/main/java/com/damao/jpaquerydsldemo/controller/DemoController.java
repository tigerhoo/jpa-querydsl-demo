package com.damao.jpaquerydsldemo.controller;

import com.damao.jpaquerydsldemo.Entity.Demo;
import com.damao.jpaquerydsldemo.repository.DemoRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author huyongxing
 * @site www.skson.com
 * @date 2018/6/14 11:37
 */
@RestController
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping(value = "")
    public Object list(@QuerydslPredicate(root = Demo.class) Predicate predicate, Pageable pageable) {

        return demoRepository.findAll(predicate, pageable);
    }
}
