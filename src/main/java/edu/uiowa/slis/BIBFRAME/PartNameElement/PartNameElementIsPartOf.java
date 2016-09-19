package edu.uiowa.slis.BIBFRAME.PartNameElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PartNameElementIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNameElementIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNameElementIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PartNameElementIsPartOfIterator thePartNameElementIsPartOfIterator = (PartNameElementIsPartOfIterator)findAncestorWithClass(this, PartNameElementIsPartOfIterator.class);
			pageContext.getOut().print(thePartNameElementIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PartNameElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PartNameElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

