
/**
 * Write a description of class SilvanoCornio here.
 * 
 * @author (Ivan) 
 * @version (1.0)
 */
public class SilvanoCornio
{
    private int capacidadSavia;
    private int capacidadReflejoDeLagrimas;
    private boolean maqEncendida;
    
    public SilvanoCornio(){
        capacidadSavia = 0;
        capacidadReflejoDeLagrimas = 0;
        maqEncendida = false;
    }

    public void recolectarSavia(int unidadesDeSavia){ //Probar con get y set
        int antiguaCapacidadSavia = getCapacidadSavia();//capacidadSavia;
        int nuevaCapacidadSavia = getCapacidadSavia() + unidadesDeSavia;
        if(nuevaCapacidadSavia <= 90){
            setCapacidadSavia(nuevaCapacidadSavia);
            //capacidadSavia = nuevaCapacidadSavia;
        }
        else{
            capacidadSavia = antiguaCapacidadSavia;
            System.out.println("Se ha escedido la capacidad  ");
        }
    }
    
    public void crearReflejoDeLagrima(){
        int antiguaCapacidadReflejoDeLagrimas = capacidadReflejoDeLagrimas;
        //int nuevaCapacidadReflejoDeLagrimas;        
        if(maqEncendida == true){
            if(capacidadSavia >= 50){
                if(capacidadReflejoDeLagrimas < 21){
                    capacidadReflejoDeLagrimas = capacidadReflejoDeLagrimas + 1;
                    capacidadSavia = capacidadSavia - 50;
                }
                else{
                    System.out.println("La capacidad ha llegado a su limite");
                    capacidadReflejoDeLagrimas = antiguaCapacidadReflejoDeLagrimas;
                }
            }
            else{
                System.out.println("No hay Savia suficiente");
            }
        }
        else{
            System.out.println("Debe Encender la Maquina");
        }
    }
    
    public String retirarReflejoDeLagrima(){ // Retirar componentes
        if(maqEncendida == true)
            if(capacidadReflejoDeLagrimas >=1){
                return "Se ha retirado " + capacidadReflejoDeLagrimas + " unidades de Reflejo de Lagrimas";
            }
            else{
                return "No hay unuidades de Reflejo de Lagrimas";
            }
        else{
            return "La maquina esta Apagada";
        }
    }
    
    /*
     * GET
     */
    private int getCapacidadSavia(){
        return capacidadSavia;
    }
    
    private boolean getMaquinaEncendida(){
        return maqEncendida;
    }
    
    /*
     * SET
     */
    private void setCapacidadSavia(int nuevaCapacidadSavia){
        capacidadSavia = nuevaCapacidadSavia;
    }
    
    public void encenderMaquina(){
        if(maqEncendida == false){
            maqEncendida = true;  
        }
        else{
            System.out.println("La Maquina ya esta Escendida");
        }        
    }
    
    public void apagarMaquina(){
        if(maqEncendida == true){
            maqEncendida = false;
        }
        else{
            System.out.println("La Maquina ya esta Apagada");
        }
    }
}
