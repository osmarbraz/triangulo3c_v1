
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe da Janela da Aplicação.
 *
 * @author Osmar de Oliveira Braz Junior
 * @created 14 de Abril de 2007
 */
@SuppressWarnings("serial")
public class FrmTriangulo extends JFrame {

    private JPanel contentPane;

    public JTextField jTBase;
    private JLabel JLBase;
    public JTextField jTAltura;
    private JLabel jLAltura;
    public JLabel jLArea;
    public JButton jBCalcular;
    public JButton jBLimpar;
    public JButton jBFechar;

    /**
     * Construtor para o objeto FrmTriangulo.
     */
    public FrmTriangulo() {
        inicializar();
    }

    /**
     * Inicializa a janela e seus componentes. 
     */
    private void inicializar() {
        contentPane = (JPanel) this.getContentPane();

        JLBase = new JLabel();
        jTBase = new JTextField();
        jLAltura = new JLabel();
        jTAltura = new JTextField();
        jLArea = new JLabel();
        jBCalcular = new JButton();
        jBLimpar = new JButton();
        jBFechar = new JButton();

        contentPane.setLayout(null);
        this.setSize(new Dimension(209, 180));
        this.setTitle("Calculo Area Triangulo");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JLBase.setBounds(new Rectangle(11, 11, 41, 17));
        jTBase.setBounds(new Rectangle(11, 28, 63, 21));
        JLBase.setText("Base");

        jLAltura.setBounds(new Rectangle(11, 60, 41, 17));
        jTAltura.setBounds(new Rectangle(11, 75, 63, 21));
        jLAltura.setText("Altura");

        jLArea.setBounds(new Rectangle(11, 104, 94, 17));
        jLArea.setText("Area :");

        jBCalcular.setBounds(new Rectangle(111, 9, 90, 27));
        jBCalcular.setText("Calcular");

        jBLimpar.setBounds(new Rectangle(111, 39, 90, 27));
        jBLimpar.setText("Limpar");

        jBFechar.setBounds(new Rectangle(111, 69, 90, 27));
        jBFechar.setText("Fechar");

        contentPane.add(jTBase, null);
        contentPane.add(JLBase, null);
        contentPane.add(jTAltura, null);
        contentPane.add(jLAltura, null);
        contentPane.add(jLArea, null);

        contentPane.add(jBCalcular, null);
        contentPane.add(jBLimpar, null);
        contentPane.add(jBFechar, null);
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }

}
