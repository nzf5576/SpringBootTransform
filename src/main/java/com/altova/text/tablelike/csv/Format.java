////////////////////////////////////////////////////////////////////////
//
// Format.java
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

package com.altova.text.tablelike.csv;

public class Format {
    private char m_FieldDelimiter = ',';

    private final char[] m_RecordDelimiters = new char[] { '\r', '\n' };

	private String m_lineEnd;

    private char m_QuoteCharacter = '\0';

    private char[] m_QuoteNeedingCharacters = new char[4];

    private boolean m_AssumeFirstRowAsHeaders = true;

    private boolean m_ExpectQuoteCharacters = false;

	private boolean m_RemoveEmpty = true;

	private boolean m_AlwaysQuote = false;

    private void updateQuoteNeedingCharacters() {
        for (int i = 0; i < 2; ++i)
            m_QuoteNeedingCharacters[i] = m_RecordDelimiters[i];
        m_QuoteNeedingCharacters[2] = m_FieldDelimiter;
        m_QuoteNeedingCharacters[3] = m_QuoteCharacter;
    }

    public Format(int lineEnd) {
        this.updateQuoteNeedingCharacters();
		switch(lineEnd)
		{
			case 0: this.m_lineEnd = java.lang.System.getProperty("line.separator"); break;
			case 1: this.m_lineEnd = "\r\n"; break;
			case 2: this.m_lineEnd = "\n"; break;
			case 3: this.m_lineEnd = "\r"; break;
			default: this.m_lineEnd = "\r\n"; break;
		}
    }

    public void setAssumeFirstRowAsHeaders(boolean rhs) {
        m_AssumeFirstRowAsHeaders = rhs;
    }

    public boolean doAssumeFirstRowAsHeaders() {
        return m_AssumeFirstRowAsHeaders;
    }

	public void setRemoveEmpty(boolean rhs) {
		m_RemoveEmpty = rhs;
	}

	public boolean getRemoveEmpty() {
		return m_RemoveEmpty;
	}

    public char[] getRecordDelimiters() {
        return m_RecordDelimiters;
    }

	public String getLineEnd() {
		return m_lineEnd;
	}

    public char[] getQuoteNeedingCharacters() {
        return m_QuoteNeedingCharacters;
    }

    public void setFieldDelimiter(char rhs) {
        m_FieldDelimiter = rhs;
        this.updateQuoteNeedingCharacters();
    }

    public char getFieldDelimiter() {
        return m_FieldDelimiter;
    }

    public void setQuoteCharacter(char rhs) {
        m_ExpectQuoteCharacters = rhs != '\0';
        m_QuoteCharacter = rhs;
        this.updateQuoteNeedingCharacters();
    }

    public char getQuoteCharacter() {
        return m_QuoteCharacter;
    }

    public boolean isFieldDelimiter(char rhs) {
        return (rhs == m_FieldDelimiter);
    }

    public boolean isRecordDelimiter(char rhs) {
        for (int i = 0; i < m_RecordDelimiters.length; ++i)
            if (rhs == m_RecordDelimiters[i])
                return true;
        return false;
    }

    public boolean isQuoteCharacter(char rhs) {
        return (m_ExpectQuoteCharacters && (rhs == m_QuoteCharacter));
    }

	public void setAlwaysQuote(boolean always) {
		m_AlwaysQuote = always;
	}

	public boolean IsAlwaysQuote() {
		return m_AlwaysQuote;
	}

    public String quoteString(String rhs) {
        if (!m_ExpectQuoteCharacters)
            return rhs;
        StringBuilder sbResult = new StringBuilder(rhs.length() + 50);
        sbResult.append(m_QuoteCharacter);
        for (int i = 0; i < rhs.length(); ++i) {
            final char c = rhs.charAt(i);
            sbResult.append(c);
            if (c == m_QuoteCharacter)
                sbResult.append(c);
        }
        sbResult.append(m_QuoteCharacter);
        return sbResult.toString();
    }
}
