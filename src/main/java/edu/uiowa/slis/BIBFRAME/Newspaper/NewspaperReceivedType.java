package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperReceivedIterator theNewspaperReceivedIterator = (NewspaperReceivedIterator)findAncestorWithClass(this, NewspaperReceivedIterator.class);
			pageContext.getOut().print(theNewspaperReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for received tag ");
		}
		return SKIP_BODY;
	}
}

