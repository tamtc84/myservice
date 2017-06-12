package org.example.model;

public class Device {
    private int id;
    private String name;
    private String status;
    private String type;  
    private String description;
    public Device(){
    }
    
    public int getId(){
        return id;
    }
    public void setId(int _id){
        this.id = _id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name = _name;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String _status){
        this.status = _status;
    }
    
    public String getType() {      
        return type;    
    }
    public void setType(String type) {  
        this.type = type; 
    }
    
    public String getDescription() { 
        return description;    
    }
    public void setDescription(String description) {   
        this.description = description;    
    }
}