/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project28tech;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.image.*;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class MainUIController implements Initializable {

    // Liên kết với các phần tử trong FXML
    @FXML
    private Button btnHome;

//    @FXML
//    private Button btnZoomCourses;
//
//    @FXML
//    private Button btnTutorial;
    
//    private ImageView imageView
    
    
    private Label labelBanner;
    
//    
//    public void initialize() {
//        btnHome.setOnAction(e -> {
//            labelBanner.setText("Da Doi Label Thanh Cong");
//        });
//    }

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       btnHome.setOnAction(e -> {
        labelBanner.setText("Đã đổi Label thành công");
    });
    }

    
    
}
