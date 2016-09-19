package edu.uiowa.slis.BIBFRAME.PartNumberElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNumberElementIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNumberElementIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNumberElementIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PartNumberElementIsPartOfIterator thePartNumberElementIsPartOfIterator = (PartNumberElementIsPartOfIterator)findAncestorWithClass(this, PartNumberElementIsPartOfIterator.class);
			pageContext.getOut().print(thePartNumberElementIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PartNumberElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNumberElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

