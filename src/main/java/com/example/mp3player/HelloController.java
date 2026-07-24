package com.example.mp3player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;


import javax.print.attribute.standard.Media;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HelloController implements Initializable {
    @FXML
    private Pane pane;
    @FXML
    private Label songLabel;
    @FXML
    private Button playbtn, pausebtn, resetbtn, previousbtn, nextbtn;
    @FXML
    private ComboBox<String> sppedBox;
    @FXML
    private Slider volumeSlider;
    @FXML
    private ProgressBar songProgressBar;

    private Media media;
    private MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;

    private ArrayList<File> songs;

    private int songNumber;
    private int[] sppeds = {25, 50, 75, 100, 125, 150, 175, 200};

    private Timer timer;
    private TimerTask task;
    private boolean running;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    songs = new ArrayList<File>();

    directory = new File("music");

    files = directory.listFiles();
    if (files != null){
        for (File file : files){
            songs.add(file);
            System.out.println(file);
        }
    }
    }

    public void playMedia(){

    }
    public void pauseMedia(){

    }
    public void resetMedia(){

    }
    public void previousMedia(){

    }
    public void nextMedia(){

    }
    public void changeSpeed(ActionEvent event){

    }
    public void beginTimer(){

    }
    public void cancelTimer(){

    }

}
