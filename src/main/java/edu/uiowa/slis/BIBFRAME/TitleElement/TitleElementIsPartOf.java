package edu.uiowa.slis.BIBFRAME.TitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleElementIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleElementIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleElementIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleElementIsPartOfIterator theTitleElementIsPartOfIterator = (TitleElementIsPartOfIterator)findAncestorWithClass(this, TitleElementIsPartOfIterator.class);
			pageContext.getOut().print(theTitleElementIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

