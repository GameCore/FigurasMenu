package figurasmenu;

// Demostración de los menús
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PruebaMenu extends JFrame
{

private JLabel pantallaEtiqueta;
private int estilo;
// configurar GUI
public PruebaMenu()
{
super( "Figuras Geometricas" );
// establecer menú Archivo y sus elementos de menú
JMenu menuArchivo = new JMenu( "Archivo" );
menuArchivo.setMnemonic( 'A' );
// establecer elemento de menú Acerca de...
JMenuItem elementoAcerca = new JMenuItem( "Acerca de..." );
elementoAcerca.setMnemonic( 'c' );
menuArchivo.add( elementoAcerca );
elementoAcerca.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{
JOptionPane.showMessageDialog( PruebaMenu.this,
"Este programa calcula el area de las Figuras",
"CopyLeft", JOptionPane.PLAIN_MESSAGE );
}
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener
// establecer elemento de menú Salir
JMenuItem elementoSalir = new JMenuItem( "Salir" );
elementoSalir.setMnemonic( 'S' );
menuArchivo.add( elementoSalir );
elementoSalir.addActionListener(
new ActionListener() { // clase interna anónima
// terminar la aplicación cuando el usuario haga clic en elementoSalir
public void actionPerformed( ActionEvent evento )
{
System.exit( 0 );
}
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener
// crear barra de menús y adjuntarla a la ventana PruebaMenu
JMenuBar barra = new JMenuBar();
setJMenuBar( barra );
barra.add( menuArchivo );
// crear menú Formato, con sus submenús y elementos de menú
JMenu figuras = new JMenu( "Figuras" );
figuras.setMnemonic( 'F' );
JMenuItem cuadrado = new JMenuItem( "Cuadrado" );
cuadrado.setMnemonic( 'C' );
figuras.add( cuadrado );

cuadrado.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaCuadrado();
}
});
        

JMenuItem circulo = new JMenuItem( "Circulo" );
cuadrado.setMnemonic( 'D' );
figuras.add( circulo );
circulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaCirculo();
}
});


JMenuItem triangulo = new JMenuItem( "Triangulo" );
triangulo.setMnemonic( 'E' );
figuras.add( triangulo );
triangulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaTriangulo();
}
});

JMenuItem rectangulo = new JMenuItem( "Rectangulo" );
rectangulo.setMnemonic( 'F' );
figuras.add( rectangulo );

rectangulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaRectangulo();
}
});

barra.add(figuras);
setSize( 550, 200 );
setVisible( true );
} // fin del constructor
public static void main( String args[] )
{
PruebaMenu aplicacion = new PruebaMenu();
aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}
// clase interna para manejar eventos de acción de los elementos de menú
private class ManejadorEventos implements ActionListener {
// procesar selecciones de color y tipo de letra
public void actionPerformed( ActionEvent evento )
{

}

}
} // fin de la clase PruebaMenu