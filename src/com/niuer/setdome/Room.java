package com.niuer.setdome;
//5、设计一个类存储客房预订系统的客房信息（Room）,由于客房都具有唯一性，那么使用HashSet存储所有的客房信息，
// 并输出所有的客房信息.(注：客房信息包括客房编号，客房类型，客房价格等)
public class Room {
    private int rid;
    private String rtype;
    private double price;

    public Room() {
    }

    public Room(int rid, String rtype, double price) {
        this.rid = rid;
        this.rtype = rtype;
        this.price = price;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rid=" + rid +
                ", rtype='" + rtype + '\'' +
                ", price=" + price +
                '}';
    }
}
