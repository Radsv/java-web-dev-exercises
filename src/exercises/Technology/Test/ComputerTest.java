package exercises.Technology.Test;

import exercises.Technology.Main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputerTest {


    Computer myComputer;

    @Before
    public void beforeTests(){
        myComputer = new Computer(100, 100, true);
    }
    @Test
    public void constructorSetsValuesTest(){
        //Computer myComputer = new Computer(100, 100, true );
        assertEquals(100,this.myComputer.getStorage());
        assertEquals(100,this.myComputer.getRam());
        assertEquals(true, this.myComputer.getIsHasKeyboard());
    }
}
