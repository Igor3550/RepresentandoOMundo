public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.name = "userName";
        user.question.question = "Em qual situação devo usar componentização?";
        user.question.answer = "Depende!";
        user.setQuestionAnswerState(user, true);

        System.out.println(user.question.question);
        System.out.println(user.question.answer);
        System.out.println("Question answered? " + user.question.getAnswerState());
    }
}
