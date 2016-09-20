package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperReceivedIterator theNewspaperReceivedIterator = (NewspaperReceivedIterator)findAncestorWithClass(this, NewspaperReceivedIterator.class);
			pageContext.getOut().print(theNewspaperReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for received tag ");
		}
		return SKIP_BODY;
	}
}

