/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mycompany.puntodeventa.Classes.Product;
import com.mycompany.puntodeventa.Classes.User;
import java.util.ArrayList;

/**
 *
 * @author aldri
 */
public class Controller {

    private ArrayList<Product> inventory = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public Controller() {
        this.inventory = new ArrayList<>();
        this.users = new ArrayList<>();
        Product n = new Product("name", 12, 12.58);
        this.inventory.add(n);

    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public Product searchProductByName() {
        return new Product("", 0, 0);
    }

    public void addNewProduct(String name, int quantity, double price) {
        Product n = new Product(name, quantity, price);
        this.inventory.add(n);
    }

}
