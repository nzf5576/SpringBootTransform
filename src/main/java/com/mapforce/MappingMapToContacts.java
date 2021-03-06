/**
 * MappingMapToContacts.java
 *
 * This file was generated by MapForce 2019.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import java.util.*;

public class MappingMapToContacts extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_PersonList_Instance;
	
		public main(com.altova.mapforce.IMFNode var1_PersonList_Instance)
		{
			this.var1_PersonList_Instance = var1_PersonList_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			public Enumerator(main closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 2:	if (moveNext_2()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Contacts", ""), (new seq1_join(closure.var1_PersonList_Instance)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq1_join implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_PersonList_Instance;
	
		public seq1_join(com.altova.mapforce.IMFNode var1_PersonList_Instance)
		{
			this.var1_PersonList_Instance = var1_PersonList_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			IEnumerator var2_PersonList;
			IEnumerator var3_Person;
			public Enumerator(seq1_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 5:	if (moveNext_5()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("xsi:noNamespaceSchemaLocation", "http://www.w3.org/2001/XMLSchema-instance"), com.altova.functions.Core.box("file:///C:/Users/A054680/Documents/Altova/MapForce2019/MapForceExamples/Contacts.xsd"));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_PersonList = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("PersonList", ""), closure.var1_PersonList_Instance)).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if (!var2_PersonList.moveNext()) {state = 4; return false; }
				var3_Person = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Person", ""), ((com.altova.mapforce.IMFNode)(var2_PersonList.current())))).enumerator();
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 0;				
				if( var2_PersonList != null ) { var2_PersonList.close(); var2_PersonList = null; }
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 5;				
				if (!var3_Person.moveNext()) {state = 6; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Contact", ""), (new seq2_join(((com.altova.mapforce.IMFNode)(var3_Person.current())), var3_Person.position())));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 3;				
				if( var3_Person != null ) { var3_Person.close(); var3_Person = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var3_Person != null ) { var3_Person.close(); var3_Person = null; }
				if( var2_PersonList != null ) { var2_PersonList.close(); var2_PersonList = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq2_join implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_cur;
		int var2_idx;
	
		public seq2_join(com.altova.mapforce.IMFNode var1_cur, int var2_idx)
		{
			this.var1_cur = var1_cur;
			this.var2_idx = var2_idx;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq2_join closure;
			IEnumerator var3_role;
			double var4_cast;
			public Enumerator(seq2_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 5:	if (moveNext_5()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var3_role = (com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("role", ""), closure.var1_cur)).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var3_role.moveNext()) {state = 3; return false; }
				var4_cast = com.altova.CoreTypes.decimalToDouble(new java.math.BigDecimal("1"));
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("ID", ""), com.altova.functions.Core.box(com.altova.functions.Core.concat(com.altova.functions.Core.concat(com.altova.functions.Core.substring(com.altova.CoreTypes.nodeToString(((com.altova.mapforce.IMFNode)(var3_role.current()))), var4_cast, var4_cast), "-"), com.altova.CoreTypes.integerToString(com.altova.CoreTypes.longToInteger(com.altova.CoreTypes.intToLong(closure.var2_idx))))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if( var3_role != null ) { var3_role.close(); var3_role = null; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("First", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("First", ""), closure.var1_cur)))));
				pos++;
				return true;
			}
			private boolean moveNext_5() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Last", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Last", ""), closure.var1_cur)))));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				if( var3_role != null ) { var3_role.close(); var3_role = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_PersonList_Instance;
	
		public Outer(com.altova.mapforce.IMFNode var1_PersonList_Instance)
		{
			this.var1_PersonList_Instance = var1_PersonList_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_box;
			public Enumerator(Outer closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_box = ((new main(closure.var1_PersonList_Instance))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_box.moveNext()) {state = 3; return false; }
				current = var2_box.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_box != null ) { var2_box.close(); var2_box = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_box != null ) { var2_box.close(); var2_box = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances
	protected org.w3c.dom.Node varPersonList2Instance;

	public void run(String PersonList2SourceFilename, String Contacts2TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + PersonList2SourceFilename + "...\n");
		com.altova.io.FileInput PersonList2Source = new com.altova.io.FileInput(PersonList2SourceFilename);
		// open target stream
		com.altova.io.FileOutput Contacts2Target = new com.altova.io.FileOutput(Contacts2TargetFilename);

		// run
	
		run(PersonList2Source, Contacts2Target);

		// close source streams
		PersonList2Source.close();
		// close target stream
		writeTrace("Saving " + Contacts2TargetFilename + "...\n");
		Contacts2Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input PersonList2Source, com.altova.io.Output Contacts2Target) throws Exception {
		// Open the source(s)
		org.w3c.dom.Document doc_PersonList2 = XmlTreeOperations.loadDocument(PersonList2Source);
		varPersonList2Instance = doc_PersonList2;
		if (runDoesCloseAll)
			PersonList2Source.close();

		// Create the target
		org.w3c.dom.Document Contacts2Doc = (Contacts2Target.getType() == com.altova.io.Output.IO_DOM) ? Contacts2Target.getDocument() : XmlTreeOperations.createDocument();

		// Execute mapping

		main mapping = new main(new com.altova.xml.DOMDocumentAsMFNodeAdapter(varPersonList2Instance, PersonList2Source.getFilename()));

		com.altova.xml.MFDOMWriter.write(mapping, Contacts2Doc);
		// Close the target
		XmlTreeOperations.saveDocument(Contacts2Doc, Contacts2Target, "UTF-8", false, false, true, false);

		
		if (runDoesCloseAll)
		{
			PersonList2Source.close();
			Contacts2Target.close();
		}
	}



}
