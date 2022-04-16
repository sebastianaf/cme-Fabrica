
package fabrica;

import java.util.Date;



public class FabricaTextil extends Fabrica {
    private int cantidadDeTelaDisponible;
    private Boolean exportacion;
    private String especialidad;

    public FabricaTextil(String nombre, int numeroDeTrabajadores, Date fechaDeFundacion, String especialidad, Boolean internacional) {
        super(nombre, numeroDeTrabajadores, fechaDeFundacion, especialidad, internacional);
    }
    
    
        
}
