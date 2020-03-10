package src.com.swapnil;

class Student {
    int id;
    String name;
    int age;
}

class Class {
    public static void main(String[] args) {
        Student student1 = new Student();// Object or instance of the class
        student1.id = 380;
        student1.name = "Swapnil";
        student1.age = 19;
        System.out.println("Student 1 details are ");
        System.out.println("Id:-" + student1.id);
        System.out.println("Name:-" + student1.name);
        System.out.println("Age:-" + student1.age);
        Student student2 = new Student();
        student2.id = 381;
        student2.name = "Shubham";
        student2.age = 19;
        System.out.println("Student 2 details are ");
        System.out.println("Id:-" + student2.id);
        System.out.println("Name:-" + student2.name);
        System.out.println("Age:-" + student2.age);

    }

}