package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperAbsorbedByIterator theNewspaperAbsorbedByIterator = (NewspaperAbsorbedByIterator)findAncestorWithClass(this, NewspaperAbsorbedByIterator.class);
			pageContext.getOut().print(theNewspaperAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

