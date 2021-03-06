package sia.knights;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sia.knights.api.Knight;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:KnightXMLInjectionTest-context.xml"})
public class KnightXMLInjectionTest {

    @Autowired
    private Knight knight;

    @Autowired
    private FakePrintStream fakePrintStream;

    @After
    public void clearPrintStream() {
        fakePrintStream.clear();
    }

    @Test
    public void shouldInjectKnightWithSlayDragonQuest() {
        knight.embarkOnQuest();
        assertEquals(
                "Fa la la, the knight is so brave!\n" +
                        "Embarking on quest to slay the dragon!\n" +
                        "Tee hee hee, the brave knight did embark on a quest!\n",
                fakePrintStream.getPrintedString());
    }

}
