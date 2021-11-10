import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random; 

public class GuessingGame implements ActionListener{
JTextField UserGuess;
JButton Guess,PlayAgain;
JLabel EnterGuess,TooHigh,LastGuess;
Random r = new Random();
int randomNum= r.nextInt(100)+1;

GuessingGame(){
  

JFrame frame=new JFrame("Guessing Game");
  frame.setLayout(new FlowLayout());
  frame.setSize(240,120);

  UserGuess= new JTextField(10);
  UserGuess.setActionCommand("myTF");

  JButton Guess =new JButton("Guess");
  JButton PlayAgain =new JButton("PlayAgain");
  Guess.addActionListener(this);
  PlayAgain.addActionListener(this);
  EnterGuess= new JLabel("Enter your guess: ");
  TooHigh=new JLabel("");
  LastGuess= new JLabel("");
  frame.add(EnterGuess);frame.add(UserGuess);frame.add(Guess);frame.add(TooHigh);frame.add(LastGuess);frame.add(PlayAgain);
  frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae){

int guess = Integer.parseInt(UserGuess.getText());

  if (randomNum<guess){
 TooHigh.setText("Too high!");}

else if (randomNum>guess){
  TooHigh.setText("Too low!");}

 else if (randomNum==guess) {
  TooHigh.setText("You got it!");}
  LastGuess.setText("Last guess was "+guess);

if (ae.getActionCommand().equals("PlayAgain")){
int randomNum= r.nextInt(100)+1;
TooHigh.setText("");
LastGuess.setText("");
UserGuess.setText("");}
}
}








