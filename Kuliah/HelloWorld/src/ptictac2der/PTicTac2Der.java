/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptictac2der;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// @author ASUS
public class PTicTac2Der implements ActionListener{
    private int[][] winCombinations = new int[][]{{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
    private JFrame window = new JFrame("Catur Jawa");
    private JButton buttons[] = new JButton[9];
    private int count = 0;
    private String letter = "";
    private boolean win = false;
    private static int startCount = 0;
    JMenuBar menu = new JMenuBar();
    JMenuItem newGame = new JMenuItem("New Game"), instr = new JMenuItem("Instructions"), exit = new JMenuItem("Exit"), name = new JMenuItem("Change Name");
    static String x = "X";
    static String y = "Y";
    
    public PTicTac2Der(){ // bangun windows
        window.setSize(270, 270);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3, 3));
        for (int i = 0; i <= 8; i++){
            buttons[i] = new JButton();
            window.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        
        menu.add(newGame);
        menu.add(name);
        menu.add(instr);
        menu.add(exit);
        
        name.addActionListener(this);
        newGame.addActionListener(this);
        exit.addActionListener(this);
        instr.addActionListener(this);
        window.setJMenuBar(menu);
        window.setVisible(true);
    }
    
    public void setName(){
        x = JOptionPane.showInputDialog(null, "Masukkan nama pemain X : ", "", 1);
        y = JOptionPane.showInputDialog(null, "Masukkan nama pemain O : ", "", 1);
        if(x == null){
            x = "X";
        }
        if(y == null){
            y = "Y";
        }
        if(x.length() == 0){
            x = "X";
        }
        if(y.length() == 0){
            y = "Y";
        }
        JOptionPane.showMessageDialog(null, "Nama anda telah terganti, jika ingin mengganti nama terdapat pada menu bar", "Nama terubah!!!!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void actionPerformed(ActionEvent a){
        Object source = a.getSource();
        if (source == newGame){
            int answer = JOptionPane.showConfirmDialog(null, "Game anda tidak tersimpan, lanjutkan ????", "Apakah ingin mulai permainan baru?", JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.YES_OPTION){
                this.clearIt();
            }
        }
        else if(source == name){
            this.setName();
        }
        else if(source == instr){
            JOptionPane.showMessageDialog(null, "Anda akan menang jika terbentuk 3 (X) atau (O) secara vertikal, horizontal, ataupun diagonal", "Instruction", JOptionPane.INFORMATION_MESSAGE);
        }
            else if(source == exit){
                    int answer = JOptionPane.showConfirmDialog(null, "EXIT", "Anda yakin akan keluar??", JOptionPane.YES_NO_OPTION);
                    if (answer == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Thank you "  + x + " and " + y + " for playing");
                        System.exit(0);
                    }
                    else{
                        count++;

                        if(count % 2 == 0){
                            letter = "O";
                        }
                        else{
                            letter = "X";
                        }
                        
                        JButton pressedButton = (JButton) source;
                        pressedButton.setText(letter);
                        pressedButton.setEnabled(false);
                        
                        for(int i = 0; i <= 7; i++){
                            if(buttons[winCombinations[i][0]].getText().equals(buttons[winCombinations[i][1]].getText()) && buttons[winCombinations[i][1]].getText().equals(buttons[winCombinations[i][2]].getText()) && buttons[winCombinations[i][0]].getText() != ""){
                                win = true;        
                            }
                        }
                        
                        if(win == true){
                            if(letter.equals("X")){
                                letter = x;
                            }
                            else{
                                letter = y;
                            }
                            JOptionPane.showMessageDialog(null, letter + " wins the game!");
                            int jawab = JOptionPane.showConfirmDialog(null, "Start", "Mulai permainan baru?", JOptionPane.YES_NO_OPTION);
                            if(jawab == JOptionPane.YES_OPTION){
                                this.clearIt();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Thank you " + x + " and " + y +  " for playing");
                                System.exit(0);
                            }
                        }
                        else if(count == 9 && win == false){
                            JOptionPane.showMessageDialog(null, "The game was tie");
                            int anwer = JOptionPane.showConfirmDialog(null, "Start", "Mulai permainan baru?", JOptionPane.YES_NO_OPTION);
                            if(anwer == JOptionPane.YES_OPTION){
                                this.clearIt();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Thank you " + x + " and " + y +  " for playing");
                                System.exit(0);
                            }
                        }
                        
                        
                    }
                    }   
    }
    
    public void clearIt(){    
        window.setVisible(false);
        this.startIt();
    }
    
    public void startIt(){
        new PTicTac2Der();
    }
    
    public static void main(String[] args) {
        PTicTac2Der starter = new PTicTac2Der();
        starter.setName();
    }
    
}
