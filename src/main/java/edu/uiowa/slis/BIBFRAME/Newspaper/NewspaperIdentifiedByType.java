package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIdentifiedByIterator theNewspaperIdentifiedByIterator = (NewspaperIdentifiedByIterator)findAncestorWithClass(this, NewspaperIdentifiedByIterator.class);
			pageContext.getOut().print(theNewspaperIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

