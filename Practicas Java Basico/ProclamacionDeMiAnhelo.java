
/**
 * Write a description of class ProclamacionDeMiAnhelo here.
 * 
 * @author (Ivan Zapata) 
 * @version (1.0)
 */

/*
 * Contar signos de puntuación 
 * comas, puntos, punto y coma, signos de interrogación y de admiración
 *    , . ; ¿ ? ¡ ! 
 *    ALT 168 (¿), ALT 173 (¡)
 */
public class ProclamacionDeMiAnhelo
{
    private String frase;
    
    public ProclamacionDeMiAnhelo(){ //Constructor
        frase = "¿Y te encuentro en el fondo una vez más, Amor, vida muerte, eres el bien y el mal?.";
    }
    
    public int contarSignosPuntuacion(){ //Contar Signos de Puntuación
        int res = 0; // Contador de signos de puntuación
        for(int i=0; i<frase.length(); i++){
            char caracterActual = frase.charAt(i);
            if(esSignoPuntuacion(caracterActual)){
                res++;
            }
        }
        return res;
    }
    
    private boolean esSignoPuntuacion(char caracter){ // Identificador de Signos de puntuacion
        return caracter == ',' || caracter == ';' || caracter == '¿' || caracter == '?' || caracter == '¡' || caracter == '!' || caracter == '.' ;
    }
}
