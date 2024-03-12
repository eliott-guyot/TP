import org.junit.*;
import static org.junit.Assert.*;
public class TestsBoxes{
    @Test
    public void testBoxCreate() {
    Box b = new Box();
    }
    /** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
}
}
    @Test
    public void testBoxFromJSONSimple(){
    // use the file test1.json in ressources folder
    String path =TestBoxes.class.getClassLoader().getResource("test1.json").getFile();
    Box b = Box.fromJSON(path);
    assertEquals(b.capacity(), -1);
    assertTrue(b.isOpen());




    @Test
    public void testBoxFromJSONSimple(){
    // use the file test1.json in ressources folder
    String path =TestBoxes.class.getClassLoader().getResource("test1.json").getFile();
    Box b = Box.fromJSON(path);
    assertEquals(b.capacity(), -1);
    assertTrue(b.isOpen());
    }
}

