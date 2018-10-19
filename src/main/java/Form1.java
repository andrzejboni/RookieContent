import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class  Form1 {
    private JPanel panelGlowny;
    private JButton przyciskOK;
    private JLabel opisPrzycisku;
    private JTextField iloscPrzejechanychKM;
    private JTextField iloscSpalonejBenzyny;
    private JTextField cenaPaliwaZaLitr;
    private JTextField kosztPrzejechania100KM;
    private JTextField Spalanie;
    private static JFrame glownyFrame;


    public Form1() {
        przyciskOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                List<Double> lista = new ArrayList<Double>();

//                while (true) {

                    String tekstZPola = iloscPrzejechanychKM.getText();
                    String tekstZPola2 = iloscSpalonejBenzyny.getText();
//                    String tekstZPola3 = cenaPaliwaZaLitr.getText();


                    double liczba = Double.parseDouble(tekstZPola);
                    double liczba2 = Double.parseDouble(tekstZPola2);
//                    double liczba3 = Double.parseDouble(tekstZPola3);


//                    lista.add(liczba);
//                    lista.add(liczba2);
//                    lista.add(liczba3);

                    double spalanie = ((100 * liczba2) / liczba);

//                JOptionPane.showMessageDialog(null, "Hello World, Wpisałeś do programu slowo:" + (liczba+liczba2));

                    Spalanie.setText(String.valueOf((spalanie)));
                    kosztPrzejechania100KM.setText(String.valueOf((spalanie * 5.12)));

                    glownyFrame.setTitle("Tytuł po kliknieciu przycisku sie zmienił! ");
//                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Apka");
        frame.setContentPane(new Form1().panelGlowny);
        glownyFrame = frame;
        frame.setContentPane(new Form1().panelGlowny);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }



}
