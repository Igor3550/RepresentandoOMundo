public class Question {
  String question;
  String answer;
  private boolean answerState = false;

  protected void setQuestionAnswerState(boolean answerState) {
    this.answerState = answerState;
  }

  public boolean getAnswerState() {
    return answerState;
  }
}