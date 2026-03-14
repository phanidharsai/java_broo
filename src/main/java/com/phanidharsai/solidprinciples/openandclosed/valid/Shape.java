package com.phanidharsai.solidprinciples.openandclosed.valid;

// Better approach following Open/Closed Principle
abstract class Shape {
  abstract double calculateArea();
  // We can also use an interface instead of an abstract class
}

class Circle extends Shape {
 private
  double radius;
  @Override 
public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
 private
  double width;
 private
  double height;
  @Override 
public double calculateArea() {
    return width * height;
  }
}

// Adding a new shape without modifying existing code
class Triangle extends Shape {
 private
  double base;
 private
  double height;
  @Override 
public double calculateArea() {
    return 0.5 * base * height;
  }
}