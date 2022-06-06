import org.junit.Test;

import static org.junit.Assert.*;

public class gradeTest {


      grade Gr = new grade();

    @Test
    public void foundgradeF(){
        assertEquals( 'F',Gr.findgrade(58) );
        }



    @Test
    public void foundgradeD(){
        assertEquals('D',Gr.findgrade(68));
    }

    @Test
    public void foundgradeC(){
        assertEquals('C',Gr.findgrade(78)); ;
    }

    @Test
    public void foundgradeB(){
        assertEquals('B',Gr.findgrade(88)); ;
    }

    @Test
    public void foundgradeA(){
        assertEquals('A',Gr.findgrade(90)); ;
    }
    @Test
    public void foundgradeZ(){
        assertEquals('F',Gr.findgrade(0));
    }
    @Test
    public void foundgradeN(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                     Gr.findgrade(-1);
                }); ;
    }
    }
