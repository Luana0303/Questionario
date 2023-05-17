package br.sc.senac.perfil.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class PerfilView extends JFrame{
    private JPanel pnlPerfil;
    private JTextField txtnome;
    private JTextField txtnascimento;
    private JTextField txtcurso;
    private JButton btnenviar;
    private JTextField txtfase;
    private JLabel lblnome;
    private JLabel lblnascimento;
    private JLabel lblcurso;
    private JLabel lblfase;
    public LoginView() {
        initComponents();
        listeners();
    }
    public void initComponents(){


        setTitle("Tela de login");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlPerfil);
        setVisible(true);
    }
    public void listeners(){

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnome.setText(" ");
                txtcurso.setText(" ");
                txtnascimento.setText(" ");
                txtfase.setText(" ");

                try{
                    LoginController lc = new LoginController();
                    ArrayList<Login> loginList = lc.buscarLoginSenha();

                    for (Login l: loginList){
                        if (l.getLogin().equalsIgnoreCase(login) &&
                                l.getSenha().equalsIgnoreCase(new String(senha))) {
                            System.out.println("Login validado");

                            SystemView s = new SystemView();

                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Verifique usuário e senha",
                                    "Erro",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException ex){
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex){
                    System.out.println("Classe não encontrada");
                }

            }
        });
    }
    public static void main(String[] args) {
        LoginView lv = new LoginView();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}







