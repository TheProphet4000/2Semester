package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class Controller {

    Main game = new Main();

    @FXML
    private TextArea t1;

    @FXML
    private Button bDraw;

    @FXML
    private Button bKeep;

    @FXML
    private ImageView iEmotion;

    @FXML
    private Button bClose;

    public int randomNumber(){
        return (int) (Math.random() * (13 - 1 + 1) + 1);
    }

    public int randomSuit(){
        return (int) (Math.random() * (4 - 1 + 1) + 1);
    }

    @FXML
    void closeWindow(ActionEvent event) {
        t1.setText("You cant run from this game? \n");
        t1.appendText("Draw another card \n");
    }

    @FXML
    void drawCard(ActionEvent event) {
        String cardname;
        if (randomNumber() == 1) {
            cardname = "Ace";
        } else if (randomNumber() == 11) {
            cardname = "Jack";
        } else if (randomNumber() == 12) {
            cardname = "Queen";
        } else if (randomNumber() == 13) {
            cardname = "King";
        } else {
            cardname = String.valueOf(randomNumber());
        }

        String suitname;
        if (randomSuit() == 1) {
            suitname = "Diamonds";
        } else if (randomSuit() == 2) {
            suitname = "Clubs";
        } else if (randomSuit() == 3) {
            suitname = "Hearts";
        } else {
            suitname = "Spades";
        }

        String currentCard = cardname + " of " + suitname;

        t1.setText("So you picked "+ currentCard + "\n" + "If it's your luck card, keep it.");
    }

    @FXML
    void keepCard(ActionEvent event) {
        if(randomNumber() > 6 ){
            t1.setText("Welcome to the club" + "\n" + "enjoy the time you have left");
            t1.appendText("\n" +"You won the game");
        } else {
            t1.setText("Ohh that's bad for you "+ "\n" + "well dead men tell no tails");
            t1.appendText("\n" +"You lost the game");
        }
    }

}
