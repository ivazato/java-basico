
/**
 * Write a description of class UnicornioTron here.
 * 
 * @author Ivan
 * @version 1.0
 */
public class UnicornioTron{
    private boolean premioCantidadFija;
    private int intentos;
    private int numeroSecreto;

    public UnicornioTron(){
        premioCantidadFija = true;
        intentos = 0; //Inicialmente la maquina no esta habilitada para jugar
        numeroSecreto = (int)(Math.random() * 10);
        
    }
    
    public boolean consultarCantidadFija(){ // El monto del premio
        return premioCantidadFija;
    }
    
    public void insertarFichas(int numeroFichas){
        if(intentos == 0) // No hay fichas en la maquina
            intentos = numeroFichas;
        else
            intentos = intentos + numeroFichas;
    }
    
    public int getIntentos(){
        return intentos;
    }
    
    public String jugar(int numeroDeLaSuerte){
        
        if(premioCantidadFija){
            if(intentos > 0){
                if(numeroSecreto == numeroDeLaSuerte){
                    intentos = intentos -1;
                    return "Ganaste!!";
                }
                else{
                    intentos = intentos -1;
                    return "Sigue Intentando";
                }                
            }
            else{
                return "Inserta una ficha";
            }
        }
        else{
            return "El premio no esta disponible";
        }
    }
    
    /*
    public String jugar(int numeroDeLaSuerte){
        
        if(premioCantidadFija){
            if(intentos > 0){
                if(numeroSecreto == numeroDeLaSuerte){
                    intentos = intentos -1;
                    return "Ganaste!!";
                }
                else{
                    intentos = intentos -1;
                    return "Sigue Intentando";
                }                
            }
            else{
                return "Inserta una ficha";
            }
        }
        else{
            return "El premio no esta disponible";
        }
    }    
    */
    
}