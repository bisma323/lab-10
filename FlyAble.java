interface FlyAble {

    void fly();

}


interface SwimAble{

    void swim();

}

class Duck implements FlyAble, SwimAble{

    @Override
    public void fly() {
        System.out.println(" Duck can Fly ");
    }

    @Override
    public void swim() {
        System.out.println(" Duck can Swim");
    }

}

class mainnnnn{
    public static void main (String [] args){
        Duck obj = new Duck();

        obj.fly();
        obj.swim();

    }
}