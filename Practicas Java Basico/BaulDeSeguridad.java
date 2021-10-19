
/**
 * Write a description of class BaulDeSeguridad here.
 * 
 * @author (Ivan) 
 * @version (1.0)
 */
public class BaulDeSeguridad
{
    private int claveBaul;
    private boolean baulAbierto;
    
    public BaulDeSeguridad(){
        claveBaul = 1111;
        baulAbierto = false;
    }
    
    //Metodo Auxiliar para saber si un numero tiene 4 digitos
    private boolean tiene4Digitos(int numero){
        int auxNumero = numero/1000; 
        if(auxNumero >= 1 && auxNumero <=9){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String cambiarClave(int nuevaClave){        
        if(baulAbierto == true){
            if(tiene4Digitos(nuevaClave)){
                claveBaul = nuevaClave;
                return "Se ha cambiado la clave";
            }else{
                return "No ha sido posible cambiar la clave";
            }
        }
        else{
            return "Debe abrir el Baul para cambiar la clave";
        }
        
    }
    
    
    public String abrirBaul(int clave ){
        if(baulAbierto == false){
            if(clave == claveBaul){
                baulAbierto = true;
                return "Se ha abierto el Baul";            
            }
            else{
                return "La clave ingresada es INCORRECTA";
            }           
        }
        else{
            return "El baul ya esta ABIERTO";
        }
    }
    
    public String cerrarBaul(){
        if(baulAbierto == true){
                baulAbierto = false;
                return "Se ha cerrado el Baul";                   
        }
        else{
            return "El baul ya esta CERRADO";
        }
    }
    
    
    
    
    
    
}
