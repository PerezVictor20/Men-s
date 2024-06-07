package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ELEMENTOS DE MENÚ
        Menu fileMenu = new Menu("Archivo");
        MenuItem newMenuItem = new MenuItem("Nuevo");
        MenuItem openMenuItem = new MenuItem("Abrir");
        MenuItem saveMenuItem = new MenuItem("Guardar");
        MenuItem exitMenuItem = new MenuItem("Salir");

        // ACCIONES EN CONSOLA
        newMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Nuevo");
            }
        });

        openMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Abrir");
            }
        });

        saveMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Guardar");
            }
        });

        exitMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Salir");
                primaryStage.close();
            }
        });

        // MENU ARCHIVO CON ELEMENTOS
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);

        // ELEMENTOS DEL MENU EDITAR
        Menu editMenu = new Menu("Editar");
        MenuItem copyMenuItem = new MenuItem("Copiar");
        MenuItem pasteMenuItem = new MenuItem("Pegar");
        MenuItem deleteMenuItem = new MenuItem("Eliminar");
        
        copyMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Copiar");
            }
        });

        pasteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Pegar");
            }
        });

        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Eliminar");
            }
        });

        editMenu.getItems().addAll(copyMenuItem, pasteMenuItem, deleteMenuItem);

        // MENU AYUDA
        Menu helpMenu = new Menu("Ayuda");
        MenuItem aboutMenuItem = new MenuItem("Acerca de");

        aboutMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Se seleccionó la opción Acerca de");
            }
        });

        helpMenu.getItems().add(aboutMenuItem);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        // ESCENA
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sistema de menús");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
