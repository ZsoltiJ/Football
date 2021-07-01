import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRefrigerator {
    Refrigerator refrigerator;

    @BeforeEach
    public void Setup(){
        refrigerator= new Refrigerator();
    }

    @Test
    public void TestRemove(){
        refrigerator.Add(new Beer(5,"Soproni"));
        refrigerator.Remove();
        Assertions.assertEquals(0,refrigerator.beers.size());
    }
    @Test
    public  void TEstRemove(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () ->refrigerator.Remove());
    }

    @Test
    public void TestAdd(){
        Beer addbeer=new Beer(5,"Soproni");
        refrigerator.Add(addbeer);
        Beer rebeer= refrigerator.Remove();
        Assertions.assertEquals(rebeer,addbeer);
    }
    @ Test
    public void TEstAdd(){

        for (int i = 0; i <6 ; i++) {
            Beer beer = new Beer(5,"Soproni");
            refrigerator.Add(beer);
        }

        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->refrigerator.Add(new Beer(5,"Soproni")));
    }

}
