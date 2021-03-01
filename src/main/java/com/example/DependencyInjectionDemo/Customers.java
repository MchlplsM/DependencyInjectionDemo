package com.example.DependencyInjectionDemo;

import org.springframework.stereotype.Component;

@Component //The compiler will check if there is an available customer in the container
public class Customers {

    private int custId;
    private String custName;
    private String courseName;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void display(){
        System.out.println("Customers - Object Returned Successfully");
    }
}
