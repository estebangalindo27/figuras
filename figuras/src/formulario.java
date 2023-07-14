import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class formulario {

    private JPanel principal;
    private JTextField x1;
    private JButton circuloButton;
    private JTabbedPane tabbedPane1;
    private JButton trianguloButton;
    private JButton cuadradoButton;
    private JTextField peri;
    private JTextField area;
    private JTextField peric;
    private JTextField areac;
    private JTextField voluc;
    private JTextField volu;
    private JTextField x1c;
    private JTextField y1c;
    private JTextField x2c;
    private JTextField y2c;
    private JTextField y1;
    private JTextField x2;
    private JTextField y2;
    private JTextField x3;
    private JTextField y3;
    private JButton cubo;
    private JButton pira;
    private JButton esf;

    public formulario() {
    trianguloButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            triangulo tri = new triangulo(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()),Double.parseDouble(x2.getText()),Double.parseDouble(y2.getText()),Double.parseDouble(x3.getText()),Double.parseDouble(y3.getText()));
            peri.setText(valueOf(tri.perimetro()));
            area.setText(valueOf(tri.area()));
            volu.setVisible(false);
        }
    });
    cuadradoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cuadrado cua = new cuadrado(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()),Double.parseDouble(x2.getText()),Double.parseDouble(y2.getText()),Double.parseDouble(x3.getText()),Double.parseDouble(y3.getText()));
            peri.setText(valueOf(cua.perimetro()));
            area.setText(valueOf(cua.area()));
            volu.setVisible(false);
        }
    });
        cubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cubo cub = new cubo(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()),Double.parseDouble(x2.getText()),Double.parseDouble(y2.getText()),Double.parseDouble(x3.getText()),Double.parseDouble(y3.getText()));
                peri.setText(valueOf(cub.perimetro()));
                area.setText(valueOf(cub.area()));
                volu.setVisible(true);
                volu.setText(valueOf(cub.volumen()));
            }
        });
        pira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                piramide piram = new piramide(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()),Double.parseDouble(x2.getText()),Double.parseDouble(y2.getText()),Double.parseDouble(x3.getText()),Double.parseDouble(y3.getText()));
                peri.setText(valueOf(piram.perimetro()));
                area.setText(valueOf(piram.area()));
                volu.setVisible(true);
                volu.setText(valueOf(piram.volumen()));
            }
        });
        circuloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circulo cir = new circulo(Double.parseDouble(x1c.getText()),Double.parseDouble(y1c.getText()),Double.parseDouble(x2c.getText()),Double.parseDouble(y2c.getText()));
                peric.setText(valueOf(cir.perimetro()));
                areac.setText(valueOf(cir.area()));
                voluc.setVisible(false);
            }
        });
        esf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                esfera esf = new esfera(Double.parseDouble(x1c.getText()),Double.parseDouble(y1c.getText()),Double.parseDouble(x2c.getText()),Double.parseDouble(y2c.getText()));
                peric.setText(valueOf(esf.perimetro()));
                areac.setText(valueOf(esf.area()));
                voluc.setVisible(true);
                voluc.setText(valueOf(esf.volumen()));
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("formulario");
        frame.setContentPane(new formulario().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
