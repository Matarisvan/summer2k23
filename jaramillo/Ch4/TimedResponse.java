package jaramillo.Ch4;

import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse {
    public static void main(String[] args) {
        
        // creating variables
        LocalDateTime time1, time2;
        int sec1, sec2, diferencia;

        // giving variables data
        time1 = LocalDateTime.now();
        sec1 = time1.getSecond();
        JOptionPane.showConfirmDialog(null, "Deberias de robar? ");
        time2 = LocalDateTime.now();
        sec2 = time2.getSecond();

        // diferencia
        diferencia = sec2 - sec1;
        JOptionPane.showMessageDialog(null, "End seconds: " + sec2 + "\nStart seconds: " + sec1 + "\nIt took " + diferencia + " segundos para responder pendejo");



    }
    
}
