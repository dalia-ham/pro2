package com.example.pro2;

import java.util.ArrayList;
import java.util.List;

public class  DatabaseItemes {
    private List<MenuItem> items=new ArrayList<MenuItem>();
    public DatabaseItemes(){
        items.add(new MenuItem("Coffe",10,"Hot Drinks"));
        items.add(new MenuItem("Tea",8,"Hot Drinks"));
        items.add(new MenuItem("Ice Coffe",15,"Cold Drinks"));
        items.add(new MenuItem("Ice Cream",18,"Cold Drinks"));
        items.add(new MenuItem("Chicken Sandwiches",27,"Sandwiches"));
        items.add(new MenuItem("Ice tea",13,"Hot Drinks"));
        items.add(new MenuItem("capatioeno",17,"Hot Drinks"));
        items.add(new MenuItem("Ice Coffe",15,"Cold Drinks"));
        items.add(new MenuItem("Ice Cream",18,"Cold Drinks"));
        items.add(new MenuItem("Shawrma ",25,"Sandwiches"));
        items.add(new MenuItem("Chese",14,"Sandwiches"));
        items.add(new MenuItem("kafta ",35,"Sandwiches"));
        items.add(new MenuItem("msahab cheken",34,"Sandwiches"));
        items.add(new MenuItem("nescafe",18,"Hot Drinks"));
        items.add(new MenuItem("Milk",8,"Hot Drinks"));
        items.add(new MenuItem("baloza",15,"Cold Drinks"));
        items.add(new MenuItem("Ice Cream vanila & choclate",18,"Cold Drinks"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("Labana sandwiches ",27,"Sandwiches"));
        items.add(new MenuItem("kafta ",35,"Sandwiches"));
        items.add(new MenuItem("kafta ",35,"Sandwiches"));
        items.add(new MenuItem("kafta ",35,"Sandwiches"));

    }
    public String[] getCategories(){
        //assume we are reading data from database
    String[] categories={"Hot Drinks","Cold Drinks", "Sandwiches"};
    return categories;
  }
  public List <MenuItem>getMenuItems(String catogery){
        List<MenuItem>result =new ArrayList<>();
        for(MenuItem m:items){
            if(m.getCategory().equals(catogery)){
                result.add(m);
            }
        }
        return result;
  }
}

