import javax.swing.JFrame;
 
class Jframeokna extends JFrame {
    public static void main(String[] args) {
        new HelloSwing(); // создаём объект-окно
    }
 
    Jframeokna() {
        setTitle("Hello, Swing!");  // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        setSize(500, 300); // размеры окна
        setLocationRelativeTo(null); // позиция на экране
        setVisible(true); // сделать видимым
    }
}
//package jframeokna;
//
//import static com.sun.glass.ui.Cursor.setVisible;
//import java.util.Scanner;
//import javax.swing.JFrame;
//
//
///**
// *
// * @author Student
// */
//public class Jframeokna {
//
//    public static void main(String[] args) {
//         new Jframeokna(); 
//    }
//        Jframeokna(){
//        setTitle("Hello, Swing!");  // заголовок окна
//        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
//        setSize(300, 300); // размеры окна
//        setLocationRelativeTo(null); // позиция на экране
//        setVisible(true); // сделать видимым
//    }
//    }
//    
//    
//
