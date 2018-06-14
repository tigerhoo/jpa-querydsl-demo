package com.damao.jpaquerydsldemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 仅仅用于演示
 * @author huyongxing
 * @email huyongxing@qihaiyun.com
 * @date 2018/6/14 11:34
 */
@Entity
@Table(name = "t_demo")
public class Demo {

    @Id
    private int id;

    private int count;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
