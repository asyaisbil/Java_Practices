package Practice_6;

//Aşağıdaki sınıftan bir instance oluşturulup ekrana basıldığın da şu şekilde bir ekran görüntüsü beklenmektedir.
// Student{name=Elon, studentNumber: 100} bu görüntünün yakalanabilmesi için eklenmesi gereken kodu ekleyiniz.

class Student {
    private String name = "Elon";
    private int studentNumber = 100;

    public String getName(){
        return this.name;
    }

    public int getStudentNumber(){
        return this.studentNumber;
    }
}

public class main_01 {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Student{name=" + student.getName() + ", studentNumber: " + student.getStudentNumber() + "}");
    }
}