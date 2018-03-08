package com.neil.problems;

import java.util.*;

/**
 * @author neil
 */
public class Problem01 {

    public static void main(String[] args) {
        new Problem01().solve();
    }

    private void solve() {
        Exam exam = new Exam();
        exam.addQuestion(new Question(1, exam) {

            @Override
            public int complexity() {
                return 1;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, answers);
                        break;
                    case "B":
                        doCase(answer, answers);
                        break;
                    case "C":
                        doCase(answer, answers);
                        break;
                    case "D":
                        doCase(answer, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, List<Answer> answers) {
                answers.add(answer.copy());
            }

        });
        exam.addQuestion(new Question(2, exam) {

            @Override
            public int complexity() {
                return 2;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, 5, "C", answers);
                        break;
                    case "B":
                        doCase(answer, 5, "D", answers);
                        break;
                    case "C":
                        doCase(answer, 5, "A", answers);
                        break;
                    case "D":
                        doCase(answer, 5, "B", answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, String choice, List<Answer> answers) {
                Answer copy = answer.copy();
                if (copy.guess(q1, choice)) {
                    answers.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(3, exam) {

            @Override
            public int complexity() {
                return 5;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, 6, 2, 4, 3, answers);
                        break;
                    case "B":
                        doCase(answer, 3, 2, 4, 6, answers);
                        break;
                    case "C":
                        doCase(answer, 3, 6, 4, 2, answers);
                        break;
                    case "D":
                        doCase(answer, 3, 6, 2, 4, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, int q2, int q3, int q4, List<Answer> answers) {
                String[] choices = getChoices();
                for (String choice1 : choices) {
                    Answer copy = answer.copy();
                    if (copy.guess(q1, choice1) && copy.guess(q2, choice1) && copy.guess(q3, choice1)) {
                        for (String choice2 : choices) {
                            if (!choice2.equals(choice1) && copy.guess(q4, choice2)) {
                                answers.add(copy);
                            }
                        }
                    }
                }
            }

        });
        exam.addQuestion(new Question(4, exam) {

            @Override
            public int complexity() {
                return 8;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, 1, 5, answers);
                        break;
                    case "B":
                        doCase(answer, 2, 7, answers);
                        break;
                    case "C":
                        doCase(answer, 1, 9, answers);
                        break;
                    case "D":
                        doCase(answer, 6, 10, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, int q2, List<Answer> answers) {
                String[] choices = getChoices();
                for (String choice : choices) {
                    Answer copy = answer.copy();
                    if (copy.guess(q1, choice) && copy.guess(q2, choice)) {
                        answers.add(copy);
                    }
                }
            }

        });
        exam.addQuestion(new Question(5, exam) {

            @Override
            public int complexity() {
                return 5;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, result, 8, answers);
                        break;
                    case "B":
                        doCase(answer, result, 4, answers);
                        break;
                    case "C":
                        doCase(answer, result, 9, answers);
                        break;
                    case "D":
                        doCase(answer, result, 7, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, String result, int q1, List<Answer> answers) {
                Answer copy = answer.copy();
                if (copy.guess(q1, result)) {
                    answers.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(6, exam) {

            @Override
            public int complexity() {
                return 9;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                String[] choices = getChoices();
                switch (result) {
                    case "A":
                        doCase(answer, 2, 4, 8, answers);
                        break;
                    case "B":
                        doCase(answer, 1, 6, 8, answers);
                        break;
                    case "C":
                        doCase(answer, 3, 10, 8, answers);
                        break;
                    case "D":
                        doCase(answer, 5, 9, 8, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, int q2, int q3, List<Answer> answers) {
                String[] choices = getChoices();
                for (String choice : choices) {
                    Answer copy = answer.copy();
                    if (copy.guess(q1, choice) && copy.guess(q2, choice) && copy.guess(q3, choice)) {
                        answers.add(copy);
                    }
                }
            }

        });
        exam.addQuestion(new Question(7, exam) {

            @Override
            public int complexity() {
                return 0;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, "C", answers);
                        break;
                    case "B":
                        doCase(answer, "B", answers);
                        break;
                    case "C":
                        doCase(answer, "A", answers);
                        break;
                    case "D":
                        doCase(answer, "D", answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, String result, List<Answer> answers) {
                Exam exam = getExam();
                String[] choices = getChoices();
                if (answer.isFinished(exam)) {
                    int minxCount = Integer.MAX_VALUE;
                    for (String choice : choices) {
                        int count = answer.count(choice);
                        if (count < minxCount) {
                            minxCount = count;
                        }
                    }
                    if (minxCount == answer.count(result)) {
                        answers.add(answer);
                    }
                } else {
                    for (int i = 1; i <= 10; i++) {
                        for (String choice : choices) {
                            Answer copy = answer.copy();
                            if (copy.guess(i, choice)) {
                                answers.add(copy);
                            }
                        }
                    }
                }
            }

        });
        exam.addQuestion(new Question(8, exam) {

            @Override
            public int complexity() {
                return 6;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                Answer copy;
                switch (result) {
                    case "A":
                        doCase(answer, 1, 7, answers);
                        break;
                    case "B":
                        doCase(answer, 1, 5, answers);
                        break;
                    case "C":
                        doCase(answer, 1, 2, answers);
                        break;
                    case "D":
                        doCase(answer, 1, 10, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, int q2, List<Answer> answers) {
                Answer copy = answer.copy();
                if (copy.guess(q1, "A") && copy.guess(q2, "C")) {
                    answers.add(copy);
                }
                copy = answer.copy();
                if (copy.guess(q1, "C") && copy.guess(q2, "A")) {
                    answers.add(copy);
                }
                copy = answer.copy();
                if (copy.guess(q1, "B") && copy.guess(q2, "D")) {
                    answers.add(copy);
                }
                copy = answer.copy();
                if (copy.guess(q1, "D") && copy.guess(q2, "B")) {
                    answers.add(copy);
                }
                copy = answer.copy();
                if (copy.guess(q1, "A") && copy.guess(q2, "D")) {
                    answers.add(copy);
                }
                copy = answer.copy();
                if (copy.guess(q1, "D") && copy.guess(q2, "A")) {
                    answers.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(9, exam) {

            @Override
            public int complexity() {
                return 6;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, 6, answers);
                        break;
                    case "B":
                        doCase(answer, 10, answers);
                        break;
                    case "C":
                        doCase(answer, 2, answers);
                        break;
                    case "D":
                        doCase(answer, 9, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int q1, List<Answer> answers) {
                String[] choices = getChoices();
                for (String choice1 : choices) {
                    Answer copy = answer.copy();
                    if (copy.guess(1, choice1) && copy.guess(6, choice1)) {
                        for (String choice2 : choices) {
                            if (copy.guess(q1, choice2) != copy.guess(5, choice2)) {
                                answers.add(copy);
                            }
                        }
                    } else {
                        for (String choice2 : choices) {
                            if (copy.guess(q1, choice2) == copy.guess(5, choice2)) {
                                answers.add(copy);
                            }
                        }
                    }
                }
            }

        });
        exam.addQuestion(new Question(10, exam) {

            @Override
            public int complexity() {
                return 0;
            }

            @Override
            public List<Answer> calculate(String result, Answer answer) {
                List<Answer> answers = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(answer, 3, answers);
                        break;
                    case "B":
                        doCase(answer, 2, answers);
                        break;
                    case "C":
                        doCase(answer, 4, answers);
                        break;
                    case "D":
                        doCase(answer, 1, answers);
                        break;
                }
                return answers;
            }

            private void doCase(Answer answer, int diff, List<Answer> answers) {
                Exam exam = getExam();
                String[] choices = getChoices();
                if (answer.isFinished(exam)) {
                    int maxCount = 0;
                    int minxCount = Integer.MAX_VALUE;
                    for (String choice : choices) {
                        int count = answer.count(choice);
                        if (count > maxCount) {
                            maxCount = count;
                        }
                        if (count < minxCount) {
                            minxCount = count;
                        }
                    }
                    if (maxCount - minxCount == diff) {
                        answers.add(answer);
                    }
                } else {
                    for (int i = 1; i <= 10; i++) {
                        for (String choice : choices) {
                            Answer copy = answer.copy();
                            if (copy.guess(i, choice)) {
                                answers.add(copy);
                            }
                        }
                    }
                }
            }

        });
        Examinee examinee = new Examinee();
        Answer answer = examinee.complete(exam);
        System.out.println(answer);
    }

    abstract class Question {

        private int qid;

        private Exam exam;

        public Question(int qid, Exam exam) {
            this.qid = qid;
            this.exam = exam;
        }

        public int getQid() {
            return qid;
        }

        public Exam getExam() {
            return exam;
        }

        public String[] getChoices() {
            return new String[]{"A", "B", "C", "D"};
        }

        public List<Answer> verify(Answer answer) {
            int qid = getQid();
            answer.verify(qid);
            String result = answer.get(qid);
            if (result != null) {
                return calculate(result, answer);
            }
            return new ArrayList<>();
        }

        public abstract int complexity();

        public abstract List<Answer> calculate(String result, Answer answer);

        @Override
        public String toString() {
            return "Question{" +
                    "qid=" + qid +
                    ", exam=" + exam +
                    '}';
        }
    }

    class Answer {

        private HashMap<Integer, String> results = new HashMap<>();

        private ArrayList<Integer> verifications = new ArrayList<>();

        public boolean guess(int qid, String result) {
            if (result == null) {
                throw new NullPointerException();
            }
            String currentResult = results.get(qid);
            if (currentResult == null) {
                results.put(qid, result);
                verifications.add(qid);
                return true;
            } else if (result.equals(currentResult)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean verify(int qid) {
            return verifications.remove((Object) qid);
        }

        public String get(int qid) {
            return results.get(qid);
        }

        public List<Integer> getVerifyingList() {
            return new ArrayList<>(verifications);
        }

        public boolean isFinished(Exam exam) {
            List<Question> questions = exam.getQuestions();
            for (Question question : questions) {
                int qid = question.getQid();
                if (results.get(qid) == null) {
                    return false;
                }
            }
            return true;
        }

        public boolean isRight(Exam exam) {
            return isFinished(exam) && verifications.isEmpty();
        }

        public int count(String result) {
            int count = 0;
            for (String item : results.values()) {
                if (item.equals(result)) {
                    count++;
                }
            }
            return count;
        }

        public Answer copy() {
            Answer clone = new Answer();
            clone.results = (HashMap<Integer, String>) this.results.clone();
            clone.verifications = (ArrayList<Integer>) this.verifications.clone();
            return clone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Answer answer = (Answer) o;
            return Objects.equals(results, answer.results);
        }

        @Override
        public int hashCode() {
            return Objects.hash(results);
        }

        @Override
        public String toString() {
            return "Answer{" +
                    "results=" + results +
                    '}';
        }
    }

    class Exam {

        private List<Question> questionList = new ArrayList<>();

        private Map<Integer, Question> questionMap = new HashMap<>();

        public void addQuestion(Question question) {
            questionList.add(question);
            questionMap.put(question.getQid(), question);
        }

        public List<Question> getQuestions() {
            return questionList;
        }

        public Question getQuestion(int qid) {
            return questionMap.get(qid);
        }

    }

    class Examinee {

        private LinkedList<Answer> guessAnswers = new LinkedList<>();

        private HashMap<Answer, Object> historyAnswers = new HashMap<>();

        public Answer complete(Exam exam) {
            final String[] choices = new String[]{
                    "A", "B", "C", "D"
            };
            List<Question> questions = exam.getQuestions();
            Collections.sort(questions, new Comparator<Question>() {
                @Override
                public int compare(Question o1, Question o2) {
                    return o2.complexity() - o1.complexity();
                }
            });
            for (Question question : questions) {
                for (String choice : choices) {
                    Answer answer = new Answer();
                    answer.guess(question.getQid(), choice);
                    guessAnswers.add(answer);
                }
            }
            while (!guessAnswers.isEmpty()) {
                Answer answer = guessAnswers.pop();
                System.out.println(answer);
                if (!answer.isRight(exam)) {
                    List<Integer> verifyingList = answer.getVerifyingList();
                    for (int qid : verifyingList) {
                        Question question = exam.getQuestion(qid);
                        List<Answer> answers = question.verify(answer);
                        for (Answer item : answers) {
                            if (historyAnswers.containsKey(item)) {
                                continue;
                            } else {
                                guessAnswers.add(item);
                                historyAnswers.put(item, new Object());
                            }
                        }
                    }
                } else {
                    return answer;
                }
            }
            return null;
        }

    }

}
