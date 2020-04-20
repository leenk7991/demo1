package demo;
public class Student{
String name;
double GPA;
public Student(String name, double GPA){
this.name=name;
this.GPA=GPA;
}
@Override
public String toString(){
    return "student: "+ name+" GPA: "+GPA;
}


}
