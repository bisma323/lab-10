abstract class Shape {

    abstract double area();

}



interface Printable{

    void print();

}




class Rectangular extends Shape implements Printable{

    double height;
    double width;

    Rectangular(double height, double width){
        this.height=height;
        this.width= width;

    }

    @Override
    double area() {
        return height* width;
    }

    @Override
    public void print() {
        System.out.println(" This shape is rectangular ");
        System.out.println(" The AREA of the rectangular is " + area());
    }


}

class mainnn{
    public static void main (String [] args){

        Rectangular object = new Rectangular(15, 23);
        object.area();
        object.print();

    }

}