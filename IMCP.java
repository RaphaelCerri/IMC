
import javax.swing.JOptionPane;

public class IMCP {
    public static void main(String[] args) {
        Float pes = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite seu peso", "Peso",
                        JOptionPane.INFORMATION_MESSAGE));

        Float alt = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Digite sua altura", "Altura",
                        JOptionPane.INFORMATION_MESSAGE));
        
        JOptionPane.showMessageDialog(null, "OBS. O IMC é calculado com a fórmula peso/altura² "
                + "(o resultado ficará em Kg/m² para dados fornecidos em Kg e m).", "IMC",
                JOptionPane.INFORMATION_MESSAGE);
        
        ClasseIMC objClasseIMC = new ClasseIMC(pes, alt);
        
        objClasseIMC.calcImc();
        objClasseIMC.getComentario();

    }
}
