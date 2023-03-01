/**
 * 
 */
package dut.app.test;

import dut.app.main.IDestination;

/**
 * @author kimocks
 *
 */
public class destSpy implements IDestination{
	public int counter= 0; //to count number of times setChar was Called
    private char character;
    private String strOutput =""; //outputs string 


  
   

    public char verifyCharacter() {
        return character;
    }

    public String verifyString(){
        return strOutput;
    }
    
    @Override
    public void SetChar(char character){
    	
        this.character = character;
        strOutput = strOutput+character;
        counter ++;
    }
  

}
