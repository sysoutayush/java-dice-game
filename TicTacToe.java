import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class TicTacToe implements @ActionListener{
   
   Random random = new Random();
   JFrame frame =new JFrame();
   JPanel titel_panel=new JPanel();
   JPanel button_panel=new JPanel();
   JLabel textfield =new JLabel();
   JButton[] buttons=new JButton[9];
   boolean player1_turn;


    TicTacToe(){
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(800,800);
     frame.getContentPane().setBackground(new Color(50,50,50));
     frame.setVisible(true);

     textfield.setBackground(new Color(25,25,25));
     textfield.setForeground(new Color(25,255,0));
     textfield.setFont(new Font("Ink Free",Font.BOLD,75));
     textfield.setHorizontalAlignment(JLabel.CENTER);
     textfield.setText("Tic-Tac-Toe");
     textfield.setOpaque(true);

     titel_panel.setLayout(new BorderLayout());
     titel_panel.setBounds(0,0,800,100);

     button_panel.setLayout(new GridLayout(3,3));
     button_panel.setBackground(new Color(150,150,150));
     for(int i=0;i<9;i++){
         buttons[i]=new JButton();
         button_panel.add(buttons[i]);
         buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
         buttons[i].setFocusable(false);
         buttons[i].addActionListener((ActionListener) this);
     }


     titel_panel.add(textfield);

     frame.add(titel_panel,BorderLayout.NORTH);
     
     firstTurn();
    }


    public void actionPerformed(ActionEvent e){
      for(int i=0;i<9;i++){
          if(e.getSource()==buttons[i]){
              if(player1_turn){
                  if(buttons[i].getText()==""){
                      buttons[i].setForeground(new Color(255,0,0));
                      buttons[i].setText("X");
                      player1_turn=false;
                      textfield.setText("O turn");
                  }
              }
              else{
                if(buttons[i].getText()==""){
                    buttons[i].setForeground(new Color(0,0,255));
                    buttons[i].setText("O");
                    player1_turn=true;
                    textfield.setText("X turn");
              }
          }
      }
    }
    public void firstTurn() {
      if(random.nextInt(2)==0){
          player1_turn=true;
          textfield.setText("X turn");

      }
      else{
          player1_turn=false;
          textfield.setText("O Turn");
      }
    }
    public void check() {
        //check if x wins
        if(buttons[0].getText()=="X"&&
        buttons[1].getText()=="X"&&
        buttons[2].getText()=="X"  ){

    Xwins(0, 1, 2); }
    
    
    
    if(buttons[3].getText()=="X"&&
    buttons[4].getText()=="X"&&
    buttons[5].getText()=="X"  ){

    Xwins(3, 4, 5); }

    if(buttons[6].getText()=="X"&&
    buttons[7].getText()=="X"&&
    buttons[8].getText()=="X"  ){

    Xwins(6, 7, 8); }

    }
    public void Xwins(int a,int b,int c) {
      buttons[a].setBackground(Color.GREEN);
      buttons[b].setBackground(Color.GREEN);
      buttons[c].setBackground(Color.GREEN);
      for(int i=0;i<9;i++){
          buttons[i].setEnabled(false);
      }  
      textfield.setText("X wins");
    }
    public void Owins(int a,int b,int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }  
        textfield.setText("O wins");
      }   
    
}
}
