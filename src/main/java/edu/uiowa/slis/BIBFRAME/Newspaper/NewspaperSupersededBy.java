package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSupersededByIterator theNewspaperSupersededByIterator = (NewspaperSupersededByIterator)findAncestorWithClass(this, NewspaperSupersededByIterator.class);
			pageContext.getOut().print(theNewspaperSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

