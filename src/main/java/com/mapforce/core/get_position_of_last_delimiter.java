/**
 * core/get_position_of_last_delimiter.java
 *
 * This file was generated by MapForce 2019.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce.core;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import java.util.*;

public class get_position_of_last_delimiter extends com.altova.TraceProvider 
{

	
	static class main implements IEnumerable
	{
		java.lang.String var1_filepath;
		java.lang.String var2_delimiter1;
		java.lang.String var3_delimiter2;
	
		public main(java.lang.String var1_filepath, java.lang.String var2_delimiter1, java.lang.String var3_delimiter2)
		{
			this.var1_filepath = var1_filepath;
			this.var2_delimiter1 = var2_delimiter1;
			this.var3_delimiter2 = var3_delimiter2;
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
					case 3:	if (moveNext_3()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.logicalOr(com.altova.functions.Core.equal(com.altova.functions.Core.substring(closure.var1_filepath, com.altova.CoreTypes.integerToDouble(com.altova.CoreTypes.longToInteger(com.altova.CoreTypes.intToLong(com.altova.functions.Core.stringLength(closure.var1_filepath)))), com.altova.CoreTypes.parseDouble("1")), closure.var2_delimiter1), com.altova.functions.Core.equal(com.altova.functions.Core.substring(closure.var1_filepath, com.altova.CoreTypes.integerToDouble(com.altova.CoreTypes.longToInteger(com.altova.CoreTypes.intToLong(com.altova.functions.Core.stringLength(closure.var1_filepath)))), com.altova.CoreTypes.parseDouble("1")), closure.var3_delimiter2)))) {state = 3; return false; }
				current = com.altova.CoreTypes.integerToDecimal(com.altova.CoreTypes.longToInteger(com.altova.CoreTypes.intToLong(com.altova.functions.Core.stringLength(closure.var1_filepath))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				current = com.mapforce.core.get_position_of_last_delimiter_recursive.eval(closure.var1_filepath, com.altova.CoreTypes.integerToDecimal(com.altova.CoreTypes.longToInteger(com.altova.CoreTypes.intToLong(com.altova.functions.Core.stringLength(closure.var1_filepath)))), closure.var2_delimiter1, closure.var3_delimiter2);
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



	// instances


	public static IEnumerable create(java.lang.String var1_filepath, java.lang.String var2_delimiter1, java.lang.String var3_delimiter2)
	{
		return new main(
			var1_filepath,
			var2_delimiter1,
			var3_delimiter2
			);

	}
	

	public static java.math.BigDecimal eval(java.lang.String var1_filepath, java.lang.String var2_delimiter1, java.lang.String var3_delimiter2) throws java.lang.Exception
	{

		com.altova.mapforce.IEnumerator e = create(var1_filepath,var2_delimiter1,var3_delimiter2).enumerator();
		if (e.moveNext())
		{
			java.math.BigDecimal result = ((java.math.BigDecimal)e.current());
			e.close();
			return result;
		}
		e.close();
		throw new com.altova.AltovaException("Expected a function result.");		
	
	}

}
