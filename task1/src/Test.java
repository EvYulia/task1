public class Test {
    public static void main(String[] args){
        MathStudent mathStudent = new MathStudent("Максимов Алексей Алексндрович",3,5);
        IUStudent IUStudent = new IUStudent("Андреев Андрей Андреевич",5,4);

        mathStudent.writeExam();
        IUStudent.writeExam();
    }
}
