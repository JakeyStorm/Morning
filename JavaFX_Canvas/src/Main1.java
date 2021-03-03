import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Main1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(400,300);
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawShape(context);

        Group group = new Group();
        Scene scene = new Scene(group,500,500);
        group.getChildren().add(canvas);




        Circle circle = new Circle(250,250,250);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Circle eyesRight = new Circle(350,150,50);
        Circle eyesLeft = new Circle(150,150,50);

        Line glasses = new Line(120,150,300,150);
        glasses.setStrokeWidth(10);

        Line mouth = new Line(100,350,400,350);
        mouth.setStrokeWidth(50);

//        Arc arc = new Arc(50,100,100,100,121,121);
//        arc.setStroke(Color.BLACK);
////
//        CubicCurve cb = new CubicCurve(12,12,123,123,123,123,123,123);
//
//        Rectangle rg = new Rectangle(12,12,12,21);
//
//        Ellipse el = new Ellipse(500,500);
//
//
        Line line = new Line(0,0,100,100);
        line.setStroke(Color.GREEN);
//        line.setStrokeWidth(10);
        // Circle circle = new Circle(100,100,100);
//        circle.setStroke(Color.BLUE);
//        circle.setFill(Color.RED);
//        Text text = new Text(200,100,"Hi");
//        text.setFill(Color.ORANGE);
//        text.setFont(Font.font(50));
//
//        group.getChildren().add(line);
        group.getChildren().add(circle);
//        group.getChildren().add(text);
        //  group.getChildren().add(circle);
        group.getChildren().add(eyesLeft);
        group.getChildren().add(eyesRight);
        group.getChildren().add(glasses);
        group.getChildren().add(mouth);
        //  group.getChildren().add(arc);
        //group.getChildren().add(cb);
        //group.getChildren().add();
        //  group.getChildren().add(el);

        stage.setTitle("Hello world");
        stage.setScene(scene);
        stage.show();
    }
    public static void drawShape(GraphicsContext context){
//        context.setFill(Color.GREEN);
//        context.setStroke(Color.BLUE);
//        context.setLineWidth(5);
//        context.strokeLine(40,10,10,40);
//        context.fillOval(10,60,30,30);
//        context.strokeOval(60,60,30,30);
//        context.fillRoundRect(110,60,30,30,10,10);
//        context.strokeRoundRect(160,60,30,30,10,10);
//        context.fillArc(10,110,30,30,45,240,ArcType.OPEN);
//        context.fillArc(60,110,30,30,45,240,ArcType.CHORD);
//        context.fillArc(110,110,30,30,45,240,ArcType.ROUND);
//        context.strokeArc(10,160,30,30,45,240,ArcType.OPEN);
//        context.strokeArc(60,160,30,30,45,240,ArcType.CHORD);
//        context.strokeArc(110,160,30,30,45,240,ArcType.ROUND);
//        context.fillPolygon(new double[]{10,40,10,40},new double[]{210,210,240,240},4);
//        context.strokePolygon(new double[]{60,90,60,90},new double[]{210,210,240,240},4);
//        context.strokePolyline(new double[]{110,140,110,140},new double[]{210,210,240,240},4);

    }
}
