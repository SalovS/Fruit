import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    Box<Apple> box = new Box();
    Box box2 = new Box();
    Box<Orange> box3 = new Box();

    @Test
    public void Compare1(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        System.out.println(box.Compare(box2));
        Assert.assertEquals(false, box.Compare(box2));
    }
    @Test
    public void Compare2(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());

        box3.addingFruit(new Orange());
        box3.addingFruit(new Orange());
        Assert.assertEquals(true, box.Compare(box3));
    }
    @Test
    public void addingFruit1(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        Assert.assertEquals(3.0, box.getWight(), 0.0001);
    }
    @Test
    public void addingFruit3(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        Assert.assertEquals(2.0, box.getWight(), 0.0001);
    }
    @Test
    public void addingFruit2(){
        box3.addingFruit(new Orange());
        box3.addingFruit(new Orange());
        Assert.assertEquals(3.0, box3.getWight(), 0.0001);
    }
    @Test
    public void addingFruit4(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());

        box3.addingFruit(new Orange());
        box3.addingFruit(new Orange());
        box3.addingFruit(new Orange());
        box3.addingFruit(new Orange());
        //box3.movingFruits(box);
        Assert.assertEquals(6.0, box3.getWight(), 0.0001);
    }
    @Test
    public void getWight1(){
        box.addingFruit(new Apple());
        box.addingFruit(new Apple());
        box2.movingFruits(box);
        Assert.assertEquals(2, box2.getWight(), 0.0001);
    }
}