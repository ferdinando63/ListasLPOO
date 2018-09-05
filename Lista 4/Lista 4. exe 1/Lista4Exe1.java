package lista.pkg4.exe.pkg1;

import javax.swing.JOptionPane;

public class Lista4Exe1 {

    public static void main(String[] args) {
        
        CartaoWeb cw[] = new CartaoWeb[3];
        
        String st[] = new String[3];
        st[0] = JOptionPane.showInputDialog("Para: ");
        st[1] = JOptionPane.showInputDialog("De: ");
        
        cw[0] = new Natal(st[0]);
        cw[1] = new Aniversario(st[0]);
        cw[2] = new DiaDosNamorados(st[0]);
        
        for(int i = 0; i < cw.length; i++){
           JOptionPane.showMessageDialog(null, cw[i].retornaMensagem(st[1]));
        }
        
    }
    
}
