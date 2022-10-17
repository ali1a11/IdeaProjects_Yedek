package com.example.mooc13;

import javafx.application.Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter title: ");
        String title = input.nextLine();


        Application.launch(UserTitle.class,
                "--title=" + title);

    }
}
