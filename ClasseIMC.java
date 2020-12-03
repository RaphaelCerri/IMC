import javax.swing.JOptionPane;
public class ClasseIMC {
    
    public Float altura;
    public Float peso;
    private final Float total;
    private Float alt;
    private Float pes;
    ClasseIMC(Float pes, Float alt) {
        this.peso = pes;
        this.altura = alt;
        total = pes / (alt * alt);
    }
    public void calcImc(){
        JOptionPane.showMessageDialog(null, "o seu IMC é de: " + total + " Kg/m²");
    }
    public void getComentario(){
        if (total < 18.5){
                JOptionPane.showMessageDialog(null, "Considerando os critérios da Organização Mundial da Saúde,"
                    + "\n a pessoa está magra.");
        }
        else if (total >= 18.5 && total <= 25.0){
                JOptionPane.showMessageDialog(null, "Considerando os critérios da Organização Mundial da Saúde,"
                    + "\n a pessoa está no peso normal.");
        }
        else if (total > 25.0 && total < 30.0){
                JOptionPane.showMessageDialog(null, "Considerando os critérios da Organização Mundial da Saúde,"
                    + "\n a pessoa está acima do peso.");
        }
        else{
                JOptionPane.showMessageDialog(null, "Considerando os critérios da Organização Mundial da Saúde,"
                    + "\n a pessoa está obesa.");
        }
    }
}
/*ALT+ SHIT + F*/
