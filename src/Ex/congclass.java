package Ex;

import student;

public class congclass {
    private int id;
    private String className;
    private String teacher;
    private student[] liststudent;
    
    public congclass(int id, String className, String teacher, student[] liststudent) {
        this.id = id;
        this.className = className;
        this.teacher = teacher;
        this.liststudent = liststudent;
    }
    public int getId() {
        return id;
    }
    public String getClassName() {
        return className;
    }
    public student[] getListStudent() {
        return liststudent;
    }
    public String getTeacher() {
        return teacher;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setListStudent(student[] liststudent) {
        this.liststudent = liststudent;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
