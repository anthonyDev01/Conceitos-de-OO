package cursojava.thread;

import javax.swing.*;
import java.awt.*;


public class TelaTimeThread extends JDialog {

    private JPanel jpanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
    private JLabel descricaoHora = new JLabel("Time thread");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaoHora2 = new JLabel("Time thread");
    private JTextField mostraTempo2 = new JTextField();
    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Start");
    public TelaTimeThread(){
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
        mostraTempo.setEditable(false);
        jpanel.add(mostraTempo, gridBagConstraints);


        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jpanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        mostraTempo2.setEditable(false);
        jpanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jpanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        jpanel.add(jButton2, gridBagConstraints);

        add(jpanel, BorderLayout.WEST);
        setVisible(true);
    }
}
