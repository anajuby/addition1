/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addition;

/**
 *
 * @author anaju
 */
import javax.swing.JOptionPane;
public class Addition {

    public static void main(String[] args) {
        //obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane
          String firstNumber =
               JOptionPane.showInputDialog("Enter fist integer");
            String  secondNumber =
              JOptionPane.showInputDialog("Enter second integer");
              //converte String em valores int para utilização em um cálculo
               int number1 = Integer. parseInt (firstNumber);
               int number2 = Integer. parseInt(secondNumber);
               
               int sum = number1 + number2;  //soma os numeros
        
               //exibe o resultado em um diálogo de mensagem jOptionPane 
                JOptionPane.showMessageDialog(null,"the sum is" + sum,"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE  );
                       
    }
}
