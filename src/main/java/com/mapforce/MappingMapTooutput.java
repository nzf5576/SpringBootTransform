/**
 * MappingMapTooutput.java
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
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class MappingMapTooutput extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_input_Instance;
	
		public main(com.altova.mapforce.IMFNode var1_input_Instance)
		{
			this.var1_input_Instance = var1_input_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			com.altova.mapforce.IEnumerable var2_as_object;
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
				var2_as_object = new com.altova.functions.Core.SequenceCache(com.altova.functions.Json.AsObject(com.altova.functions.Json.RootValue(closure.var1_input_Instance)));
				current = com.altova.functions.Json.CreateObject((new seq1_join(var2_as_object)));
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
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq1_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			IEnumerator var2_create_member;
			IEnumerator var3_create_member;
			IEnumerator var4_create_member;
			IEnumerator var5_create_member;
			IEnumerator var6_create_member;
			IEnumerator var7_create_member;
			IEnumerator var8_create_member;
			IEnumerator var9_create_member;
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
					case 5:	if (moveNext_5()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 8:	if (moveNext_8()) return true; break;
					case 9:	if (moveNext_9()) return true; break;
					case 11:	if (moveNext_11()) return true; break;
					case 12:	if (moveNext_12()) return true; break;
					case 14:	if (moveNext_14()) return true; break;
					case 15:	if (moveNext_15()) return true; break;
					case 17:	if (moveNext_17()) return true; break;
					case 18:	if (moveNext_18()) return true; break;
					case 20:	if (moveNext_20()) return true; break;
					case 21:	if (moveNext_21()) return true; break;
					case 23:	if (moveNext_23()) return true; break;
					case 24:	if (moveNext_24()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_create_member = (com.altova.functions.Json.CreateMember("accountNumber", (new seq2_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_create_member.moveNext()) {state = 3; return false; }
				current = var2_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if( var2_create_member != null ) { var2_create_member.close(); var2_create_member = null; }
				var3_create_member = (com.altova.functions.Json.CreateMember("email", (new seq3_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 5;				
				if (!var3_create_member.moveNext()) {state = 6; return false; }
				current = var3_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 8;				
				if( var3_create_member != null ) { var3_create_member.close(); var3_create_member = null; }
				var4_create_member = (com.altova.functions.Json.CreateMember("firstName", (new seq4_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_8() throws Exception {
				state = 8;				
				if (!var4_create_member.moveNext()) {state = 9; return false; }
				current = var4_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_9() throws Exception {
				state = 11;				
				if( var4_create_member != null ) { var4_create_member.close(); var4_create_member = null; }
				var5_create_member = (com.altova.functions.Json.CreateMember("lastName", (new seq5_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_11() throws Exception {
				state = 11;				
				if (!var5_create_member.moveNext()) {state = 12; return false; }
				current = var5_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_12() throws Exception {
				state = 14;				
				if( var5_create_member != null ) { var5_create_member.close(); var5_create_member = null; }
				var6_create_member = (com.altova.functions.Json.CreateMember("loginID", (new seq6_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_14() throws Exception {
				state = 14;				
				if (!var6_create_member.moveNext()) {state = 15; return false; }
				current = var6_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_15() throws Exception {
				state = 17;				
				if( var6_create_member != null ) { var6_create_member.close(); var6_create_member = null; }
				var7_create_member = (com.altova.functions.Json.CreateMember("personIndex", (new seq7_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_17() throws Exception {
				state = 17;				
				if (!var7_create_member.moveNext()) {state = 18; return false; }
				current = var7_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_18() throws Exception {
				state = 20;				
				if( var7_create_member != null ) { var7_create_member.close(); var7_create_member = null; }
				var8_create_member = (com.altova.functions.Json.CreateMember("phone", (new seq8_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_20() throws Exception {
				state = 20;				
				if (!var8_create_member.moveNext()) {state = 21; return false; }
				current = var8_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_21() throws Exception {
				state = 23;				
				if( var8_create_member != null ) { var8_create_member.close(); var8_create_member = null; }
				var9_create_member = (com.altova.functions.Json.CreateMember("routingNumber", (new seq9_join(closure.var1_as_object)))).enumerator();
				return false;
			}
			private boolean moveNext_23() throws Exception {
				state = 23;				
				if (!var9_create_member.moveNext()) {state = 24; return false; }
				current = var9_create_member.current();
				pos++;
				return true;
			}
			private boolean moveNext_24() throws Exception {
				state = 0;				
				if( var9_create_member != null ) { var9_create_member.close(); var9_create_member = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_create_member != null ) { var2_create_member.close(); var2_create_member = null; }
				if( var3_create_member != null ) { var3_create_member.close(); var3_create_member = null; }
				if( var4_create_member != null ) { var4_create_member.close(); var4_create_member = null; }
				if( var5_create_member != null ) { var5_create_member.close(); var5_create_member = null; }
				if( var6_create_member != null ) { var6_create_member.close(); var6_create_member = null; }
				if( var7_create_member != null ) { var7_create_member.close(); var7_create_member = null; }
				if( var8_create_member != null ) { var8_create_member.close(); var8_create_member = null; }
				if( var9_create_member != null ) { var9_create_member.close(); var9_create_member = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq2_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq2_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq2_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
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
					case 5:	if (moveNext_5()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "routingNumber")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq3_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq3_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq3_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
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
					case 6:	if (moveNext_6()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "email")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq4_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq4_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq4_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
			public Enumerator(seq4_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "firstName")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq5_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq5_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq5_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
			public Enumerator(seq5_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "lastName")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq6_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq6_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq6_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
			public Enumerator(seq6_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "loginID")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq7_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq7_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq7_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_number;
			public Enumerator(seq7_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "personIndex")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_number = (com.altova.functions.Json.AsNumber(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_number.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateNumber(((java.math.BigDecimal)(var4_as_number.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_number != null ) { var4_as_number.close(); var4_as_number = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_number != null ) { var4_as_number.close(); var4_as_number = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq8_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq8_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq8_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
			public Enumerator(seq8_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "phone")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq9_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_as_object;
	
		public seq9_join(com.altova.mapforce.IEnumerable var1_as_object)
		{
			this.var1_as_object = var1_as_object;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq9_join closure;
			IEnumerator var2_as_object;
			IEnumerator var3_object_member_by_name;
			IEnumerator var4_as_string;
			public Enumerator(seq9_join closure) 
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
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_as_object = (closure.var1_as_object).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 4;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				var3_object_member_by_name = (com.altova.functions.Json.GetMemberByName(((com.altova.mapforce.IMFNode)(var2_as_object.current())), "accountNumber")).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				if (!var3_object_member_by_name.moveNext()) {state = 5; return false; }
				var4_as_string = (com.altova.functions.Json.AsString(com.altova.functions.Json.GetMemberValue(((com.altova.mapforce.IMFNode)(var3_object_member_by_name.current()))))).enumerator();
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 2;				
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				return false;
			}
			private boolean moveNext_6() throws Exception {
				state = 6;				
				if (!var4_as_string.moveNext()) {state = 7; return false; }
				current = com.altova.functions.Json.CreateString(((java.lang.String)(var4_as_string.current())));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 4;				
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var4_as_string != null ) { var4_as_string.close(); var4_as_string = null; }
				if( var3_object_member_by_name != null ) { var3_object_member_by_name.close(); var3_object_member_by_name = null; }
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_input_Instance;
	
		public Outer(com.altova.mapforce.IMFNode var1_input_Instance)
		{
			this.var1_input_Instance = var1_input_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_as_object;
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
				var2_as_object = ((new main(closure.var1_input_Instance))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_as_object.moveNext()) {state = 3; return false; }
				current = var2_as_object.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_as_object != null ) { var2_as_object.close(); var2_as_object = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances
   protected com.altova.json.Document varinput2Instance;

	public void run(String input2SourceFilename, String output2TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + input2SourceFilename + "...\n");
		com.altova.io.FileInput input2Source = new com.altova.io.FileInput(input2SourceFilename);
		// open target stream
		com.altova.io.FileOutput output2Target = new com.altova.io.FileOutput(output2TargetFilename);

		// run
	
		run(input2Source, output2Target);

		// close source streams
		input2Source.close();
		// close target stream
		writeTrace("Saving " + output2TargetFilename + "...\n");
		output2Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input input2Source, com.altova.io.Output output2Target) throws Exception {
		// Open the source(s)
	        varinput2Instance = com.altova.functions.Json.Load(input2Source, MapForceJsonLibs_input.Schemas, false);

		// Create the target

		// Execute mapping

		main mapping = new main(varinput2Instance);

           com.altova.functions.Json.Write(mapping, output2Target, true, false);
		// Close the target

		
		if (runDoesCloseAll)
		{
		}
	}



}
