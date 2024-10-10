import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class RunGardenTest {
	
	private String readExpectedOutput(String filename) throws FileNotFoundException {
        File myFile = new File(filename);
        Scanner myReader = new Scanner(myFile);
        String content = "";
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            content += line + "\n";
        }
        myReader.close();

        return content;

    }

	@Test
	void testOne() throws FileNotFoundException {
		PrintStream standardOut = System.out;
	    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	    String studentOutput;
	    
        System.setOut(new PrintStream(outputStreamCaptor));
        
        String[] names = {"plantcool.in"};
        RunGarden.main(names);
        String expectedOutput = readExpectedOutput("pa5-plantcool.out");
        studentOutput = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutput.trim(), studentOutput.trim());
        System.setOut(standardOut);
	}
	
	@Test
	void testTwo() throws FileNotFoundException {
		PrintStream standardOut = System.out;
	    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	    String studentOutput;
	    
        System.setOut(new PrintStream(outputStreamCaptor));
        
        String[] names = {"plantcool.in"};
        RunGarden.main(names);
        String expectedOutput = readExpectedOutput("pa5-plantcool.out");
        studentOutput = outputStreamCaptor.toString().trim();
        assertEquals(expectedOutput.trim(), studentOutput.trim());
        System.setOut(standardOut);
	}

}
