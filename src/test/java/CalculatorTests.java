import org.junit.Assert;
import org.junit.Test;
import Task06.Calculator;

public class CalculatorTests {


    @Test
    public void summaWorks(){
        Calculator culc = new Calculator(2.2, 3.42, '+');
        Assert.assertEquals("Сумма двух чисел не работет",5.62, culc.doOperation(), 0.0 );
    }


    @Test
    public void differenceWorks(){
        Calculator culc = new Calculator(2.2, 3.42, '-');
        Assert.assertEquals("Частное двух чисел не работет",-1.22, culc.doOperation(), 0.1);
    }


    @Test
    public void multiplicationWorks(){
        Calculator culc = new Calculator(2.2, 2, '*');
        Assert.assertEquals("Умножение не работет",4.4, culc.doOperation(), 0);
    }

    @Test
    public void divisionWorks(){
        Calculator culc = new Calculator(4.4, 2, '/');
        Assert.assertEquals("Деление чисел не работет",2.2, culc.doOperation(), 0);
    }


    @Test
    public void devisionNumberAndZeroShouldBeException(){
        Calculator culc = new Calculator(2.2, 0, '/');
        IllegalArgumentException thrown = Assert.assertThrows("При делении на ноль должно быть исключение",
                IllegalArgumentException.class, culc::doOperation);

        Assert.assertTrue(thrown.getMessage().contains("Нельзя делить на ноль"));
    }


    @Test
    public void unknownOperationShouldBeException(){
        Calculator culc = new Calculator(2.2, 5, '&');
        IllegalArgumentException thrown = Assert.assertThrows("При неизвестной операции должно быть исключение",
                IllegalArgumentException.class, culc::doOperation);

        Assert.assertTrue(thrown.getMessage().contains("Неизвестная операция"));
    }


}
