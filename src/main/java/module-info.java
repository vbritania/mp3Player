module com.example.mp3player {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.media;


    opens com.example.mp3player to javafx.fxml;
    exports com.example.mp3player;
}