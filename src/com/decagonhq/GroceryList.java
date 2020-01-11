package com.decagonhq;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItems(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }

    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");

    }

    public void removeGroceryItem(String Item){
        int position = findItems(Item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){

        groceryList.remove(position);

    }

    private int findItems(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItems(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }

}
