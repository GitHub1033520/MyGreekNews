package com.example.dell.mygreeknews.plant;

public class ShapeFactory {
    public shape getshape(String shapeType){
        if (shapeType ==null){

            return  null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return  new Rectangle();

        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }



            return  null;

    }

}
