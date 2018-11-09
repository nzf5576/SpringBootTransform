/**
 * MappingMapToMarketingExpenses.java
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

public class MappingMapToMarketingExpenses extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_ExpReport_Instance;
	
		public main(com.altova.mapforce.IMFNode var1_ExpReport_Instance)
		{
			this.var1_ExpReport_Instance = var1_ExpReport_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			com.altova.mapforce.IEnumerable var2_expense_report;
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
					case 3:	if (moveNext_3()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 5:	if (moveNext_5()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_expense_report = new com.altova.functions.Core.SequenceCache(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("expense-report", ""), closure.var1_ExpReport_Instance));
				current = com.altova.functions.Core.createProcessingInstruction("type=\"text/xsl\" href=\"MarketingExpenses.xslt\"", "xml-stylesheet");
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 4;				
				current = com.altova.functions.Core.createProcessingInstruction("MarketingExpenses.sps", "altova_sps");
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 5;				
				current = com.altova.functions.Core.createComment("Generated by Altova MapForce (http://www.altova.com/mapforce)");
				pos++;
				return true;
			}
			private boolean moveNext_5() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("marketing-expenses", ""), (new seq1_join(var2_expense_report)));
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
		com.altova.mapforce.IEnumerable var1_expense_report;
	
		public seq1_join(com.altova.mapforce.IEnumerable var1_expense_report)
		{
			this.var1_expense_report = var1_expense_report;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			IEnumerator var2_expense_report;
			IEnumerator var3_filter;
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
					case 6:	if (moveNext_6()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("xsi:noNamespaceSchemaLocation", "http://www.w3.org/2001/XMLSchema-instance"), com.altova.functions.Core.box("file:///C:/Users/A054680/Documents/Altova/MapForce2019/MapForceExamples/MarketingExpenses.xsd"));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_expense_report = (closure.var1_expense_report).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 3;				
				if (!var2_expense_report.moveNext()) {state = 4; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Person", ""), (new seq2_join(((com.altova.mapforce.IMFNode)(var2_expense_report.current())))));
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				var3_filter = ((new seq3_join(closure.var1_expense_report))).enumerator();
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var3_filter.moveNext()) {state = 7; return false; }
				if (!(com.altova.functions.Core.equal(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("expto", ""), ((com.altova.mapforce.IMFNode)(var3_filter.current()))))), "Marketing"))) {state = 6; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("expense-item", ""), (new seq4_seq_(((com.altova.mapforce.IMFNode)(var3_filter.current())))));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 0;				
				if( var3_filter != null ) { var3_filter.close(); var3_filter = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				if( var3_filter != null ) { var3_filter.close(); var3_filter = null; }
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
	
		public seq2_join(com.altova.mapforce.IMFNode var1_cur)
		{
			this.var1_cur = var1_cur;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq2_join closure;
			com.altova.mapforce.IMFNode var2_Person;
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
					case 4:	if (moveNext_4()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_Person = (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Person", ""), closure.var1_cur));
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("FullName", ""), com.altova.functions.Core.box(com.altova.functions.Core.concat(com.altova.functions.Core.concat(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("First", ""), var2_Person))), " "), com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Last", ""), var2_Person))))));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Title", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Title", ""), var2_Person)))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 4;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Phone", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Phone", ""), var2_Person)))));
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Email", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Email", ""), var2_Person)))));
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
	static class seq3_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_expense_report;
	
		public seq3_join(com.altova.mapforce.IEnumerable var1_expense_report)
		{
			this.var1_expense_report = var1_expense_report;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq3_join closure;
			IEnumerator var2_expense_report;
			IEnumerator var3_expense_item;
			public Enumerator(seq3_join closure) 
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
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_expense_report = (closure.var1_expense_report).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_expense_report.moveNext()) {state = 3; return false; }
				var3_expense_item = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("expense-item", ""), ((com.altova.mapforce.IMFNode)(var2_expense_report.current())))).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 4;				
				if (!var3_expense_item.moveNext()) {state = 5; return false; }
				current = var3_expense_item.current();
				pos++;
				return true;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_expense_item != null ) { var3_expense_item.close(); var3_expense_item = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var3_expense_item != null ) { var3_expense_item.close(); var3_expense_item = null; }
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq4_seq_ implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_cur;
	
		public seq4_seq_(com.altova.mapforce.IMFNode var1_cur)
		{
			this.var1_cur = var1_cur;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq4_seq_ closure;
			public Enumerator(seq4_seq_ closure) 
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
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("type", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterAttributes(com.altova.functions.Core.createQName("type", ""), closure.var1_cur)))));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Date", ""), com.altova.functions.Core.box(com.altova.CoreTypes.dateToString(com.altova.CoreTypes.parseDate(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Date", ""), closure.var1_cur)))))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("expense", ""), com.altova.functions.Core.box(com.altova.CoreTypes.decimalToString(com.altova.CoreTypes.parseDecimal(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("expense", ""), closure.var1_cur)))))));
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
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_ExpReport_Instance;
	
		public Outer(com.altova.mapforce.IMFNode var1_ExpReport_Instance)
		{
			this.var1_ExpReport_Instance = var1_ExpReport_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_expense_report;
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
				var2_expense_report = ((new main(closure.var1_ExpReport_Instance))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_expense_report.moveNext()) {state = 3; return false; }
				current = var2_expense_report.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_expense_report != null ) { var2_expense_report.close(); var2_expense_report = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances
	protected org.w3c.dom.Node varExpReport2Instance;

	public void run(String ExpReport2SourceFilename, String MarketingExpenses2TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + ExpReport2SourceFilename + "...\n");
		com.altova.io.FileInput ExpReport2Source = new com.altova.io.FileInput(ExpReport2SourceFilename);
		// open target stream
		com.altova.io.FileOutput MarketingExpenses2Target = new com.altova.io.FileOutput(MarketingExpenses2TargetFilename);

		// run
	
		run(ExpReport2Source, MarketingExpenses2Target);

		// close source streams
		ExpReport2Source.close();
		// close target stream
		writeTrace("Saving " + MarketingExpenses2TargetFilename + "...\n");
		MarketingExpenses2Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input ExpReport2Source, com.altova.io.Output MarketingExpenses2Target) throws Exception {
		// Open the source(s)
		org.w3c.dom.Document doc_ExpReport2 = XmlTreeOperations.loadDocument(ExpReport2Source);
		varExpReport2Instance = doc_ExpReport2;
		if (runDoesCloseAll)
			ExpReport2Source.close();

		// Create the target
		org.w3c.dom.Document MarketingExpenses2Doc = (MarketingExpenses2Target.getType() == com.altova.io.Output.IO_DOM) ? MarketingExpenses2Target.getDocument() : XmlTreeOperations.createDocument();

		// Execute mapping

		main mapping = new main(new com.altova.xml.DOMDocumentAsMFNodeAdapter(varExpReport2Instance, ExpReport2Source.getFilename()));

		com.altova.xml.MFDOMWriter.write(mapping, MarketingExpenses2Doc);
		// Close the target
		XmlTreeOperations.saveDocument(MarketingExpenses2Doc, MarketingExpenses2Target, "UTF-8", false, false, true, false);

		
		if (runDoesCloseAll)
		{
			ExpReport2Source.close();
			MarketingExpenses2Target.close();
		}
	}



}