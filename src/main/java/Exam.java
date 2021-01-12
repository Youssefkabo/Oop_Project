import java.util.*;
public class Exam {
    public String[] questions;
    public int[] answers;
    public int score = 0;

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public void setAnswers(int[] answers) {
        this.answers = answers;
    }
    public int takeExam() {
         Scanner scan = new Scanner(System.in);
         int index = 0;
         while (index < this.questions.length){
             System.out.println("Questions" + index + ":" + this.questions[index]);
             int my_answer = scan.nextInt();
             if (my_answer == this.answers[index])
                 score=score + 1;
             
             
         }
         System.out.println("The exam has ended your score is "+ score + "/" + this.questions.length);
         return score;
    }

    public Exam(int exam_id, String[] questions, int[] answers) {
        this.questions = questions;
        this.answers = answers;
    }
}
