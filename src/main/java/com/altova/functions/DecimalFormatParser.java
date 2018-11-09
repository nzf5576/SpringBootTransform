////////////////////////////////////////////////////////////////////////
//
// DecimalFormatParser.java
//
// This file was generated by MapForce 2019.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////


package com.altova.functions;

import java.math.BigDecimal;

public class DecimalFormatParser {

	public class DecimalFormat
	{
		public DecimalFormat() {
			msName = "";

			// decimal-separator specifies the character used for the decimal sign; the default value is the period character (.)
			mcDecimalSeparator = '.';

			// grouping-separator specifies the character used as a grouping (e.g. thousands) separator; the default value is the comma character (,)
			mcGroupingSeparator = ',';

			// percent specifies the character used as a percent sign; the default value is the percent character (%)
			mcPercent = '%';

			// per-mille specifies the character used as a per mille sign; the default value is the Unicode per-mille character (#x2030)
			mcPerMille = 0x2030;

			// zero-digit specifies the character used as the digit zero; the default value is the digit zero (0)
			mcZeroDigit = '0';

			// The following attributes control the interpretation of characters in the format pattern:

			// digit specifies the character used for a digit in the format pattern; the default value is the number sign character (#)
			mcDigit = '#';

			// pattern-separator specifies the character used to separate positive and negative sub patterns in a pattern; the default value is the semi-colon character (;)
			mcPatternSeparator = ';';

			// The following attributes specify characters or strings that may appear in the result of formatting the number:

			// infinity specifies the string used to represent infinity; the default value is the string Infinity 
			msInfinity = "Infinity";

			// NaN specifies the string used to represent the NaN value; the default value is the string NaN 
			msNaN = "NaN";

			// minus-sign specifies the character used as the default minus sign; the default value is the hyphen-minus character (-, #x2D)
			mcMinusSign = '-';
		}

		public String GetName() { return msName; }
		public void SetName( final String sName ) { msName = sName; }

		public char GetDecimalSeparator() {	return mcDecimalSeparator;	}
		public void SetDecimalSeparator( char cDecimalSeparator ) 
			{ mcDecimalSeparator = cDecimalSeparator; }

		public char GetGroupingSeparator() {	return mcGroupingSeparator; }
		public void SetGroupingSeparator( char cGroupingSeparator )
			{ mcGroupingSeparator = cGroupingSeparator; }

		public String GetInfinity() { return msInfinity; }
		public void SetInfinity( String sInfinity )
			{ msInfinity = sInfinity; }

		public char GetMinusSign() { return mcMinusSign; }
		public void SetMinusSign( char cMinusSign )
			{ mcMinusSign = cMinusSign; }

		public String GetNaN() { return msNaN; }
		public void SetNaN( String sNaN ) { msNaN = sNaN; }

		public char GetPercent() { return mcPercent; }
		public void SetPercent( char cPercent ) { mcPercent = cPercent; }

		public char GetPerMille() { return mcPerMille; }
		public void SetPerMille( char cPerMille ) { mcPerMille = cPerMille;	}

		public char GetZeroDigit() { return mcZeroDigit; }
		public void SetZeroDigit( char cZeroDigit ) { mcZeroDigit = cZeroDigit; }

		public char GetDigit() { return mcDigit; }
		public void SetDigit( char cDigit ) { mcDigit = cDigit; }

		public char GetPatternSeparator() { return mcPatternSeparator; }
		public void SetPatternSeparator( char cPatternSeparator ) 
			{ mcPatternSeparator = cPatternSeparator; }

		public boolean HasDistinctValues()
		{
			if ( mcDecimalSeparator == mcGroupingSeparator || mcDecimalSeparator == mcPercent ||
				mcDecimalSeparator == mcPerMille || mcDecimalSeparator == mcZeroDigit ||
				mcDecimalSeparator == mcDigit || mcDecimalSeparator == mcPatternSeparator )
			{
				return false;
			}
			else if ( mcGroupingSeparator == mcPercent || mcGroupingSeparator == mcPerMille ||
				mcGroupingSeparator == mcZeroDigit || mcGroupingSeparator == mcDigit ||
				mcGroupingSeparator == mcPatternSeparator )
			{
				return false;
			} 
			else if ( mcPercent == mcPerMille || mcPercent == mcZeroDigit || mcPercent == mcDigit ||
				mcPercent == mcPatternSeparator )
			{
				return false;
			}
			else if ( mcPerMille == mcZeroDigit || mcPerMille == mcDigit || mcPerMille == mcPatternSeparator )
			{
				return false;
			}
			else if ( mcZeroDigit == mcDigit || mcZeroDigit == mcPatternSeparator )
			{
				return false;	
			}
			else if ( mcDigit == mcPatternSeparator )
			{
				return false;
			}
			return true;
		}

