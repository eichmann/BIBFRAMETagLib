package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(TextFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextFrequencyIterator theText = (TextFrequencyIterator)findAncestorWithClass(this, TextFrequencyIterator.class);
			pageContext.getOut().print(theText.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for frequency tag ");
		}
		return SKIP_BODY;
	}
}

