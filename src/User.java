public class User {
  String name;
  Question question = new Question();

  public void setQuestionAnswerState(User user, boolean answerState){
    if(this.name != user.name){
      return;
    }
    this.question.setQuestionAnswerState(answerState);
  }
}
