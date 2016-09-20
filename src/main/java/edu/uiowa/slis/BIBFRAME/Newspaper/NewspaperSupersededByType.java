package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSupersededByIterator theNewspaperSupersededByIterator = (NewspaperSupersededByIterator)findAncestorWithClass(this, NewspaperSupersededByIterator.class);
			pageContext.getOut().print(theNewspaperSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

