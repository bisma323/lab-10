
abstract class Employee {
    String name;
    String id;

    abstract double calculateSalary();
}


interface taxPayer{

    void payTax();

}

class fulltimeEmployee extends Employee implements taxPayer{
    @Override
    double calculateSalary() {
        return 90000;
    }

    @Override
    public void payTax() {
        System.out.println(" Tax is payed ");
    }
}


class parttimeEmployee extends Employee implements taxPayer{
    int hourWage;
    int hourWork;

    parttimeEmployee(int hourWage, int hourWork){
        this.hourWork=hourWork;
        this.hourWage=hourWage;
    }


    @Override
    double calculateSalary() {
        return hourWage * hourWork;
    }

    @Override
    public void payTax() {
        System.out.println(" Tax is payed ");
    }

}



class mainnnnnn{
    public static void main( String [] args ){
        parttimeEmployee part= new parttimeEmployee(3000, 5);
        System.out.println(" Part Time Employee Name : " + (part.name=" CHutki "));
        System.out.println(" The Employee ID : " + (part.id="0246 "));
        System.out.println(" The salary of part time employee is " + part.calculateSalary() );;
        part.payTax();

        fulltimeEmployee emp= new fulltimeEmployee();
        System.out.println(" The Full Time Employee " + ( emp.name= " Bheem " ));
        System.out.println(" The Employee id " + ( emp.id= " 0225 " ));
        System.out.println(" The Salary of the Full time worker is " + emp.calculateSalary());
        emp.payTax();
    }
}