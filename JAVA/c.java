
import javax.swing.JOptionPane;

public class c {
    public static void main(String[] args) {
        System.out.println("hello World");
        String strnum = JOptionPane.showInputDialog("Enter integer number : ");
        int num = Integer.parseInt(strnum);
        
        if (num >= 0){
            JOptionPane.showMessageDialog(null, "Your number is " + strnum, "ANSWER", JOptionPane.PLAIN_MESSAGE);
        }else if (num == 0){
            System.out.println(num + "is zero");            
        }else{
            System.out.println(num + "less than zero");
        }


    }
}