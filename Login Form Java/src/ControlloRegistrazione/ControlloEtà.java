
package ControlloRegistrazione;
import javax.swing.JLabel;

public class ControlloEtà {
    private boolean cont = false;
    private int i = 0;
    public void CE(String n, JLabel Le) {
        if(n.equals("")) {
            Le.setVisible(true);
            Le.setText("Inserire Età");
        } else {
           try {
                i = Integer.valueOf(n);
                Le.setVisible(false); 
                cont = true;
            } catch (Exception exc) {
                 Le.setVisible(true);
                 Le.setText("Inserire Età");
            }
        
        }
    }
    
    public boolean e() {
        return cont;
    }
}
