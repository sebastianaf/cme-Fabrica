package fabrica;

import java.util.Date;

//Este es un nuevo comentario
public class Fabrica {

    private String nombre; //Este es el nombre de la fábrica
    private int numeroDeTrabajadores; //Son los trabajadores contratados
    private Date fechaDeFundacion;// La fecha en que se fundó la fábrica
    private String especialidad;// Es en lo que mejor se desempeña la fábrica
    private Boolean internacional;// Denota si la fábrica hace exportaciones o no 

    //atributos de composición
    private Persona propietario = null;
    private Maquina maquinaMagica;

    //Este es el constructor de clase
    public Fabrica(
            String nombre,
            int numeroDeTrabajadores,
            Date fechaDeFundacion,
            String especialidad,
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.internacional = internacional;
        this.maquinaMagica = new Maquina(1000,"Wonka");
    }

    public Maquina getMaquinaMagica(){
        return this.maquinaMagica;
    }
    
    public Persona getPropietario(){
        return this.propietario;
    }

    public void setPropietario(Persona p){
        this.propietario = p;
    }

    /**
     * El método aumenta la cantidad de trabajadores de la fábrica en 100 y la
     * conviente en internacional
     */
    public void ampliarPlanta() {
        this.numeroDeTrabajadores += 100;
        this.internacional = true;
    }

    /**
     * Este método permite cambiar el nombre de la fábrica y su especialidad
     */
    public void reinaguracion(
            String nuevoNombre,
            String nuevaEspecialidad) {
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.numeroDeTrabajadores += 1;
    }

    //A partir de esta línea se encuentran los métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }

    public static void main(String[] args) {
        
        Fabrica fabricaDeMaderas = new Fabrica(
                "MaderasPlus", 
                15, 
                new Date(), 
                "Enchapados", 
                true);
        
        
        
        SuperHeroe ironMan = new SuperHeroe(
                "Tony",
                "Stark",
                "Programación",
                false);
       
        
        
        
        fabricaDeMaderas.setPropietario(ironMan);
        
        System.out.println("Nombre del propietario");
        System.out.println(fabricaDeMaderas.getPropietario().getNombre());
        
        
        System.out.println(fabricaDeMaderas.getMaquinaMagica().getMarca());
    }
        
}
