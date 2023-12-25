public class MathStudent extends Student{
    public MathStudent(String fio, int course, int examGrade){
        super(fio, course, examGrade);
    }
    @Override
    public void writeExam(){
        System.out.println("FN student"+getFio()+"from"+getCourse()+"th course is writing an exam");
    }
}
