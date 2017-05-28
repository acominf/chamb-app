package elementos;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import paneles.ContenidoJFrame;
import paneles.ContenidoPanel;

/**
 * Clase encargada de manipulaciones entre JFrames y JPanels
 */
public class Utilerias {

    /**
     * Metodo cuya funcion es asignar el JFrame actual al componente creado,
     * lo asigna a otro JFrame y lo hace visible, oculta el original
     * @param jframe
     * @param componente
     */
    public static void muestraComponente(ContenidoJFrame jframe, ContenidoPanel componente) {
        ContenidoJFrame f;
        f = new ContenidoJFrame(jframe.getTitulo());
        f.getContentPane().add(componente);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        jframe.setVisible(false);
    }
    
    /**
     * Metodo que se encarga de hacer visible al JFrame predecesor
     * @param actual
     */
    public static void cambiaComponentePadre(ContenidoPanel actual) {         
        actual.getVentana().setVisible(true);
        actual.getPadre().setVisible(false);
    }
}
