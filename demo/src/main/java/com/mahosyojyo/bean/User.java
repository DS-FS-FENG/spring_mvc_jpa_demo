package com.mahosyojyo.bean;

import javax.persistence.*;

/**
 * Created by FredFung on 2014/6/2.
 * JPA Demo
 */

/* TODO define Entity */

@Entity
@Table(name = "tb_user", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

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
        this.name = name;
    }
}
