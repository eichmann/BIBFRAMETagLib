package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperAccompaniedByIterator theNewspaperAccompaniedByIterator = (NewspaperAccompaniedByIterator)findAncestorWithClass(this, NewspaperAccompaniedByIterator.class);
			pageContext.getOut().print(theNewspaperAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

