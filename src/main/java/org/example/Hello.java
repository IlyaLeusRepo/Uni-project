package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hello {

    public void sayHello(String name) {
        System.out.println("Привет " + name + ". Падаван выполнил домашнее задание.");
    }
}