import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App { 

    public enum TipoVehiculo{
        CARRO,
        BICICLETA
    }
    public interface Vehiculo{
        void Acelerar();
        void Frenar();
    }

    public class Carro implements Vehiculo{

        @Override
        public void Acelerar() {
            System.out.println("Carro Acelerando");
            
        }

        @Override
        public void Frenar() {
            System.out.println("Carro frenando");
            
        }

    }
    public class Bici implements Vehiculo{

        @Override
        public void Acelerar() {
            System.out.println("Bici Acelerando");
            
        }

        @Override
        public void Frenar() {
            System.out.println("Bici frenando");
            
        }
    }
    public class FactoryVehiculo {
        public Vehiculo createVehiculo (TipoVehiculo tipo){
           switch(tipo){
            case CARRO: 
            return new Carro();
            case BICICLETA:
            return new Bici();
            default:
            throw new IllegalArgumentException("Vehiculo no disponible");
           }
        }

        
        
    }

    public static void main(String[] args) throws Exception {
        App app = new App();

        FactoryVehiculo factory = app.new FactoryVehiculo();
        Vehiculo vehiculo1 = factory.createVehiculo(TipoVehiculo.CARRO);
        vehiculo1.Acelerar();
        //factory.createVehiculo("Carro");

       // List<String> array = Arrays.asList("mario","pedro");
        //System.out.println("Hello, World!");
    }
}                    