		//MapForceDecimalFormat& operator=( const MapForceDecimalFormat& rRight );
		//boolean operator==( const MapForceDecimalFormat& rRight ) const;

		protected String			msName;					// = qname 
		protected char				mcDecimalSeparator;		// = char 
		protected char				mcGroupingSeparator;	// = char 
		protected String			msInfinity;				// = string 
		protected char				mcMinusSign;			// = char 
		protected String			msNaN;					// = string 
		protected char				mcPercent;				// = char 
		protected char				mcPerMille;				// = char 
		protected char				mcZeroDigit;			// = char 
		protected char				mcDigit;				// = char 
		protected char				mcPatternSeparator;		// = char
	};
	
	protected class Format
	{
		public Format()
		{
			Reset();
		}

		private void Reset()
		{
			mbPrefix = false;
			mbSuffix = false;
			mbDecimalSeperator = false;
			mnNonZeroDigits = 0;			// #
			mnZeroDigits = 0;				// 0
			mnNonZeroDigitsFraction = 0;	// #
			mnZeroDigitsFraction = 0;		// 0
			mnGroupSpace = 0;				// ,
			mbGroup = false;
			mcDecimal = '.';
			mcSign = '-';
			mbPercent = false;
			mbPerMille = false;
		}

		boolean mbPrefix;
		boolean mbSuffix;
		boolean mbDecimalSeperator;
		int mnNonZeroDigits;			// #
		int mnZeroDigits;				// 0
		int mnNonZeroDigitsFraction;	// #
		int mnZeroDigitsFraction;		// 0
		int mnGroupSpace;				// ,
		boolean mbGroup;
		char mcSuffix;
		char	mcDecimal;
		char	mcSign;
		boolean mbPercent;
		boolean mbPerMille;
	}
	
	public DecimalFormatParser()
	{ 
		mDecimalFormat = null;
		mbNegativePattern = false;
		mbHasMinusSign = false;
	};

	public boolean setPattern ( final String sExpr, DecimalFormat format)
	{
		return setPattern( sExpr, format, false);
	}

	public boolean setPattern ( final String sExpr, DecimalFormat format, boolean bTrim )
	{
		StringBuffer sPattern = new StringBuffer(sExpr);
		if ( format == null )
			return false;

		msPrefixText = "";
		msSuffixText = "";
		msNegPrefixText = "";
		msNegSuffixText = "";

		mNegativeFormat = new Format();
		mPositiveFormat = new Format();
		mbNegativePattern = false;

		mFormat = mPositiveFormat;

		mDecimalFormat = format;

		boolean bRet = pattern( sPattern, bTrim );

		if ( sPattern.length() > 0 )
			bRet = false;

		return bRet;
	}

	String GetPrefixText() { return msPrefixText; }
	String GetSuffixText() { return msSuffixText; }

	protected boolean addMinusSignIfAllowed(char cCurrent)
	{
		if ( ( mbHasMinusSign == false )
			&& ( cCurrent == mDecimalFormat.GetMinusSign() ) )
		{
			mbHasMinusSign = mbNegativePattern;
			return true;
		}
		return false;
	}
	
	protected boolean pattern ( StringBuffer sExpr, boolean bTrim )
	{
		if( bTrim )
		{
			Lang.trimLeft( sExpr, "\t ");
		}
		if ( sExpr.length() == 0 )
			return false;

		msPrefixText = "";
		msSuffixText = "";

		if( !subPattern( sExpr ) )
			return false;

		if( bTrim )
			msSuffixText = Lang.rightTrim(msSuffixText);
		
		if ( sExpr.length() > 0 )
		{
			if( sExpr.charAt(0) == mDecimalFormat.GetPatternSeparator() )
				sExpr.delete(0, 1);
			else
				return true;
	
			mbNegativePattern = true;
			mFormat = mNegativeFormat;
			
         	if( bTrim )
         	{
         		Lang.trimLeft( sExpr, "\t ");
         		Lang.trimRight( sExpr, "\t ");
         	}
			return subPattern( sExpr );
		}

		return true;
	}
	
