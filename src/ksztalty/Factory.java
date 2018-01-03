package ksztalty;

public class Factory {
        //use getShape method to get object of type shape
        public Shape getShape (String shapeType){
            if(shapeType == null){
                return null;
            }
            if(shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();

            } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
                return new Triangle();

            } else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }

            return null;
        }
    }

