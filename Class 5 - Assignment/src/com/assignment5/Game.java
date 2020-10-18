package com.assignment5;

public class Game {
    Player player = new Player();
    Question[] questions = new Question[3];

    String[] questionsdata={"Who is the strongest student?","Who is the smartest student?","What is the capital of UK?"};
    String[] options1={"Erica","May","Manchester"};
    String[] options2={"Thor","Venus","Oxford"};
    String[] options3={"Hulk","Erica","Bath"};
    String[] options4={"Gigi","June","London"};
    int[] answers={1,3,4};

    public void initGame() {
        for (int i=0;i<3;i++) {
            questions[i] = new Question();
        }

        for(int i=0;i<3;i++)
        {
            questions[i].detail=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAns=answers[i];
        }
    }

    public void play() {
        System.out.println("Welcome to the game!");
        player.askDetails();
        boolean status;
        for(int i=0;i<3;i++)
        {
            status=questions[i].askQuestion();
            if (status) {
                player.score ++;
                System.out.println("You get the right answer");
                System.out.println();
            }
            else {
                System.out.println("You answer is wrong!");
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(player.name + ", your score is " + player.score);

    }
}
