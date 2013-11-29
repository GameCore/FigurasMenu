
package figurasmenu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class FigurasMetodos extends JFrame{

Label lb1,lb2,lb3;
TextField txt1,txt2,txt3,txt4;
Button btn1;
String pesos;
    public  FigurasMetodos(){
  }
    
    public void ventanaCuadrado(){
    
    JFrame ventana = new JFrame();
    ventana.setTitle("Calcula el area del Cuadrado");
    ventana.setLayout(new FlowLayout());
// Añadimos las componentes propias de la interfaz
lb1= new Label("Lado");
txt1=new TextField(12);
//lb2= new Label("Altura");
//txt2=new TextField(12);
lb3= new Label("Area");
txt3=new TextField(12);
btn1 = new Button("Calcular");
txt4 = new TextField(12);
btn1.addActionListener(new ActionListener(){
   
    public void actionPerformed( ActionEvent evento )
{
     try{
    String lado,resultado;
    Double num1,res;
lado = txt1.getText();
num1 = Double.parseDouble(lado);
res = num1*num1;
resultado = Double.toString(res);
txt4.setText(resultado + " c.m2");
}catch(Exception e){

}

}

        
});


ventana.add(lb1);
ventana.add(txt1);

ventana.add(btn1);
ventana.add(lb3);
ventana.add(txt4);



    ventana.setSize(600, 150);
    ventana.setVisible(true);
    }
    
    public void ventanaCirculo(){
      JFrame ventana = new JFrame();
    ventana.setTitle("Calcula el area del Circulo");
    ventana.setLayout(new FlowLayout());
// Añadimos las componentes propias de la interfaz
lb1= new Label("Radio");
txt1=new TextField(12);
//lb2= new Label("Altura");
//txt2=new TextField(12);
lb3= new Label("Area");
txt3=new TextField(12);
btn1 = new Button("Calcular");
txt4 = new TextField(12);
btn1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent evento )
{
    String lado,resultado;
    Double num1,res;
lado = txt1.getText();
num1 = Double.parseDouble(lado);
res = Math.pow((Math.PI * num1),2);
resultado = Double.toString(res);
txt4.setText(resultado + " c.m2");
}
});

ventana.add(lb1);
ventana.add(txt1);

ventana.add(btn1);
ventana.add(lb3);
ventana.add(txt4);



    ventana.setSize(600, 150);
    ventana.setVisible(true);
    
    }
    
    public void ventanaTriangulo(){
        JFrame ventana = new JFrame();
    ventana.setTitle("Calcula el area del Triangulo");
    ventana.setLayout(new FlowLayout());
// Añadimos las componentes propias de la interfaz
lb1= new Label("Base");
txt1=new TextField(12);
lb2= new Label("Altura");
txt2=new TextField(12);
lb3= new Label("Area");
txt3=new TextField(12);
btn1 = new Button("Calcular");
txt4 = new TextField(12);
btn1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent evento )
{
    String base,altura,resultado;
    Double num1,num2,res;
base = txt1.getText();
altura = txt2.getText();
num1 = Double.parseDouble(base);
num2 = Double.parseDouble(altura);
res = (num1*num2)/2;
resultado = Double.toString(res);
txt4.setText(resultado);
}
});

ventana.add(lb1);
ventana.add(txt1);
ventana.add(lb2);
ventana.add(txt2);

ventana.add(btn1);
ventana.add(lb3);
ventana.add(txt4);



    ventana.setSize(600, 150);
    ventana.setVisible(true);
    
    }
    
    public void ventanaRectangulo(){
    JFrame ventana = new JFrame();
    ventana.setTitle("Calcula el area del Rectangulo");
    ventana.setLayout(new FlowLayout());
// Añadimos las componentes propias de la interfaz
lb1= new Label("Base");
txt1=new TextField(12);
lb2= new Label("Altura");
txt2=new TextField(12);
lb3= new Label("Area");
txt3=new TextField(12);
btn1 = new Button("Calcular");
txt4 = new TextField(12);
btn1.addActionListener(new ActionListener(){
    public void actionPerformed( ActionEvent evento )
{
    String base,altura,resultado;
    Double num1,num2,res;
base = txt1.getText();
altura = txt2.getText();
num1 = Double.parseDouble(base);
num2 = Double.parseDouble(altura);
res = num1*num2;
resultado = Double.toString(res);
txt4.setText(resultado + "c.m2");
}
});

ventana.add(lb1);
ventana.add(txt1);
ventana.add(lb2);
ventana.add(txt2);
ventana.add(btn1);
ventana.add(lb3);
ventana.add(txt4);



    ventana.setSize(600, 150);
    ventana.setVisible(true);
    
    }
    
}
