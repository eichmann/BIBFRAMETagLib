package edu.uiowa.slis.BIBFRAME.SubTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubTitleElementIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SubTitleElementIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SubTitleElementIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubTitleElementIsPartOfIterator theSubTitleElementIsPartOfIterator = (SubTitleElementIsPartOfIterator)findAncestorWithClass(this, SubTitleElementIsPartOfIterator.class);
			pageContext.getOut().print(theSubTitleElementIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing SubTitleElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubTitleElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

