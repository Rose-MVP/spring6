package com.powernode.spring6.beans;

/**
 * 表示班级
 * @author 动力节点
 * @version 1.0
 * @className Clazz
 * @since 1.0
 **/
public class Clazz {
    // 班级名称
    private String classname;

    public String getClassname() {
        return classname;
    }

    public void setName(String classname) {

        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + classname + '\'' +
                '}';
    }
}
