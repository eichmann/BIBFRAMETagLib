package edu.uiowa.slis.BIBFRAME.SubTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubTitleElementIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SubTitleElementIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SubTitleElementIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubTitleElementIsPartOfIterator theSubTitleElementIsPartOfIterator = (SubTitleElementIsPartOfIterator)findAncestorWithClass(this, SubTitleElementIsPartOfIterator.class);
			pageContext.getOut().print(theSubTitleElementIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

