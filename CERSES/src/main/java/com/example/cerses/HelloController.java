package com.example.cerses;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;


public class HelloController {
    @FXML
    private TextField path;
    @FXML
    private Button addBtn,  deleteBtn, saveBtn, toList;
    @FXML
    private Label label;
    @FXML
    private TextField element;


    @FXML
    private ListView<String> listView;
    LinkedList list = new LinkedList();
    @FXML
    void Path() throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = (Pane)fxmlLoader.load(this.getClass().getResource("selectPath.fxml").openStream());
        Scene scene = new Scene(root, 600.0, 400.0);
        stage.setScene(scene);
        stage.setTitle("Program");
        stage.showAndWait();
    }
    @FXML
    void WindowList() throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = (Pane)fxmlLoader.load(this.getClass().getResource("list.fxml").openStream());
        Scene scene = new Scene(root, 600.0, 400.0);
        stage.setScene(scene);
        stage.setTitle("Program");

        stage.showAndWait();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path.getText()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                list.add(line);
                listView.getItems().add(line);
                if (line == null) {
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void addElement(){
        list.add(element.getText());
        listView.getItems().add(element.getText());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\out.txt"));
            bufferedWriter.append(element.getText()+"\n");
            bufferedWriter.flush();
        }
        catch (IOException ex){

        }
    }
    @FXML
    void delElement(){
        listView.getItems().remove(element.getText());
        list.remove(element.getText());

    }
    @FXML
    void System(){
        list.print();

    }
    @FXML
    void File(){



    }


    @FXML
    void initialize() {


    }

}



