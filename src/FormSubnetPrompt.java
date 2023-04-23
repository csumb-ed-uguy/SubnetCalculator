import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormSubnetPrompt extends JFrame {
  private JPanel formSubnetPrompt;

  FormSubnetPrompt(String title){
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(formSubnetPrompt);
    this.pack();
    this.pack();
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
