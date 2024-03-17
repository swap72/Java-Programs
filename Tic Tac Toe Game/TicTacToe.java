
package Project7;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TicTacToe implements ActionListener{
    
    Random random=new Random();
    JFrame frame=new JFrame();
    JPanel text_panel=new JPanel();
    JPanel title_panel=new JPanel();
    JPanel button_panel=new JPanel();
    JPanel text_button=new JPanel();
    JLabel textfield=new JLabel();
    JButton[] button=new JButton[9];
    
    boolean player1_turn;
    
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.getContentPane().setBackground(Color.pink);
        frame.setVisible(true);
        
        textfield.setForeground(new Color(254,121,100));
        textfield.setBackground(new Color(253,189,176));
        textfield.setFont(new Font("Ink Free",Font.BOLD,50));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        
        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(253,189,176));
        
        for(int i=0;i<9;i++){
            button[i]=new JButton();
            button_panel.add(button[i]);
            button[i].setFont(new Font("Verdana",Font.PLAIN,90));
            button[i].setFocusable(false);
            button[i].addActionListener(this);
            
            
        }
        
        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);
        
        firstTurn();
                

        
            
                                
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0;i<9;i++){
            if(e.getSource()==button[i]){
                if(player1_turn){
                    if(button[i].getText()==""){
                        button[i].setForeground(new Color(22,44,88));
                        button[i].setText("O");
                        player1_turn=false;
                        textfield.setText("O's Turn");
                        check();
                    }
                }
                else{
                    if(button[i].getText()==""){
                        button[i].setForeground(new Color(88,44,22));
                        button[i].setText("X");
                        player1_turn=true;
                        textfield.setText("X's Turn");
                        check();
                    }
                    
                }
            }
        }
    }
    
    public void firstTurn(){
        
        try {
            Thread.sleep(2000, 500);
        } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(random.nextInt(2)==0){
        player1_turn=true;
        textfield.setText("O's Turn");
        }
        else{
        player1_turn=false;
        textfield.setText("X's Turn");        
        }
  
    }
    
    
    
    public void check(){
        if(
                (button[0].getText()=="X") &&
                (button[1].getText()=="X") &&
                (button[2].getText()=="X") 
                ){
            xWins(0,1,2);
        }
        if(
                (button[3].getText()=="X") &&
                (button[4].getText()=="X") &&
                (button[5].getText()=="X") 
                ){
            xWins(3,4,5);
        }
        if(
                (button[6].getText()=="X") &&
                (button[7].getText()=="X") &&
                (button[8].getText()=="X") 
                ){
            xWins(6,7,8);
        }
        if(
                (button[0].getText()=="X") &&
                (button[3].getText()=="X") &&
                (button[6].getText()=="X") 
                ){
            xWins(0,3,6);
        }
        if(
                (button[1].getText()=="X") &&
                (button[4].getText()=="X") &&
                (button[7].getText()=="X") 
                ){
            xWins(1,4,7);
        }
        if(
                (button[2].getText()=="X") &&
                (button[5].getText()=="X") &&
                (button[8].getText()=="X") 
                ){
            xWins(2,5,8);
        }
        if(
                (button[0].getText()=="X") &&
                (button[4].getText()=="X") &&
                (button[8].getText()=="X") 
                ){
            xWins(0,4,8);
        }
        if(
                (button[2].getText()=="X") &&
                (button[4].getText()=="X") &&
                (button[6].getText()=="X") 
                ){
            xWins(2,4,6);
        }
        if(
                (button[0].getText()=="O") &&
                (button[1].getText()=="O") &&
                (button[2].getText()=="O") 
                ){
            oWins(0,1,2);
        }
        if(
                (button[3].getText()=="O") &&
                (button[4].getText()=="O") &&
                (button[5].getText()=="O") 
                ){
            oWins(3,4,5);
        }
        if(
                (button[6].getText()=="O") &&
                (button[7].getText()=="O") &&
                (button[8].getText()=="O") 
                ){
            oWins(6,7,8);
        }
        if(
                (button[0].getText()=="O") &&
                (button[3].getText()=="O") &&
                (button[6].getText()=="O") 
                ){
            oWins(0,3,6);
        }
        if(
                (button[1].getText()=="O") &&
                (button[4].getText()=="O") &&
                (button[7].getText()=="O") 
                ){
            oWins(1,4,7);
        }
        if(
                (button[2].getText()=="O") &&
                (button[5].getText()=="O") &&
                (button[8].getText()=="O") 
                ){
            oWins(2,5,8);
        }
        if(
                (button[0].getText()=="O") &&
                (button[4].getText()=="O") &&
                (button[8].getText()=="O") 
                ){
            oWins(0,4,8);
        }
        if(
                (button[2].getText()=="O") &&
                (button[4].getText()=="O") &&
                (button[6].getText()=="O") 
                ){
            oWins(2,4,6);
        }
    }
    public void oWins(int a, int b, int c){
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);
        
        for(int i=0;i<9;i++){
            button[i].setEnabled(false);
        }
        textfield.setText("O Wins");
    }
    public void xWins(int a, int b, int c){
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);
        
        for(int i=0;i<9;i++){
            button[i].setEnabled(false);
        }
        textfield.setText("X Wins");
    }

    
}
