/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Dallas
 */

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
      // Create a Scanner object
      Scanner input = new Scanner(System.in);
      try {
        // Prompt User Input
      System.out.print("Enter a number for Radius");
      double radius = input.nextDouble();

      // Compute Area
      double area = radius * radius * Math.PI;

      // Display Output
      System.out.println("The area for the circle of radius " + radius + " is " + area);
      } finally {
        input.close();
      }
      
    }
  }
