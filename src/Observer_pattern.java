import java.util.ArrayList;
import java.util.List;

public class Observer_pattern {

    interface Observador{
        //interface Observador
        void actualizar(String mensaje);
    }

    //Sujeto (Observable)
    class Sujeto{

        private List<Observador> observadores = new ArrayList<>();
        private String estado;

        public void agregarObservador(Observador observador){
            observadores.add(observador);
        }

        public void eliminarObservador(Observador observador){
            observadores.add(observador);
        }
        public void NotificarObservadores(){
            for (Observador observador : observadores){
                observador.actualizar(estado);
            }

        }
        public void setEstado(String nuevoEstado){
            this.estado = nuevoEstado;
            NotificarObservadores();
        }


    }

    //ObservadorConcreto
    class ObservadorConcreto implements Observador{
        private String nombre;

        public ObservadorConcreto(String nombre){
            this.nombre = nombre;

        }

        public void actualizar(String mensaje){
            System.out.println(nombre+" recibio la actualización de: "+ mensaje);
        }

    }



    public static void main(String[] args) throws Exception {
        Observer_pattern app = new Observer_pattern();
        Sujeto sujeto = app.new Sujeto();

        ObservadorConcreto observador1 = app.new ObservadorConcreto("Observador1");
        ObservadorConcreto observador2 = app.new ObservadorConcreto("Observador2");
        ObservadorConcreto observador3 = app.new ObservadorConcreto("Observador3");
        ObservadorConcreto observador4 = app.new ObservadorConcreto("Observador4");
        ObservadorConcreto observador5 = app.new ObservadorConcreto("Observador5");
        ObservadorConcreto observador6 = app.new ObservadorConcreto("Observador6");



        sujeto.agregarObservador(observador1);
        sujeto.agregarObservador(observador2);
        sujeto.agregarObservador(observador3);
        sujeto.agregarObservador(observador4);
        sujeto.agregarObservador(observador5);
        sujeto.agregarObservador(observador6);


        sujeto.setEstado("Estado1");
        sujeto.setEstado("Estado2");
        sujeto.setEstado("estado16");



       
       

        
    }  
}
