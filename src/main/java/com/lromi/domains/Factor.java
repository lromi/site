package com.lromi.domains;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by lromi on 24.11.2016.
 */
@Entity
@Table(name = "factor")
public class Factor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotNull
    String name;

    @NotNull
    int mark;

    public Factor() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
