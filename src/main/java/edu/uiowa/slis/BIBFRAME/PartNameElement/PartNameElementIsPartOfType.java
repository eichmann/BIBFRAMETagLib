package edu.uiowa.slis.BIBFRAME.PartNameElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNameElementIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNameElementIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNameElementIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PartNameElementIsPartOfIterator thePartNameElementIsPartOfIterator = (PartNameElementIsPartOfIterator)findAncestorWithClass(this, PartNameElementIsPartOfIterator.class);
			pageContext.getOut().print(thePartNameElementIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

