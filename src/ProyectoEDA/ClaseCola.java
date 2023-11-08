package ProyectoEDA;

public class ClaseCola {
    private int posInicio;
    private int posFin;
    private int[] elementos;
    
    public ClaseCola(int tam) {
        elementos = new int[tam];
        posInicio = -1;
        posFin = -1;
    }
    
    public boolean estaVacia() {
        // true: si esta vacio, false: caso contrario
        if (posInicio == -1 && posFin == -1)
            return true;
        return false;
    }
    
    public boolean estaLlena() {
        if ((posInicio == 0 && posFin == elementos.length - 1) ||
                (posInicio == posFin + 1))
            return true;
        return false;
    }
    
    public void encolar(int item) {     // colocar elemento en la cola
        if(!estaLlena()) {
            if(estaVacia()) {
                posInicio = 0;
                posFin = 0;
            }
            else {
                if(posFin == elementos.length - 1)
                    posFin = 0;
                else
                    posFin++;
            }
            elementos[posFin] = item;
        }
    }
    
    public int desencolar() {   // retirar elemento
        if(!estaVacia()) {
            int elem = elementos[posInicio];
            if (posInicio == posFin) {
                posInicio = -1;
                posFin = -1;
            }
            else {
                if (posInicio == elementos.length - 1)
                    posInicio = 0;
                else
                    posInicio++;
            }
            return elem;
        }else{
            System.out.println("No hay elementos para desencolar ");
            return -1;
        }
    }
    
    public void mostrar(){

        if (posFin < posInicio){
            for(int i = posInicio; i <= elementos.length - 1 ; i++){
                System.out.print(elementos[i] + " -> ");
            }
            for (int i = 0; i <= posFin; i++){
                System.out.print(elementos[i] + " -> ");
            }
        }else{
            for(int i = posInicio; i <= posFin; i++){
                System.out.print(elementos[i] + " -> ");
            }
        }
        System.out.println();
    }
}
