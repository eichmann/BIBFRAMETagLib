package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperFrequencyIterator theNewspaper = (NewspaperFrequencyIterator)findAncestorWithClass(this, NewspaperFrequencyIterator.class);
			pageContext.getOut().print(theNewspaper.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for frequency tag ");
		}
		return SKIP_BODY;
	}
}

