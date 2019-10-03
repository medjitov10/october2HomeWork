package AnimalTest;
import hwnow2.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private Animal animal;

    @Before
    public void createAnimal() {
        animal = new Animal(4, 25, true, "Elephant");
    }
    @Test
    public void legsGetterTest() {
        assertEquals(4, animal.getNumLegs());
    }
    @Test
    public void legsSetterTest() {
        animal.setNumLegs(32);
        assertEquals(32, animal.getNumLegs());
    }
    @Test
    public void topSpeedGetterTest() {
        assertEquals(25, animal.getTopSpeed());
    }
    @Test
    public void topSpeedSetterTest() {
        animal.setTopSpeed(32);
        assertEquals(32, animal.getTopSpeed());
    }

    @Test
    public void isEndangeredGetterTest() {
        assertEquals(true, animal.isEndangered());
    }
    @Test
    public void setEndangeredTest() {
        animal.setEndangered(false);
        assertEquals(false, animal.isEndangered());
    }

    @Test
    public void nameGetterTest() {
        assertEquals("Elephant", animal.getName());
    }
    @Test
    public void nameSetterTest() {
        animal.setName("Osman");
        assertEquals("Osman", animal.getName());
    }
}
