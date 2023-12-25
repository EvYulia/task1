public class IUStudent extends Student{
    public IUStudent(String name, int course, int examGrade){
        super(name, course, examGrade);
    }
    @Override
    public void writeExam(){
        System.out.println("IU student"+getFio()+"from"+getCourse()+"th course is writting an exam");
    }
}