	protected boolean subPattern ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;


		prefixText( sExpr );	

		prefix( sExpr );
		
		if( !integer( sExpr ) )
			return false;

		if( sExpr.length() > 0 && sExpr.charAt(0) == mDecimalFormat.GetDecimalSeparator() )
		{
			mFormat.mbDecimalSeperator = true;

			sExpr.delete(0, 1);

			if( !fraction( sExpr ) )
				return false;
		}
		
		suffix( sExpr );
		suffixText( sExpr );

		return true;
	}
	
	protected boolean prefix ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		if ( sExpr.charAt(0) == mDecimalFormat.GetPercent() ) 
		{
			sExpr.delete(0, 1);
			mFormat.mbPrefix = true;
			mFormat.mbPercent = true;
			mFormat.mbPerMille = false;
			return true;
		}
		else if ( sExpr.charAt(0) == mDecimalFormat.GetPerMille() ) 
		{
			sExpr.delete(0, 1);
			mFormat.mbPrefix = true;
			mFormat.mbPercent = false;
			mFormat.mbPerMille = true;
			return true;
		}

		return false;
	}
	
	protected boolean prefixText ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		boolean bInQuotes = false;
		int i = 0;
		int nLength = sExpr.length();
		while ( ( i < nLength ) && ( bInQuotes || notSpecialChar(sExpr.charAt(i)) || addMinusSignIfAllowed(sExpr.charAt(i)) ) )
		{
			if ( sExpr.charAt(i) == '\'' )
			{
				i++;
				
				if ( i < nLength )
				{
					bInQuotes = !bInQuotes;
					break;
				}
				else if ( sExpr.charAt(i) != '\'' )
					bInQuotes = !bInQuotes;
			}
			
			if( mbNegativePattern )
				msNegPrefixText += sExpr.charAt(i);
			else
				msPrefixText += sExpr.charAt(i);

			i++;
		}
		
		sExpr.delete(0, i);
		return !bInQuotes;
	}
	
	protected boolean integer ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		char cLast = mDecimalFormat.GetZeroDigit();

		// how many Non Zero Digits
		int i = 0;
		int nLength = sExpr.length();
		while ( ( i < nLength ) && ( ( sExpr.charAt(i) == mDecimalFormat.GetDigit() ) || ( sExpr.charAt(i) == mDecimalFormat.GetGroupingSeparator() ) ) )
		{
			if ( sExpr.charAt(i) == mDecimalFormat.GetGroupingSeparator() )
			{
				mFormat.mnGroupSpace = 0;
				mFormat.mbGroup = true;
			}
			else
			{
				mFormat.mnGroupSpace++;
				mFormat.mnNonZeroDigits++;
			}

			cLast = sExpr.charAt(i);
			i++;
		}

		/* java 1.1.8  needs this but every implementation allows formating without specifying the minlength 
		if ( ( **pszExpr != 0 ) && ( **pszExpr != m_pDecimalFormat->GetZeroDigit() ) )
		{
			return false;
		}*/

		// how many Zero Digits
		while ( ( i < nLength ) && ( ( sExpr.charAt(i) == mDecimalFormat.GetZeroDigit() ) || ( sExpr.charAt(i) == mDecimalFormat.GetGroupingSeparator() ) ))
		{
			if ( sExpr.charAt(i) == mDecimalFormat.GetGroupingSeparator() )
			{
				mFormat.mnGroupSpace = 0;
				mFormat.mbGroup = true;
			}
			else
			{
				mFormat.mnGroupSpace++;
				mFormat.mnZeroDigits++;
			}

			cLast = sExpr.charAt(i);

			i++;
		}
		sExpr.delete(0, i);

		if ( cLast == mDecimalFormat.GetGroupingSeparator() ) 
			return false;
		else
			return true;
	}
	
	protected boolean fraction ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		// how many Zero Digits in the fraction
		int i = 0;
		int nLength = sExpr.length();
		while ( ( i < nLength ) && ( sExpr.charAt(i) == mDecimalFormat.GetZeroDigit() ) )
		{
			mFormat.mnZeroDigitsFraction++;
			i++;
		}

		// how many Non Zero Digits
		while ( ( i < nLength ) && ( sExpr.charAt(i) == mDecimalFormat.GetDigit() ) )
		{
			mFormat.mnNonZeroDigitsFraction++;
			i++;
		}
		sExpr.delete(0, i);

		return true;
	}
	
	protected boolean suffix ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		if( sExpr.charAt(0) > 0xFFFD )
			return false;

		if ( sExpr.charAt(0) == mDecimalFormat.GetPercent() ) 
		{
			sExpr.delete(0, 1);
			mFormat.mbSuffix = true;
			mFormat.mbPercent = true;
			mFormat.mbPerMille = false;
			return true;
		}
		else if ( sExpr.charAt(0) == mDecimalFormat.GetPerMille() ) 
		{
			sExpr.delete(0, 1);
			mFormat.mbSuffix = true;
			mFormat.mbPercent = false;
			mFormat.mbPerMille = true;
			return true;
		}

		return false;
	}
	
	protected boolean suffixText ( StringBuffer sExpr )
	{
		if ( sExpr.length() == 0 )
			return false;

		boolean bInQuotes = false;
		int i = 0;
		int nLength = sExpr.length();
		while ( ( i < nLength ) && ( bInQuotes || notSpecialChar( sExpr.charAt(i) ) || addMinusSignIfAllowed( sExpr.charAt(i) ) ) )
		{
			if ( sExpr.charAt(i) == '\'' )
			{
				i++;
				
				if ( i < nLength )
				{
					bInQuotes = !bInQuotes;
					break;
				}
				else if ( sExpr.charAt(i) != '\'' )
				{
					bInQuotes = !bInQuotes;
				}
			}
			if( mbNegativePattern )
				msNegSuffixText += sExpr.charAt(i);
			else
				msSuffixText += sExpr.charAt(i);
			i++;
		}
		sExpr.delete(0, i);
		return !bInQuotes;
	}
	
	protected boolean notSpecialChar ( final char cChar )
	{
		if ( cChar == mDecimalFormat.GetDecimalSeparator() )	return false;
		else if ( cChar == mDecimalFormat.GetDigit() )			return false;
		else if ( cChar == mDecimalFormat.GetGroupingSeparator())return false;
		else if ( cChar == mDecimalFormat.GetMinusSign() )		return false;
		else if ( cChar == mDecimalFormat.GetPatternSeparator() )return false;
		else if ( cChar == mDecimalFormat.GetZeroDigit() )		return false;
		else if ( cChar == mDecimalFormat.GetPercent() )		return false;
		else if ( cChar == mDecimalFormat.GetPerMille() )		return false;

		return true;
	}
	
	protected String roundHalfUp( final BigDecimal fvalue, final int precision )
	{
		return fvalue.setScale(precision, java.math.RoundingMode.HALF_UP).toString();
	}
	
	public String formatNumber ( BigDecimal nNumber )
	{
		StringBuffer sbFormat = new StringBuffer("");

		if ( mDecimalFormat == null )
			return sbFormat.toString();

		Double nCheck = java.lang.Double.valueOf(nNumber.doubleValue() );
		if( nCheck.isInfinite() )
		{
			if( Double.POSITIVE_INFINITY == nCheck)
				return mDecimalFormat.GetInfinity();
			else
			{
				sbFormat.append( mDecimalFormat.GetMinusSign() );
				sbFormat.append( mDecimalFormat.GetInfinity() );
				return sbFormat.toString();
			}
		}
		if( nCheck.isNaN() )
			return mDecimalFormat.GetNaN();

		//if ( ICUnicode::IsLetter( m_pDecimalFormat->GetZeroDigit() ) )
		//{
		//	m_nDigitTranslation = m_pDecimalFormat->GetZeroDigit() - _T('0');
		//}
		//else
		{
			mnDigitTranslation = 0;
		}
		
		if ( mFormat.mbPercent )
			nNumber = nNumber.multiply( new BigDecimal( 100 ) );
		else if ( mFormat.mbPerMille )
			nNumber = nNumber.multiply( new BigDecimal( 1000) );

		if ( ( nNumber.signum() == -1 ) && mbNegativePattern )
			mFormat = mNegativeFormat;
		else
			mFormat = mPositiveFormat;

		mFormat.mcDecimal = 0;
		mFormat.mcSign = 0;

		int iSign = 0;
		int iDecimalPos = -1;

		StringBuffer sbRight = new StringBuffer();
		StringBuffer sbLeft = new StringBuffer();

		StringBuffer sNumber = new StringBuffer(
				roundHalfUp( nNumber, 
					mFormat.mnZeroDigitsFraction + mFormat.mnNonZeroDigitsFraction
				)
			);

		iDecimalPos = sNumber.indexOf( "." );
		if( iDecimalPos >= 0 )
			sNumber.delete( iDecimalPos, iDecimalPos + 1);
		else
		{
			if( sNumber.toString().equals( "0" ) || sNumber.toString().equals( "-0" ) ) //special case for 0
				iDecimalPos = 0;
			else
				iDecimalPos = sNumber.length();
		}

		if( nNumber.signum() == -1)
		{
			iSign = sNumber.indexOf( "-" );
			sNumber.delete(iSign, iSign + 1);
			iSign = 1;
			iDecimalPos--;
		}
		else
			iSign = 0;

		if ( iDecimalPos <= 0 )
		{
			// add preceding number of 0s
			int iAbsDecimalPos = Math.abs( iDecimalPos );
			for( int i = 0; i < iAbsDecimalPos; i++) sbRight.append('0');

			sbRight.append( sNumber );
		}
		else
		{
			sbLeft.append( sNumber.substring( 0, iDecimalPos ) );
			sbRight.append( sNumber.substring( iDecimalPos ) );
		}

		// remove extra zero padding off the end
		int nLastZero = sbRight.length();
		while( nLastZero > 0 && sbRight.charAt(nLastZero - 1) == '0') 
			nLastZero--;
		//int nLastZero = sbRight.ReverseFindOneNotOf( _T("0") ) + 1;
		if( nLastZero >= 0 && nLastZero < sbRight.length())
			sbRight.delete( nLastZero, sbRight.length() );

		// now add correct amount
		int iRightLen = sbRight.length();
		if ( iRightLen < mFormat.mnZeroDigitsFraction )
			for( int i = 0; i < mFormat.mnZeroDigitsFraction - iRightLen; i++) sbRight.append('0');

		// prefix zero padding if needed
		Lang.trimLeft(sbLeft, "0");
		int iLeftLen = sbLeft.length();
		if ( iLeftLen < mFormat.mnZeroDigits )
		{
			int iPadSize = mFormat.mnZeroDigits - iLeftLen;
			for( int i = 0; i < iPadSize; i++) sbLeft.insert(0, '0');
		}

		// translate left and right sides
		for( int i = 0; i < sbLeft.length(); ++i)
			sbLeft.setCharAt(i, (char)(sbLeft.charAt(i) + mnDigitTranslation) );

		for( int i = 0; i < sbRight.length(); ++i)
			sbRight.setCharAt(i, (char)(sbRight.charAt(i) + mnDigitTranslation) );
		
		// do the grouping, ','
		if ( ( mFormat.mbGroup ) && ( mFormat.mnGroupSpace > 0 ) && ( sbLeft.length() > mFormat.mnGroupSpace ) )
		{
			String sTemp = "";
			char cFormat = mDecimalFormat.GetGroupingSeparator();

			int niLeftPos = 0;
			int nFirstGroupPos = sbLeft.length() % mFormat.mnGroupSpace;
			
			if ( nFirstGroupPos > 0 )
			{
				sTemp = sbLeft.substring( 0, nFirstGroupPos );
				niLeftPos = nFirstGroupPos;
				sTemp += cFormat;
			}

			while( niLeftPos < sbLeft.length() )
			{
				sTemp += sbLeft.substring( niLeftPos, niLeftPos + mFormat.mnGroupSpace );
				niLeftPos += mFormat.mnGroupSpace;

				if ( niLeftPos < sbLeft.length() )
					sTemp += cFormat;
			}
			sbLeft = new StringBuffer(sTemp);
		}

		// start to assemble the string in sFormat
		sbFormat = new StringBuffer();

		// add the sign
		if ( !mbNegativePattern && ( iSign != 0 ) )
			sbFormat.append( mDecimalFormat.GetMinusSign() );

		// add the prefix
		if ( mFormat.mbPrefix )
		{
			if ( mFormat.mbPercent )
				sbFormat.append( mDecimalFormat.GetPercent() );
			else if ( mFormat.mbPerMille )
				sbFormat.append( mDecimalFormat.GetPerMille() );
		}

		// prefix text
		if ( ( nNumber.signum() != -1 ) || !mbNegativePattern )
			sbFormat.append( msPrefixText );
		else
			sbFormat.append( msNegPrefixText );

		// add the left side
		sbFormat.append( sbLeft );
		
		if ( mFormat.mbDecimalSeperator && sbRight.length() > 0 )
		{
			sbFormat.append( mDecimalFormat.GetDecimalSeparator() );
			sbFormat.append( sbRight );
		}

		// add the suffix
		if ( mFormat.mbSuffix )
		{
			if ( mFormat.mbPercent )
				sbFormat.append( mDecimalFormat.GetPercent() );
			else if ( mFormat.mbPerMille )
				sbFormat.append( mDecimalFormat.GetPerMille() );
		}

		// suffix text
		if ( ( nNumber.signum() != -1 ) || !mbNegativePattern )
			sbFormat.append( msSuffixText );
		else
			sbFormat.append( msNegSuffixText );

		// if the zero digit or digit symbol is alpha translate the string

		return sbFormat.toString();
	}

	public BigDecimal parseNumber( String sNumber) {
		BigDecimal decimal;
		StringBuffer sReadInput = new StringBuffer(sNumber);
		String sUsedPrefixText = msPrefixText;
		String sUsedSuffixText = msSuffixText;
		boolean bIsNegative;
		Lang.trimLeft(sReadInput, " \t");
		Lang.trimRight(sReadInput, " \t");

		mFormat = mPositiveFormat;
		if( bIsNegative = isNegativeNumber(sReadInput.toString()) )
		{
			if( mbNegativePattern )
			{
				sUsedPrefixText = msNegPrefixText;
				sUsedSuffixText = msNegSuffixText;
				mFormat = mNegativeFormat;
			}
		}

		if( sUsedPrefixText.length() > 0 )
		{
			if( sReadInput.toString().startsWith( sUsedPrefixText ) )
				sReadInput.delete(0, sUsedPrefixText.length() );
			else
				throw new IllegalArgumentException(
					"Prefix doesn't match: '" + sUsedPrefixText + "'"
				);
		}

		if( sUsedSuffixText.length() > 0 )
		{
			if( sReadInput.toString().endsWith( sUsedSuffixText ) )
			{
				int startIndex = sReadInput.length() - sUsedSuffixText.length();
				sReadInput.delete( startIndex, startIndex + sUsedSuffixText.length() );
			}
			else
				throw new IllegalArgumentException(
					"Suffix doesn't match: '" + sUsedSuffixText + "'"
				);
		}

		String sInput = sReadInput.toString();
		if( mFormat.mbGroup )
		{
			sInput = sInput.replaceAll( mDecimalFormat.GetGroupingSeparator() + "", "");
		}

		//check if rest of string a valid number
		try {
			decimal = new BigDecimal(sInput);
		}
		catch (NumberFormatException e)
		{
			throw new IllegalArgumentException(
				"Value is not a number: '" + sInput + "'"
			);
		}

		if( bIsNegative && decimal.signum() >= 0 )
			decimal = decimal.negate();
		return decimal;
	}

	private boolean isNegativeNumber(String sNumber) {
		if( msNegPrefixText.length() > 0 && sNumber.startsWith( msNegPrefixText) )
		{
			if( msNegSuffixText.length() > 0 && sNumber.endsWith( msNegSuffixText) )
				return true;
		}
		else if( msPrefixText.length() > 0 && sNumber.startsWith(msPrefixText) )
		{
			if( sNumber.indexOf( mDecimalFormat.GetMinusSign(), msPrefixText.length() ) != -1 )
				return true;
			else
				return false;
		}
		else
		{
			int nMinusPos = sNumber.indexOf( mDecimalFormat.GetMinusSign() );
			if ( nMinusPos != -1 )
			{
				if ( nMinusPos == 0 )
					return true;
				char maybeE = sNumber.charAt( nMinusPos - 1 );
				if ( maybeE == 'E' || maybeE == 'e' )
					return false;

				return true;
			}
		}

		return false;
	}

	protected Format				mPositiveFormat;
	protected Format				mNegativeFormat;
	protected Format				mFormat;

	protected boolean				mbNegativePattern;
	protected boolean				mbHasMinusSign;
	protected DecimalFormat			mDecimalFormat;

	protected String				msPrefixText;
	protected String				msSuffixText;
	protected String				msNegPrefixText;
	protected String				msNegSuffixText;
	protected int					mnDigitTranslation;
}

