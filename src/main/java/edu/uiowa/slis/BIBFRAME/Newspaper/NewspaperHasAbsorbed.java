package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasAbsorbedIterator theNewspaperHasAbsorbedIterator = (NewspaperHasAbsorbedIterator)findAncestorWithClass(this, NewspaperHasAbsorbedIterator.class);
			pageContext.getOut().print(theNewspaperHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

