
package tareacasodeestudio4;

/**
 *
 * @author Laura Maribel Chan oliva
 * Topicos avanzados de programación 4A
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ListaDeContactos extends JFrame {
    
    //constructor
    public ListaDeContactos( ){
        
        Container contenedorPrincipal = this.getContentPane();
        setLayout( new BorderLayout( ) );
        setSize( 540, 570 );
        setTitle( "Lista de Contactos" );
        
        //panel 1  lista de contactos
        JPanel panel1 = new JPanel ();
        panel1.setBorder( new TitledBorder( "Lista de Contactos" ) );
        
        JList listaContactos = new JList() ;
        JScrollPane panelLista = new JScrollPane( );
        panelLista.setPreferredSize( new Dimension( 305, 125 ) );
        panelLista.setViewportView( listaContactos );
        panelLista.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        panelLista.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        listaContactos.setModel( new DefaultListModel( ) );
        
        JButton botonVer = new JButton( "Ver" );
        JButton botonEliminar = new JButton( "Eliminar" );
        JButton botonTodos = new JButton( "Ver Todos los contactos" );
        JButton botonPalabra = new JButton( "Buscar por palabra clave" );
        panel1.add( panelLista, BorderLayout.EAST );
        
        JPanel panelBotones = new JPanel( );
        panelBotones.setLayout( new GridLayout( 4, 1, 5, 5 ) );
        panelBotones.add( botonTodos );
        panelBotones.add( botonPalabra );
        panelBotones.add( botonVer );
        panelBotones.add( botonEliminar );
        panel1.add( panelBotones, BorderLayout.WEST );
        
        //añadir todo el panel 1
        contenedorPrincipal.add( panel1, BorderLayout.NORTH );
        
        //panel 2 Datos personales del contacto
        JPanel panel2 = new JPanel ();
        panel2.setBorder( new TitledBorder( "Datos Personales del Contacto" ) );
        
        JPanel panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 4, 2,0,25) );

        JLabel etiquetaNombre = new JLabel( "Nombre" );
        JLabel etiquetaApellido = new JLabel( "Apellido" );
        JLabel etiquetaDireccion = new JLabel( "Dirección" );
        JLabel etiquetaCorreo = new JLabel( "Correo Electrónico" );

        JTextField campoNombre = new JTextField();
        //campoNombre.setSize(10, 10);
        JTextField campoApellido = new JTextField();
        JTextField campoDireccion = new JTextField();
        JTextField campoCorreo = new JTextField();

        panelDatos.add( etiquetaNombre );
        panelDatos.add( campoNombre );
        panelDatos.add( etiquetaApellido );
        panelDatos.add( campoApellido );
        panelDatos.add( etiquetaDireccion );
        panelDatos.add( campoDireccion );
        panelDatos.add( etiquetaCorreo );
        panelDatos.add( campoCorreo );

        panel2.add( panelDatos, BorderLayout.EAST );
        
        //Lista de teléfonos  
        JPanel panelTelefonos = new JPanel( );
        panelTelefonos.setLayout( new BorderLayout( ) );
        panelTelefonos.setBorder( new TitledBorder( "Teléfonos" ) );

        JScrollPane deslizableTelefonos = new JScrollPane( );
        JList listaTelefonos = new JList( );
        deslizableTelefonos.setPreferredSize( new Dimension( 170, 90 ) );
        deslizableTelefonos.setViewportView( listaTelefonos );
        deslizableTelefonos.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        deslizableTelefonos.setHorizontalScrollBarPolicy( javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        listaTelefonos.setModel( new DefaultListModel( ) );

        JButton botonAgregaTelefono = new JButton( "Agregar" );
        JButton botonEliminaTelefono = new JButton( "Eliminar" );
        
        JPanel panBotTelefonos = new JPanel( new GridLayout( 2, 1 ) );
        panBotTelefonos.add( botonAgregaTelefono );
        panBotTelefonos.add( botonEliminaTelefono );

        panelTelefonos.add( deslizableTelefonos, BorderLayout.WEST );
        panelTelefonos.add( panBotTelefonos, BorderLayout.EAST );
        
        //lista de palabras
        JPanel panelPalabras = new JPanel( );
        panelPalabras.setLayout( new BorderLayout( ) );
        panelPalabras.setBorder( new TitledBorder( "Palabras Clave" ) );

        JScrollPane deslizablePalabras = new JScrollPane( );
        JList listaPalabras = new JList( );
        deslizablePalabras.setPreferredSize( new Dimension( 170, 90 ) );
        deslizablePalabras.setViewportView( listaPalabras );
        deslizablePalabras.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        deslizablePalabras.setHorizontalScrollBarPolicy( javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        listaPalabras.setModel( new DefaultListModel( ) );

        JButton botonAgregaPalabra = new JButton( "Agregar" );
        JButton botonEliminaPalabra = new JButton( "Eliminar" );
          
        JPanel panBotPalabras = new JPanel( new GridLayout( 2, 1 ) );
        panBotPalabras.add( botonAgregaPalabra );
        panBotPalabras.add( botonEliminaPalabra );

        panelPalabras.add( deslizablePalabras, BorderLayout.WEST );
        panelPalabras.add( panBotPalabras, BorderLayout.EAST );

        JPanel panelListas = new JPanel( new GridLayout( 2, 1 ) );
        panelListas.add( panelTelefonos );
        panelListas.add( panelPalabras );

        panel2.add( panelListas, BorderLayout.WEST );
        
        //Organizar los botones
        JPanel panelbotones = new JPanel( );

        JButton botonAgregar = new JButton( );
        botonAgregar.setText( "Agregar Contacto" );
        JButton botonModificar = new JButton( );
        botonModificar.setText( "Modificar Contacto" );
        JButton botonLimpiar = new JButton( );
        botonLimpiar.setText( "Limpiar" );
  
        panelbotones.add( botonAgregar );
        panelbotones.add( botonModificar );
        panelbotones.add( botonLimpiar );

        panel2.add( panelbotones, BorderLayout.SOUTH );
            
       //añadir todo el panel 2
        contenedorPrincipal.add( panel2, BorderLayout.CENTER );
        
        //panel 3 Extensiones
        JPanel panel3 = new JPanel ();
        panel3.setBorder( new TitledBorder( "Extensiones" ) );
        
        JButton opcion1 = new JButton( );
        opcion1.setText( "Opcion1" );
        
        JButton opcion2 = new JButton( );
        opcion2.setText( "Opcion2" );
        
        panel3.add( opcion1 );
        panel3.add( opcion2 );
        
        //añadir todo el panel 3
        contenedorPrincipal.add( panel3, BorderLayout.SOUTH );       
    } //cierre de constructor
    
    //clase main
    public static void main( String[] args ){
        ListaDeContactos ventana = new ListaDeContactos( );
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible( true );
    } //cierre main
    
} //cierre clase lista de contactos
