import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FormMain extends JFrame {

  private JPanel formMain;
  private JRadioButton btnDesign;
  private JRadioButton btnSubnet;
  private JButton btnSubmit;
  private ButtonGroup groupChoice;
  private boolean choiceDesign = false;

  public FormMain(String title) {
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(formMain);
    this.pack();
    formMain.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
      }
    });
    btnDesign.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (!btnSubmit.isEnabled()) {
          btnSubmit.setEnabled(true);
        }
        choiceDesign = true;
      }
    });
    btnSubnet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (!btnSubmit.isEnabled()) {
          btnSubmit.setEnabled(true);
        }
        choiceDesign = false;
      }
    });
    btnSubmit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (choiceDesign) {
          // Call design prompts
          JFrame frame = new FormDesignPrompt("Network Designer");
          formMain.setEnabled(false);
          formMain.setVisible(false);
        } else {
          // Call Subnet prompts
          JFrame frame = new FormSubnetPrompt("Subnet Calculator");
        }
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new FormMain("Subnet Calculator");
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
