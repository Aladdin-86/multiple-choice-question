//import javax.swing.JOptionPane;

public class Quiz {
//    static int nQuestions = 0;
//    static int nCorrect = 0;

//    static String ask(String question) {
//        String answer = JOptionPane.showInputDialog(question);
//        if (answer == null || answer.trim().equals("")) {
//            return ask(question);
//        }
//        answer = answer.toUpperCase();
//        if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
//            return answer;
//        }
//        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
//        return ask(question);
//    }
//
//    static void check(String question, String correctAnswer) {
//        nQuestions++;
//        String answer = ask(question);
//        if (answer.equals(correctAnswer)) {
//            nCorrect++;
//            JOptionPane.showMessageDialog(null, "Correct!");
//        } else {
//            JOptionPane.showMessageDialog(null, "Sorry, the correct answer is " + correctAnswer);
//        }
//    }

	public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
                "How many months have 31 days in them?",
                "10",
                "8",
                "6",
                "7",
                "5",
                "D");
        question1.check();

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
                "What is the oldest city in the world?",
                "Cairo",
                "Jeruselem",
                "Rome",
                "Damascus",
                "Jordan",
                "D");
        question2.check();

        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
                "Where was the first music note found?",
                "Andorra",
                "Madina",
                "Egypt",
                "Iraq",
                "Ugarit",
                "D");
        question3.check();

        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
                "How many countries start with the letter Z?",
                "9",
                "12",
                "3",
                "6",
                "2",
                "E");
        question4.check();
        
        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
                "How many minutes are in a full week?",
                "10080",
                "34000",
                "65000",
                "11040",
                "10120",
                "A");
        question5.check();
        
        MultipleChoiceQuestion.showResults();
    }
}

	