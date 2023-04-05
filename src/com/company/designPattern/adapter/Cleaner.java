package com.company.designPattern.adapter;

public class Cleaner implements Electronic220v{
    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}
