package code;
import java.util.ArrayList;
 
 
public class Combinador {
       
        private Integer maximo;
        private ArrayList<Integer> elementos;
        public ArrayList<ArrayList<Integer>> resultados;
       
        public Combinador(Integer max, ArrayList<Integer> elem){
                maximo = max;
                elementos = elem;
                resultados = new ArrayList<ArrayList<Integer>>();
        }
       
        public void combinar()
        {
                int numero = (int) (Math.pow(2, elementos.size()) -1);
                int aux;
                ArrayList<Integer> r;
                for (int i = 0; i <= numero; i++) {                    
                        aux = numero - i;                      
                        r = binario_a_array(Integer.toBinaryString(aux));
                        if (suma(r) == maximo)
                        resultados.add(r);
                }
        }      
 
        public Integer suma(ArrayList<Integer> v){
                Integer suma = 0;
                for (int i = 0; i < v.size(); i++) {
                        suma += v.get(i);
                }
                return suma;
        }
       
        public ArrayList<Integer> binario_a_array(String binario){
                ArrayList<Boolean> v = new ArrayList<Boolean>();
                ArrayList<Integer> r = new ArrayList<Integer>();
                int max = binario.length()-1;
                for (int i = max; i >= 0; i--) {
                        if(binario.charAt(i) == '1')
                        	r.add(elementos.get(max-i));
                }
                return r;
        }
       
}