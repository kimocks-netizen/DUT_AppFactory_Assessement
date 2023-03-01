/**
 * 
 */
package dut.app.main;

/**
 * @author kimocks
 *
 */
public class Copier {
	private final ISource source; //can be final
    private final IDestination destination; //can be final
    
    public Copier(ISource source, IDestination destination) {
        this.source = source;
        this.destination = destination;
    }

    /**
     * 
     */
    public void Copy() {
        while (true) {
            char sourceChar = source.GetChar();
            if (sourceChar == '\n') 
            {
                break;
            }
            //set character at destination to sourceChar
            destination.SetChar(sourceChar);
        }
        /*char sourceChar;
        do {
            sourceChar = source.GetChar();
            if (sourceChar != '\n') {
                destination.SetChar(sourceChar);
            }
        } while (sourceChar != '\n');*/
    }

}
