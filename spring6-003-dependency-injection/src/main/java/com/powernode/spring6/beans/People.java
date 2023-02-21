package com.powernode.spring6.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }
    private Set<String> phones;

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }
    // 一个人有多个住址
    private Map<Integer, String> addrs;
    public void setAddrs(Map<Integer, String> addrs) {
        this.addrs = addrs;
    }

    //......

    @Override
    public String toString() {
        return "People{" +
                "addrs=" + addrs +
                ", phones=" + phones +
                ", names=" + names +
                '}';
    }

}
