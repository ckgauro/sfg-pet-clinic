package com.gauro.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Chandra
 */
public class BaseEntity  implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
