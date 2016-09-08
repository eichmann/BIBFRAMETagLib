package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperSupplementsIterator theNewspaperSupplementsIterator = (NewspaperSupplementsIterator)findAncestorWithClass(this, NewspaperSupplementsIterator.class);
			pageContext.getOut().print(theNewspaperSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for supplements tag ");
		}
		return SKIP_BODY;
	}
}

