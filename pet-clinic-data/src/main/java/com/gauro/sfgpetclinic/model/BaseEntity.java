package com.gauro.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Chandra
 */
public class BaseEntity  implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
