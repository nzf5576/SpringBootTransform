/**
 * MappingConsole.java
 *
 * This file was generated by MapForce 2019.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package com.app;

import com.altova.types.*;
import com.altova.io.*;
import com.mapforce.MappingMapTooutput;


public class MappingConsole {

	public static void main(String[] args) {
		try { // Mapping
			TraceTargetConsole ttc = new TraceTargetConsole();
			MappingMapTooutput MappingMapTooutputObject = new MappingMapTooutput();
			MappingMapTooutputObject.registerTraceTarget(ttc);

			
                        com.altova.io.Input input2Source = com.altova.io.StreamInput.createInput("/root/NetBeansProjects/SpringBootPeP/input.json");
                        com.altova.io.Output output2Target = new com.altova.io.FileOutput("/root/NetBeansProjects/SpringBootPeP/output.json");

                        MappingMapTooutputObject.run(input2Source,output2Target);
			
			System.err.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.err.print("USER EXCEPTION:");
			System.err.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.err.print("Inner exception: ");
				System.err.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.err.print("Cause: ");
					System.err.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

	}
        
	public String xForm(String inputj) {
		System.err.println("Mapping Application");

		try { // Mapping
			TraceTargetConsole ttc = new TraceTargetConsole();
			MappingMapTooutput MappingMapTooutputObject = new MappingMapTooutput();
			MappingMapTooutputObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapTooutputObject.setCloseObjectsAfterRun(false);

			
                        StringInput input2Source = new StringInput(inputj);
                        StringOutput output2Target = new StringOutput();

                        MappingMapTooutputObject.run(input2Source,output2Target);
                        System.out.println(output2Target.getString().toString());

                return output2Target.getString().toString();			
                        
		} 
		catch (com.altova.UserException ue) 
		{
			System.err.print("USER EXCEPTION:");
			System.err.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.err.print("Inner exception: ");
				System.err.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.err.print("Cause: ");
					System.err.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
                return "ERROR";
	}

                  
        
}  //Mapping class


class TraceTargetConsole implements com.altova.TraceTarget {
	public void writeTrace(String info) {
		System.err.println(info);
	}
}
