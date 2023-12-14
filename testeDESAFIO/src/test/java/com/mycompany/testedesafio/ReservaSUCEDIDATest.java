
package com.mycompany.testedesafio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaSUCEDIDATest {
    
     ReservaTEST test = new ReservaTEST();
     
    @Test
 public void Reserva(){
     
        assertEquals(true, test.Reserva("Brasil", "Mexico", 101023, 10));
        
     
 }
 
 @Test
 public void cadeirasDISPONIVEIS(){
     assertEquals(true, test.cadeirasDISPONIVEIS("Brasil", "Mexico", 10) );
 }

 @Test
 
 public void cancelarRESERVA(){
     assertEquals(true, test.cancelaRESERVA(true));
}
 
 @Test
 public void confirmarCheckin(){
     assertEquals(true, test.confirmarCheckin(true));
     
 }
 
    
    
}
