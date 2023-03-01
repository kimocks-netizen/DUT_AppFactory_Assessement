/**
 * 
 */
package dut.app.test;

import dut.app.main.ISource;

/**
 * @author kimocks
 *
 */
public class sourceStub implements ISource{
	
	private final String inputVal ;
    private int counter = 0;

    public sourceStub(String inputVal){
    	
        this.inputVal = inputVal;

    }

    /* (non-Javadoc)
	 * @see dut.app.main.ISource#GetChar()
	 */
    @Override
    public char GetChar(){
    	
        return inputVal.charAt(counter++);
    }
}
