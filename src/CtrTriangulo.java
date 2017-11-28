
import java.awt.event.ActionEvent;

/**
 * Description of the Class
 *
 * @author Osmar de Oliveira Braz Junior
 * @version 1.0
 * @updated 20-ago-2009 19:50:17
 */
public class CtrTriangulo {

    private FrmTriangulo frmTriangulo;

    /**
     * Constructor for the CtrTriangulo object
     */
    public CtrTriangulo() {
        // Instancia a janela
        setFrmTriangulo(new FrmTriangulo());

        // Associa os eventos aos componentes
        getFrmTriangulo().jBCalcular
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBCalcular_actionPerformed(e);
                    }
                });

        getFrmTriangulo().jBLimpar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBLimpar_actionPerformed(e);
                    }
                });

        getFrmTriangulo().jBFechar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBFechar_actionPerformed(e);
                    }
                });
    }

    /**
     * Description of the Method
     */
    public void executar() {
        getFrmTriangulo().setVisible(true);
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBCalcular_actionPerformed(ActionEvent e) {

        // Instancia o objeto triangulo
        EntTriangulo triangulo = new EntTriangulo();
        triangulo.setBase(Double.parseDouble(frmTriangulo.jTBase.getText()));
        triangulo
                .setAltura(Double.parseDouble(frmTriangulo.jTAltura.getText()));
        getFrmTriangulo().jLArea.setText("Area :" + triangulo.getArea());
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBLimpar_actionPerformed(ActionEvent e) {
        getFrmTriangulo().jTBase.setText("");
        getFrmTriangulo().jTAltura.setText("");
    }

    /**
     * Description of the Method
     *
     * @param e Description of the Parameter
     */
    void jBFechar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Gets the frmTriangulo attribute of the CtrTriangulo object
     *
     * @return The frmTriangulo value
     */
    public FrmTriangulo getFrmTriangulo() {
        return frmTriangulo;
    }

    /**
     * Sets the frmTriangulo attribute of the CtrTriangulo object
     *
     * @param frmTriangulo The new frmTriangulo value
     */
    public void setFrmTriangulo(FrmTriangulo frmTriangulo) {
        this.frmTriangulo = frmTriangulo;
    }
}
