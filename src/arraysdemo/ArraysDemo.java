
package arraysdemo;

import java.util.Scanner;


/**
 *
 * @author gaksh
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        for(int i=0; i < myLetters.length;i++){
            myLetters[i] = myWord.charAt(i);}
        
        for(int i = myLetters.length - 1;i>=0 ; i--){
            System.out.println(myLetters[i]);
        };
        
        
        
     
        
    }    
        
}
    

