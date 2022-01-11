/*
 * Nama     : Fauzyah Hadirahma
 * NPM      : 20191310070
 * Materi   : Transformasi - Skala
 * Tanggal  : 6 Agustus 2021
 */
package grafika3;

/**
 *
 * @author Fauzyah
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setPaint(new Color(255, 227, 200));
        /*koordinat object - awal 0*/
        String s = "Skala ke-0";
        g2d.drawString(s, 15, 15);
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(238, 130, 238));
        s = "Skala ke-1";
        g2d.drawString(s, 100, 15);
        s = "Skala ke-2";
        g2d.drawString(s, 170, 15);
        
        AffineTransform txl = new AffineTransform();
        txl.translate(110, 22);
        txl.scale(0.5, 0.5); //posisi skala-1
        g2d.setTransform(txl);
        g2d.fillRect(0, 0, 80, 50);
        
        g2d.setPaint(new Color(255, 255, 255));
        AffineTransform tx2 = new AffineTransform();
        tx2.translate(170, 20);
        tx2.scale(1.5, 1.5); //posisi skala-2
        g2d.setTransform(tx2);
        g2d.fillRect(0, 0, 80, 50);
        
        g2d.dispose();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    
}