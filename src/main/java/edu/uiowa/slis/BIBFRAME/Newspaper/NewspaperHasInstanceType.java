package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasInstanceIterator theNewspaperHasInstanceIterator = (NewspaperHasInstanceIterator)findAncestorWithClass(this, NewspaperHasInstanceIterator.class);
			pageContext.getOut().print(theNewspaperHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

