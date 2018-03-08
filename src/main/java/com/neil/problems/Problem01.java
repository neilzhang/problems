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
        exam.addQuestion(new Question(exam, 1) {

            @Override
            public int complexity() {
                return 1;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, guesses);
                        break;
                    case "B":
                        doCase(guess, guesses);
                        break;
                    case "C":
                        doCase(guess, guesses);
                        break;
                    case "D":
                        doCase(guess, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, List<Guess> guesses) {
                guesses.add(guess.copy());
            }

        });
        exam.addQuestion(new Question(exam, 2) {

            @Override
            public int complexity() {
                return 2;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, 5, "C", guesses);
                        break;
                    case "B":
                        doCase(guess, 5, "D", guesses);
                        break;
                    case "C":
                        doCase(guess, 5, "A", guesses);
                        break;
                    case "D":
                        doCase(guess, 5, "B", guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, String choice, List<Guess> guesses) {
                Guess copy = guess.copy();
                if (copy.setResult(q1, choice)) {
                    guesses.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(exam, 3) {

            @Override
            public int complexity() {
                return 5;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, 6, 2, 4, 3, guesses);
                        break;
                    case "B":
                        doCase(guess, 3, 2, 4, 6, guesses);
                        break;
                    case "C":
                        doCase(guess, 3, 6, 4, 2, guesses);
                        break;
                    case "D":
                        doCase(guess, 3, 6, 2, 4, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, int q2, int q3, int q4, List<Guess> guesses) {
                String[] choices = getChoices();
                for (String choice1 : choices) {
                    Guess copy = guess.copy();
                    if (copy.setResult(q1, choice1) && copy.setResult(q2, choice1) && copy.setResult(q3, choice1)) {
                        for (String choice2 : choices) {
                            if (!choice2.equals(choice1) && copy.setResult(q4, choice2)) {
                                guesses.add(copy);
                            }
                        }
                    }
                }
            }

        });
        exam.addQuestion(new Question(exam, 4) {

            @Override
            public int complexity() {
                return 8;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, 1, 5, guesses);
                        break;
                    case "B":
                        doCase(guess, 2, 7, guesses);
                        break;
                    case "C":
                        doCase(guess, 1, 9, guesses);
                        break;
                    case "D":
                        doCase(guess, 6, 10, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, int q2, List<Guess> guesses) {
                String[] choices = getChoices();
                for (String choice : choices) {
                    Guess copy = guess.copy();
                    if (copy.setResult(q1, choice) && copy.setResult(q2, choice)) {
                        guesses.add(copy);
                    }
                }
            }

        });
        exam.addQuestion(new Question(exam, 5) {

            @Override
            public int complexity() {
                return 5;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, result, 8, guesses);
                        break;
                    case "B":
                        doCase(guess, result, 4, guesses);
                        break;
                    case "C":
                        doCase(guess, result, 9, guesses);
                        break;
                    case "D":
                        doCase(guess, result, 7, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, String result, int q1, List<Guess> guesses) {
                Guess copy = guess.copy();
                if (copy.setResult(q1, result)) {
                    guesses.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(exam, 6) {

            @Override
            public int complexity() {
                return 9;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                String[] choices = getChoices();
                switch (result) {
                    case "A":
                        doCase(guess, 2, 4, 8, guesses);
                        break;
                    case "B":
                        doCase(guess, 1, 6, 8, guesses);
                        break;
                    case "C":
                        doCase(guess, 3, 10, 8, guesses);
                        break;
                    case "D":
                        doCase(guess, 5, 9, 8, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, int q2, int q3, List<Guess> guesses) {
                String[] choices = getChoices();
                for (String choice : choices) {
                    Guess copy = guess.copy();
                    if (copy.setResult(q1, choice) && copy.setResult(q2, choice) && copy.setResult(q3, choice)) {
                        guesses.add(copy);
                    }
                }
            }

        });
        exam.addQuestion(new Question(exam, 7) {

            @Override
            public int complexity() {
                return 0;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, "C", guesses);
                        break;
                    case "B":
                        doCase(guess, "B", guesses);
                        break;
                    case "C":
                        doCase(guess, "A", guesses);
                        break;
                    case "D":
                        doCase(guess, "D", guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, String choice, List<Guess> guesses) {
                int count = 0;
                List<Guess> results = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    Guess copy = guess.copy();
                    if (copy.setResult(i, choice)) {
                        results.add(copy);
                        count++;
                    }
                }
                if (count <= 1) {
                    guesses.add(guess.copy());
                } else {
                    guesses.addAll(results); //增加一些猜测
                    guesses.add(guess.copy());
                }
            }

        });
        exam.addQuestion(new Question(exam, 8) {

            @Override
            public int complexity() {
                return 6;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                Guess copy;
                switch (result) {
                    case "A":
                        doCase(guess, 1, 7, guesses);
                        break;
                    case "B":
                        doCase(guess, 1, 5, guesses);
                        break;
                    case "C":
                        doCase(guess, 1, 2, guesses);
                        break;
                    case "D":
                        doCase(guess, 1, 10, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, int q2, List<Guess> guesses) {
                Guess copy = guess.copy();
                if (copy.setResult(q1, "A") && copy.setResult(q2, "C")) {
                    guesses.add(copy);
                }
                copy = guess.copy();
                if (copy.setResult(q1, "C") && copy.setResult(q2, "A")) {
                    guesses.add(copy);
                }
                copy = guess.copy();
                if (copy.setResult(q1, "B") && copy.setResult(q2, "D")) {
                    guesses.add(copy);
                }
                copy = guess.copy();
                if (copy.setResult(q1, "D") && copy.setResult(q2, "B")) {
                    guesses.add(copy);
                }
                copy = guess.copy();
                if (copy.setResult(q1, "A") && copy.setResult(q2, "D")) {
                    guesses.add(copy);
                }
                copy = guess.copy();
                if (copy.setResult(q1, "D") && copy.setResult(q2, "A")) {
                    guesses.add(copy);
                }
            }

        });
        exam.addQuestion(new Question(exam, 9) {

            @Override
            public int complexity() {
                return 6;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        doCase(guess, 6, guesses);
                        break;
                    case "B":
                        doCase(guess, 10, guesses);
                        break;
                    case "C":
                        doCase(guess, 2, guesses);
                        break;
                    case "D":
                        doCase(guess, 9, guesses);
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, int q1, List<Guess> guesses) {
                String[] choices = getChoices();
                for (String choice1 : choices) {
                    Guess copy = guess.copy();
                    if (copy.setResult(1, choice1) && copy.setResult(6, choice1)) {
                        for (String choice2 : choices) {
                            if (copy.setResult(q1, choice2) != copy.setResult(5, choice2)) {
                                guesses.add(copy);
                            }
                        }
                    } else {
                        for (String choice2 : choices) {
                            if (copy.setResult(q1, choice2) == copy.setResult(5, choice2)) {
                                guesses.add(copy);
                            }
                        }
                    }
                }
            }

        });
        exam.addQuestion(new Question(exam, 10) {

            @Override
            public int complexity() {
                return 0;
            }

            @Override
            public List<Guess> calculate(String result, Guess guess) {
                List<Guess> guesses = new ArrayList<>();
                switch (result) {
                    case "A":
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    case "D":
                        break;
                }
                return guesses;
            }

            private void doCase(Guess guess, List<Guess> guesses) {

            }

        });
        Examinee examinee = new Examinee();
        List<Guess> guesses = examinee.complete(exam);
        System.out.println(guesses);
    }

    abstract class Question {

        private Exam exam;

        private int qid;

        public Question(Exam exam, int qid) {
            this.exam = exam;
            this.qid = qid;
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

        public List<Guess> verify(Guess guess) {
            int qid = getQid();
            guess.verify(qid);
            String result = guess.getResult(qid);
            if (result != null) {
                return calculate(result, guess);
            }
            return new ArrayList<>();
        }

        public abstract int complexity();

        public abstract List<Guess> calculate(String result, Guess guess);
    }

    class Guess {

        private HashMap<Integer, String> results = new HashMap<>();

        private ArrayList<Integer> verifyings = new ArrayList<>();

        public boolean setResult(int qid, String result) {
            if (result == null) {
                throw new NullPointerException();
            }
            String currentResult = getResult(qid);
            if (currentResult == null) {
                results.put(qid, result);
                verifyings.add(qid);
                return true;
            } else if (result.equals(currentResult)) {
                return true;
            } else {
                return false;
            }
        }

        public String getResult(int qid) {
            return results.get(qid);
        }

        public List<Integer> getVerifyingList() {
            return verifyings;
        }

        public boolean verify(int qid) {
            return verifyings.remove((Object) qid);
        }

        public boolean isFinished(Exam exam) {
            List<Question> questions = exam.getQuestions();
            for (Question question : questions) {
                int qid = question.getQid();
                if (results.get(qid) == null || verifyings.indexOf(qid) != -1) {
                    return false;
                }
            }
            return true;
        }

        public Guess copy() {
            Guess clone = new Guess();
            clone.results = (HashMap<Integer, String>) this.results.clone();
            clone.verifyings = (ArrayList<Integer>) this.verifyings.clone();
            return clone;
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

        private LinkedList<Guess> guessGuesses = new LinkedList<>();

        public List<Guess> complete(Exam exam) {
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
                    Guess guess = new Guess();
                    guess.setResult(question.getQid(), choice);
                    guessGuesses.add(guess);
                }
            }
            while (!guessGuesses.isEmpty()) {
                Guess guess = guessGuesses.pop();
                if (!guess.isFinished(exam)) {
                    List<Integer> verifyingList = guess.getVerifyingList();
                    for (int qid : verifyingList) {
                        Question question = exam.getQuestion(qid);
                        List<Guess> guesses = question.verify(guess);
                        guessGuesses.addAll(guesses);
                    }
                }
            }
            return guessGuesses;
        }

    }

}
