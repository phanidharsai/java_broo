package com.phanidharsai.solidprinciples.openandclosed.invalid;

// Incorrect approach
class Shape {
    private
    String type;

    public void calculateArea() {
        if (type.equals("circle")) {
            // Circle area calculation
        } else if (type.equals("rectangle")) {
            // Rectangle area calculation
        }
        // Adding a triangle requires modifying this method
    }
}