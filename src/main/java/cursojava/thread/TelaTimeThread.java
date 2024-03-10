package cursojava.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TelaTimeThread extends JDialog {

    private JPanel jpanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Email");
    private JTextField mostraTempo2 = new JTextField();
    private JButton jButton = new JButton("Gerar...");
    private JButton jButton2 = new JButton("Stop");

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    private Thread threadTime1;
    private Thread threadTime2;

    public TelaTimeThread() {
        setTitle("Minha tela de Time com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Controlador de posicionamento de componentes*/

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = gridBagConstraints.WEST;

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jpanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;

        jpanel.add(mostraTempo, gridBagConstraints);


        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jpanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;

        jpanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jpanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        jpanel.add(jButton2, gridBagConstraints);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fila == null) {
                    fila = new ImplementacaoFilaThread();
                    fila.start();
                }

                for (int i = 0; i <= 100; i++) {
                    ObjetoFilaThread filaThread = new ObjetoFilaThread();
                    filaThread.setNome(mostraTempo.getText());
                    filaThread.setEmail(mostraTempo2.getText() + " - " + i);

                    fila.add(filaThread);
                }
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fila.stop();
                fila = null;
            }
        });

        fila.start();
        add(jpanel, BorderLayout.WEST);
        setVisible(true);
    }
}
