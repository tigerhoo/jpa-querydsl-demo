package com.damao.jpaquerydsldemo.repository;

import com.damao.jpaquerydsldemo.Entity.Demo;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * @author huyongxing
 * @site www.skson.com
 * @date 2018/6/14 11:27
 */
public interface DemoRepository extends CrudRepository<Demo, Integer>, QuerydslPredicateExecutor<Demo> {
}
