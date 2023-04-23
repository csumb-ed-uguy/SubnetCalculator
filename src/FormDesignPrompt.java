import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;

public class FormDesignPrompt extends JFrame{
  private JPanel formDesignPrompt;
  private JTextField txtNets;
  private JLabel lblNets;
  private JTextField txtIP;
  private JLabel lblNodes;
  private JTextField txtNodes;
  private JTextField txtConnections;
  private JLabel lblConnections;
  private JComboBox comboBox1;
  private JTree treeNetworks;
  private JButton previousButton;
  private JButton calculateButton;
  private static FormMain formMainReference;

  FormDesignPrompt(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(formDesignPrompt);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    //treeNetworks
  }

}
