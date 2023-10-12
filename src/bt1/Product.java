package bt1;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable{
    private int id;
    private String name;
    private String brand;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String brand, double price, String description) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Product{" +
                "Mã =" + id +
                ", Tên='" + name + '\'' +
                ", Hãng='" + brand + '\'' +
                ", Giá=" + price +
                ", Mô tả ='" + description + '\'' +
                '}';
    }

    public void inputData(){
        System.out.println("Nhập Mã");
        id = new Scanner(System.in).nextInt();
        System.out.println("Nhập Tên");
        name = new Scanner(System.in).nextLine();
        System.out.println("Nhập Hãng");
        brand = new Scanner(System.in).nextLine();
        System.out.println("Nhập Giá");
        price = new Scanner(System.in).nextDouble();
        System.out.println("Nhập Mô tả");
        description = new Scanner(System.in).nextLine();
    }
}
