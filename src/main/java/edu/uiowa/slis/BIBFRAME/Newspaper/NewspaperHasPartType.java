package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasPartIterator theNewspaperHasPartIterator = (NewspaperHasPartIterator)findAncestorWithClass(this, NewspaperHasPartIterator.class);
			pageContext.getOut().print(theNewspaperHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

