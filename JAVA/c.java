
import javax.swing.JOptionPane;

public class c {
    public static void main(String[] args) {

        boolean done = true;
        while (done) { 
            String strnum = JOptionPane.showInputDialog("Enter integer number : ");
            int num = Integer.parseInt(strnum);
            
            if (num >= 0){
                JOptionPane.showMessageDialog(null, "Your number is " + strnum, "ANSWER", JOptionPane.INFORMATION_MESSAGE);
            }else if (num == 0){
                JOptionPane.showMessageDialog(null, "Your number is " + strnum,"ANSWER",JOptionPane.INFORMATION_MESSAGE);          
            }else{
                JOptionPane.showMessageDialog(null, "Your number is " + strnum,"ANSWER",JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, "HAPPY NEW YEAR","1 January 2025",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, " Hi ", "Say", JOptionPane.INFORMATION_MESSAGE);
                done = false;
            }
            System.exit(0);    
        }
    }
}