package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int burgerTeamA = 0;
    int pizzaTeamA = 0;
    int hotdogTeamA = 0;
    int burgerTeamB = 0;
    int pizzaTeamB = 0;
    int hotdogTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayForTeamA(int scoreTeamA) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + scoreTeamA);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        burgerTeamA = burgerTeamA + 1;
        if (burgerTeamA >= 9) {
            burgerTeamA = 9;
            scoreTeamA = burgerTeamA * 3 + pizzaTeamA * 2 + hotdogTeamA;
        }
        displayForTeamA(scoreTeamA);
        displayBurgerForTeamA(burgerTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        pizzaTeamA = pizzaTeamA + 1;
        if (pizzaTeamA >= 9) {
            pizzaTeamA = 9;
            scoreTeamA = burgerTeamA * 3 + pizzaTeamA * 2 + hotdogTeamA;
        }
        displayForTeamA(scoreTeamA);
        displayPizzaForTeamA(pizzaTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        hotdogTeamA = hotdogTeamA + 1;
        if (hotdogTeamA >= 9) {
            hotdogTeamA = 9;
            scoreTeamA = burgerTeamA * 3 + pizzaTeamA * 2 + hotdogTeamA;
        }
        displayForTeamA(scoreTeamA);
        displayHotdogForTeamA(hotdogTeamA);
    }

    private void displayBurgerForTeamA(int burgerTeamA) {
        TextView burgerTextView = (TextView) findViewById(R.id.team_a_burger);
        burgerTextView.setText("" + burgerTeamA);
    }

    private void displayPizzaForTeamA(int pizzaTeamA) {
        TextView pizzaTextView = (TextView) findViewById(R.id.team_a_pizza);
        pizzaTextView.setText("" + pizzaTeamA);
    }

    private void displayHotdogForTeamA(int hotdogTeamA) {
        TextView hotdogTextView = (TextView) findViewById(R.id.team_a_hotdog);
        hotdogTextView.setText("" + hotdogTeamA);
    }


    private void displayForTeamB(int scoreTeamB) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + scoreTeamB);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        burgerTeamB = burgerTeamB + 1;
        if (burgerTeamB >= 9) {
            burgerTeamB = 9;
            scoreTeamB = burgerTeamB * 3 + pizzaTeamB * 2 + hotdogTeamB;
        }
        displayForTeamB(scoreTeamB);
        displayBurgerForTeamB(burgerTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        pizzaTeamB = pizzaTeamB + 1;
        if (pizzaTeamB >= 9) {
            pizzaTeamB = 9;
            scoreTeamB = burgerTeamB * 3 + pizzaTeamB * 2 + hotdogTeamB;
        }
        displayForTeamB(scoreTeamB);
        displayPizzaForTeamB(pizzaTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        hotdogTeamB = hotdogTeamB + 1;
        if (hotdogTeamB >= 9) {
            hotdogTeamB = 9;
            scoreTeamB = burgerTeamB * 3 + pizzaTeamB * 2 + hotdogTeamB;
        }
        displayForTeamB(scoreTeamB);
        displayHotdogForTeamB(hotdogTeamB);
    }

    private void displayBurgerForTeamB(int burgerTeamB) {
        TextView burgerTextView = (TextView) findViewById(R.id.team_b_burger);
        burgerTextView.setText("" + burgerTeamB);
    }

    private void displayPizzaForTeamB(int pizzaTeamB) {
        TextView pizzaTextView = (TextView) findViewById(R.id.team_b_pizza);
        pizzaTextView.setText("" + pizzaTeamB);
    }

    private void displayHotdogForTeamB(int hotdogTeamB) {
        TextView hotdogTextView = (TextView) findViewById(R.id.team_b_hotdog);
        hotdogTextView.setText("" + hotdogTeamB);
    }

    public void reset(View v) {
        scoreTeamA = scoreTeamA - scoreTeamA;
        scoreTeamB = scoreTeamB - scoreTeamB;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        burgerTeamA = burgerTeamA - burgerTeamA;
        pizzaTeamA = pizzaTeamA - pizzaTeamA;
        hotdogTeamA = hotdogTeamA - hotdogTeamA;
        burgerTeamB = burgerTeamB - burgerTeamB;
        pizzaTeamB = pizzaTeamB - pizzaTeamB;
        hotdogTeamB = hotdogTeamB - hotdogTeamB;
        displayBurgerForTeamA(burgerTeamA);
        displayPizzaForTeamA(pizzaTeamA);
        displayHotdogForTeamA(hotdogTeamA);
        displayBurgerForTeamB(burgerTeamB);
        displayPizzaForTeamB(pizzaTeamB);
        displayHotdogForTeamB(hotdogTeamB);
    }


}
