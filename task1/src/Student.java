abstract class Student {
    private final String fio;
    private int course;
    private int examGrage;
    //конструктор для параметров
    public Student(String fio, int course, int examGrade) {
        this.fio = fio;
        if (course < 1 || course > 6){
            throw new RuntimeException("course is invalid");
        } else {
            this.course = course;
        }
        if (examGrade<0 || examGrade>5){
            throw new RuntimeException("grade is invailid");
        } else {
            this.examGrage = examGrade;
        }
    }

    public int getCourse() {
        return course;
    }

    public String getFio() {
        return fio;
    }

    public int getExamGrage() {
        return examGrage;
    }

    public abstract void writeExam(); //метод без реализации
}