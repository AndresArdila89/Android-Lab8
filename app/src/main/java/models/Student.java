package models;

public class Student extends Person{

    private String age;
    private String college;

    public Student(int id, String name, String picture, String age, String college) {
        super(id, name, picture);
        this.age = age;
        this.college = college;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }



    @Override
    public void work() {
        super.setRoll("Student");
    }
}
