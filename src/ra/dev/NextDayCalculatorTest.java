package ra.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getNextDayTest1() {
        //Input
        int day = 28;
        int month=2;
        int year =2022;
        //Ket qua mong muon
        String excpected = "1 / 3 / 2022";
        //Ket qua thuc te
        NextDayCalculator ndc = new NextDayCalculator();
        String strActual = ndc.getNextDay(day,month,year);
        //So sanh
        assertEquals(excpected,strActual);
    }
}
