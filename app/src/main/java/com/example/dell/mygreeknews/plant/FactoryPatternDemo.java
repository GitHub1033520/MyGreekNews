package com.example.dell.mygreeknews.plant;

public class FactoryPatternDemo {
    public static  void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        shape ss = shapeFactory.getshape("CIRCLE");
        ss.draw();

        shape sss = shapeFactory.getshape("RECTANGLE");
        sss.draw();

        shape ssss = shapeFactory.getshape("SQUARE");
        ssss.draw();
    }
}
