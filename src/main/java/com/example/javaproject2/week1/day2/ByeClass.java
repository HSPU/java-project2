package com.example.javaproject2.week1.day2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;

public class ByeClass {
    public static class ByeClass {
    }

    public static class ByeClassTest {
    }

    public static class CrawlDate {
        private LocalDateTime lastCrawlDateTime;
        // alt + insert

        public CrawlDate(LocalDateTime lastCrawlDateTime) {
            this.lastCrawlDateTime = lastCrawlDateTime;
        }
    }

    public static class HelloApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }

    public static class HelloController {
        @FXML
        private Label welcomeText;

        @FXML
        protected void onHelloButtonClick() {
            welcomeText.setText("Welcome to JavaFX Application!");
        }
    }

    public static class PrintHello {
        public void print() {
            System.out.println("Hello");
        }
    }

    public static class PrintHelloTest {
        public static void main(String[] args) {
            PrintHello printHello = new PrintHello(); // 인스턴스화
            printHello.print();
        }
    }
}
