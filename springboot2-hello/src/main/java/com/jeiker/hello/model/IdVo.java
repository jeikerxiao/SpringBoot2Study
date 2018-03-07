package com.jeiker.hello.model;

import java.io.Serializable;

/**
 * @author : xiao
 * @date : 2018/3/7 下午1:49
 * @description :
 */
public class IdVo implements Serializable{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdVo{" +
                "id=" + id +
                '}';
    }
}
