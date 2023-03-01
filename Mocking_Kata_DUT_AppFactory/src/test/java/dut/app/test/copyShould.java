/**
 * 
 */
package dut.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dut.app.main.Copier;
import dut.app.main.ISource;

/**
 * @author kimocks
 *
 */
public class copyShould {
	private destSpy destinationSpy;

    @Before
    public void
    setUp() {
        destinationSpy = new destSpy();
    }

    @Test
    public void
    copy_a_character() {

        ISource sourceStub = new sourceStub("a\n");
        Copier copier = new Copier(sourceStub, destinationSpy);

        copier.Copy();

        assertEquals(1, destinationSpy.counter);
        assertEquals('a', destinationSpy.verifyCharacter());


    }

    @Test
    public void
    copy_a_line_of_characters() {
        ISource sourceStub = new sourceStub("aaaAB" + "\n");
        Copier copier = new Copier(sourceStub, destinationSpy);

        copier.Copy();

        assertEquals(5, destinationSpy.counter);
        assertEquals("aaaAB", destinationSpy.verifyString());


    }
}
