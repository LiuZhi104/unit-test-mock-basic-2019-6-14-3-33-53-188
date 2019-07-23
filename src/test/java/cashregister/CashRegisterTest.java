package cashregister;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        FakePrinter fakePrinter=new FakePrinter();
        CashRegister cashRegister=new CashRegister(fakePrinter);
        Item items=new Item("apple",9);
        Purchase purchase=new Purchase(new Item[]{items});
        //when
        cashRegister.process(purchase);
        //then
        assertTrue(fakePrinter.printMethodWasCall());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        FakePrinter fakePrinter=new FakePrinter();
        CashRegister cashRegister=new CashRegister(fakePrinter);
        FakePurchase fakePurchase=new FakePurchase();
        Item items=new Item("apple",9);
        Purchase purchase=new Purchase(new Item[]{items});
        //when
        cashRegister.process(purchase);
        //then
//        assertEquals();
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        Printer printer = mock(Printer.class);
        Purchase purchase = mock(Purchase.class);
        when(purchase.asString()).thenReturn("TEST");
        CashRegister cashRegister = new CashRegister(printer);
        cashRegister.process(purchase);
        verify(printer).print("TEST");
    }



}
