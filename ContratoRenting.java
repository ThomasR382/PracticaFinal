import java.util.ArrayList;
import java.util.Scanner;

public class ContratoRenting{

    Scanner sc = new Scanner(System.in);

    private String IdContrato;
    private String CedulaCliente; //EL OBJETO DE CLIENTE DEBE TENER LOS ATRIBUTOS QUE DICE SOLAMENTE? O PUEDO AGREGAR MAS? (BOOLEAN TIENECONTRATO 1/0)
    private String PlacaVehiculo;
    private String FechaInicio;
    private String FechaFin;
    private int TotalDias;
    private float ValorTotal;

    
    

    public String getIdContrato() {
        return IdContrato;
    }




    public void setIdContrato(String idContrato) {
        IdContrato = idContrato;
    }




    public String getCedulaCliente() {
        return CedulaCliente;
    }




    public void setCedulaCliente(String cedulaCliente) {
        CedulaCliente = cedulaCliente;
    }




    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }




    public void setPlacaVehiculo(String placaVehiculo) {
        PlacaVehiculo = placaVehiculo;
    }




    public String getFechaInicio() {
        return FechaInicio;
    }




    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }




    public String getFechaFin() {
        return FechaFin;
    }




    public void setFechaFin(String fechaFin) {
        FechaFin = fechaFin;
    }




    public int getTotalDias() {
        return TotalDias;
    }




    public void setTotalDias(int totalDias) {
        TotalDias = totalDias;
    }




    public float getValorTotal() {
        return ValorTotal;
    }




    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }




    public ArrayList<ContratoRenting> AgregarContrato(ArrayList<ContratoRenting> ListaContratos){ //PREGUNTAR SI ES ARRAY O LINKEDLIST
        ContratoRenting o = new ContratoRenting();
        System.out.println("Ingrese el ID del nuevo contrato de renting ");
        o.setIdContrato(sc.next());
        System.out.println("Ingrese la cedula del cliente "); //INSTANCIAR LA FUNCION DE MOSTRAR LA LISTA DE CLIENTES QUE ESTAN DISPONIBLES PARA RENTING (QUE NO MUESTRE LOS QUE YA TENGAN UN RENTING), Y QUE ESCRIBA LA CEDULA (QUE SI ESTÉ EN LA LISTA)
        o.setCedulaCliente(sc.next());
        System.out.println("Ingrese la placa del vehiculo ");
        o.setPlacaVehiculo(sc.next());
        System.out.println("Ingrese la fecha de inicio del renting "); //PREGUNTAR COMO HACERLO FORMATO FECHA
        o.setFechaInicio(sc.next());
        System.out.println("Ingrese la fecha fin del renting ");//PREGUNTAR COMO HACERLO FORMATO FECHA
        o.setFechaFin(sc.next());
        System.out.println("Ingrese la cantidad de dias"); //FECHA FIN - FECHA INICIO = CANTIDAD DE DIAS "... dias o.getTotalDias"
        o.setTotalDias(sc.nextInt());
        System.out.println("Valor total del renting "); //PREGUNTAR SI EL EJERCICIO TIENE UNA TABLA FIJA DE PRECIOS O ALGO
        o.setValorTotal(sc.nextFloat()); //TABLA FIJA PARA HACER UN CALCULO FIJO SEGUN LOS DIAS Y QUE ALGUNAS COSAS NO SEAN TAN MECANICAS
        ListaContratos.add(o);
        return ListaContratos;
    }

    public ArrayList<ContratoRenting> EliminarContrato(ArrayList<ContratoRenting> ListaContratos){

        System.out.println("Ingrese el contrato a eliminar ");
        String Contrato = sc.next();

        for (ContratoRenting o : ListaContratos) {
            if(Contrato.equalsIgnoreCase(o.getIdContrato())){
                ListaContratos.remove(o);
            }
        }
        return ListaContratos;
    }

    public ArrayList<ContratoRenting> ModificarContrato(ArrayList<ContratoRenting> ListaContratos, ArrayList<Listas> ListaClientes, ArrayList<Listas> ListaVehiculos){

        Listas m = new Listas();
        String Contrato = sc.next();
        Boolean Control = true;

        while (Control) {
            System.out.println("Que contrato desea modificar ");

            for (ContratoRenting o : ListaContratos) {
                if (Contrato.equalsIgnoreCase(o.getIdContrato())) {
                    System.out.println("Que desea modificar del contrato? ");//SI SE CAMBIA EL FORMATO DE LAS FECHAS, QUITAR EL TOTAL DE DIAS Y VALOR TOTAL
                    System.out.println(" 1. Cliente \n 2. Placa Vehiculo \n 3. Fecha Inicio \n 4. Fecha Fin \n 5. Total de dias \n 6. Valor Total \n ");
                    int Cambio = sc.nextInt();
                    switch (Cambio) {
                        case 1:
                            System.out.println("Ingrese la cedula nueva ");
                            String CedulaNueva = sc.next();
                            break;
                    
                        default:
                            break;
                    }
                }
                
            }
        }
        return ListaContratos;
    }
}