import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FormMain extends JFrame {

  private JPanel panelMain;
  private JRadioButton btnDesign;
  private JRadioButton btnSubnet;
  private JButton btnSubmit;
  private ButtonGroup butGChoice;

  public FormMain(String title) {
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(panelMain);
    this.pack();
  }

  public static void main(String[] args) {
    JFrame frame = new FormMain("Subnet Calculator");
    frame.setVisible(true);
  }
}
