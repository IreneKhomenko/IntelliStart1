package edu.intellistart;

public class Product {

    private final int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name=name;
        this.price=price;
    }
    public String toString(){
       String result="Id:"+id+" Name:"+name+" Price:"+price;
       return result;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
