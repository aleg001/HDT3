import java.util.ArrayList;
public class vistaSort{
    public vistaSort(){

    }

    public void bienve(){
        System.out.println("\n\nBienvenido al programa de Sorts");
        System.out.println("1. Gnome Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Radix Sort");
        System.out.println("5. Bubble Sort");
        System.out.println("6. Salir\n\n");
    }

    public void printOrden(ArrayList<Integer> lista, String TypeSort){
        String paraImp="[";
        for(int i=0; i < lista.size(); i++){
            paraImp=String.valueOf(lista.get(i))+", ";
        }
        paraImp=paraImp+"]";
        System.out.println("La lista ordenada con "+TypeSort+" es : "+paraImp);
    }

    public void opSalir(){
        System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");
    }

    public void noValid(){
        System.out.println("Por favor ingrese un numero valido, si usted ingresa una letra EL PROGRAMA SE CIERRA");
    }

    public void fileCreated(){
        System.out.println("Su archivo ha sido creado y leido con exito");
    }
}