package com.javapandeng.po;

import java.io.Serializable;

/**
 * @author hangzhi1063
 * @date 2020/11/3 14:42
 */
public class ItemCategory implements Serializable {
    private Integer id;
    private String name;
    private Integer pid;
    private Integer isDelete;

    @Override
    public String toString() {
        return "ItemCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public ItemCategory() {
    }

    public ItemCategory(Integer id, String name, Integer pid, Integer isDelete) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.isDelete = isDelete;
    }
}
