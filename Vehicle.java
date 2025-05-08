interface Vehicle{

     void start();

     void stop();
}



class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println(" Bike is Starting.... ");
    }

    @Override
    public void stop() {
        System.out.println(" Bike is stopping... ");
    }
}



class Car implements Vehicle{

    @Override
    public void start(){
        System.out.println(" Car is starting... ");
    }

    @Override
    public void stop(){
        System.out.println(" Car is stopping.. ");
    }
}


class mainn{
    public static void main (String [] args ){
Bike myBike= new Bike();
        myBike.start();
        myBike.stop();

Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}