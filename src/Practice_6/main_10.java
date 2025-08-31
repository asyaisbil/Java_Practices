package Practice_6;

//Department sınıfının içerisinde printDepartmentName isminde bir metod tanımlayınız.
// Metod hiçbir parametre almamalı ve ekrana "Department: " + name şeklinde departman adını bastırmalıdır.
// Employee sınıfının içerisinde bir adet Department instance oluşturunuz. Var olan constructor'a bu instance atanmasını da ekleyiniz.
// Employee sınıfının showEmployeeDetails metodunun en altında department sınıfının printDepartmentName metodunu çağırınız.

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println("Department: " + this.name);
    }
}


class Employee {
    String name;
    Department department = new Department("IT");

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    void showEmployeeDetails() {
        System.out.println("Employee: " + name);
        //Kod buraya
        department.printDepartmentName();
    }

}
