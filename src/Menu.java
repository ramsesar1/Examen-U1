import javax.swing.*;
import java.awt.*;

public class Menu extends  JFrame{
    public Menu(){
        this.setVisible(true);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Registro");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.getContentPane().setBackground(new Color(102, 255, 204));


        JMenuBar menuBar = new JMenuBar();
        JMenu cuenta = new JMenu("Cuenta");
        JMenu usuarios = new JMenu("Usuarios");
        JMenu ayuda = new JMenu("Ayuda");
        menuBar.add(cuenta);
        menuBar.add(usuarios);
        menuBar.add(ayuda);

        JMenuItem micuenta = new JMenuItem("Mi cuenta");
        JMenuItem cerrasesi = new JMenuItem("Cerrar sesión");
        cuenta.add(cerrasesi);
        cuenta.add(micuenta);

        JMenuItem listausu = new JMenuItem("Lista de usuarios");
        JMenuItem crearusu = new JMenuItem("Crear Usuario");
        usuarios.add(listausu);
        usuarios.add(crearusu);

        JMenuItem comocrear = new JMenuItem("¿Como crear usuarios?");
        ayuda.add(comocrear);




        JPanel panel = new JPanel();
        panel.setSize(370, 350);
        //   panel.setBackground(new Color(118,208,154));
        panel.setBackground(new Color(102, 255, 204));

        panel.setLocation(30, 20);
        panel.setLayout(new BorderLayout());
        panel.add(menuBar,BorderLayout.NORTH);
        this.add(panel);



    }





}
