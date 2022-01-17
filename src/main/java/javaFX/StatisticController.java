package javaFX;
import javafx.event.ActionEvent;
import common.FileManager;
import engine.Graph;
import engine.TextAnalyzer;
import engine.TextStatistic;
import engine.WordsStatistic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static javaFX.Globals.textStat;
import static javaFX.Globals.wordStat;
public class StatisticController {
    @FXML
    Label labelWordsCount;
    @FXML
    Label labelUniqueWordsCount;
    @FXML
    TextArea textWordsOccur;
    Alert a = new Alert(Alert.AlertType.NONE); // value for alert type

    public void viewStatWholeText() {
        try {
            labelUniqueWordsCount.setText(Integer.toString(textStat.getNumberOfUniqueWords())); // WholeTextStats
            textWordsOccur.setText(textStat.getWordsOccurrence().toString());
            labelWordsCount.setText(Integer.toString(textStat.getNumberOfWords()));
            System.out.println(textStat);
        } catch (Exception e){
            // Handle a potential exception
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Run Analyzer FIRST !");
            // show the dialog
            a.show();
        }
    }

   public void viewStatAnalyzedText() {
        try {
            labelUniqueWordsCount.setText(Integer.toString(wordStat.getNumberOfUniqueWords())); // WholeTextStats
            textWordsOccur.setText(wordStat.getWordsOccurrence().toString());
            labelWordsCount.setText(Integer.toString(wordStat.getNumberOfWords()));
            System.out.println(wordStat);
        }catch (Exception e){
            // Handle a potential exception
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Run Analyzer FIRST !");
            // show the dialog
            a.show();
        }
        /*
       public List<String> getWords() {
           return words;
       }
       public int getNumberOfWords() {
           return numberOfWords;
       }
       public int getNumberOfUniqueWords() {
           return numberOfUniqueWords;
       }
       public Map<String, Integer> getWordsOccurrence() {
           return wordsOccurrence;
       }
         */
    }
}


