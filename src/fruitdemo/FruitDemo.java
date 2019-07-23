/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitdemo;

interface Fruit {
    //interface
    public void changeName(String newName);        
    
    public void changeColor(String newColor);
    
    public void changeTaste(String newTaste);
    
}

class DoleFruit implements Fruit {
    
    String name = "name";
    String color = "color";
    String taste = "taste";

    DoleFruit() {
        name = "Fruit";
        color = "red";
        taste = "sweet";
    }
    
    @Override
    public void changeName(String newName) {
        this.name = newName;        
    }
    
    @Override
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    
    @Override
    public void changeTaste(String newTaste) {
        this.taste = newTaste;
    }
    
    void printStates() {
        System.out.println("name: " + this.name +
                " color: " + this.color 
                + " taste: " + this.taste);
    }
    
}

/**
 *
 * @author Nabeel
 */
public class FruitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Create two different
        //Fruit objects
        DoleFruit fruit1 = new DoleFruit();
        DoleFruit fruit2 = new DoleFruit();
        
        //Invoke methods on
        //those objects
        fruit1.changeName("Apple");
        fruit1.changeColor("Red");
        fruit1.changeTaste("Sweet");
        fruit1.printStates();
        
        fruit2.changeName("Mango");
        fruit2.changeColor("Yellow");
        fruit2.changeTaste("Tangy");
        fruit2.printStates();
    }
    
}
