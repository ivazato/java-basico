public class Tren{
    private String nombre;
    private int nroVagones;
    private int anio;
    
    public Tren(String nombre, int nroVagones, int anio)
    {
        this.nombre = nombre;
        this.nroVagones = nroVagones;
        this.anio = anio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumeroVagones(){
        return nroVagones;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNroVagones(int nroVagones){
        this.nroVagones = nroVagones;
    }
}