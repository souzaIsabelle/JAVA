
package com.mycompany.testedesafio;


public class ReservaTEST {

    
    public boolean Reserva(String origem, String Destino, int data, int nPassageiros){
        
        
        if(validarINF(origem,Destino,data,nPassageiros)){
            System.out.println("RESERVA CONCLUIDA -- \n ORIGEM -> "+ origem + "\n DESTINO ->"+Destino+"\n DATA ->"+ data+
                    "\n PASSAGEIROS -> " + nPassageiros);
            
            return true;
        }else{
            System.out.println("RESERVA INVALIDA, CHEQUE AS INFORMAÇÕES");
            return false;
        }
        
        
    }
    
    private boolean validarINF(String origem, String Destino, int data, int nPassageiros){
        
      return origem != null && Destino != null && data > 0 && nPassageiros > 0;
              
        
    }
      
     public boolean cadeirasDISPONIVEIS(String origem, String destino, int nPassageiros) {

        if (cadeiras(origem, destino, nPassageiros)) {
            System.out.println("há cadeiras disponíveis");
            return true;
        } else {

            System.out.println("Há " + nPassageiros + " passageiros no voo de " + origem + " para " + destino + " . Não há lugares disponiveis.");
            return false;
        }
    }

    private boolean cadeiras(String origem, String destino, int nPassageiros) {

        return origem != null && destino != null && nPassageiros <= 278;

    }

    
    
    
    
    public boolean cancelaRESERVA(boolean test) {
        
       if(test != true){
        System.out.println("A SUA RESERVA FOI CANCELADA");
       }else{
           System.out.println("RESERVA CONFIRMADA, BOA VIAGEM!!");
       }
        return test;
    }
    
    
    
    public boolean confirmarCheckin(boolean test){
        if(test != false){
        System.out.println("CHECK-IN CONFIRMADO");
        }else{
            System.out.println("ERRO NO CHECK-IN, INFORME A CENTRAL");
        }
        return test; 
    
    } 
    
    
    public static void main(String[] args) {
       
    }
}
