import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {        
        Perro dog1 = new Perro("Miguel", "Sentado", 25, true);
        Perro dog2= new Perro("Gaia", "Sentado", 26, false);
        System.out.println(dog1.getEdad());
        System.out.println(dog2.getNombre());
        //JOptionPane.showMessageDialog(null, "El nombre del perro es "+dog2.getNombre(), "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(Perro.contadorPerros);
        Perro.oler();
        
    }
}
