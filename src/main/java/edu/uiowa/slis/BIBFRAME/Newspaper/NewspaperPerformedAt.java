package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperPerformedAtIterator theNewspaperPerformedAtIterator = (NewspaperPerformedAtIterator)findAncestorWithClass(this, NewspaperPerformedAtIterator.class);
			pageContext.getOut().print(theNewspaperPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

