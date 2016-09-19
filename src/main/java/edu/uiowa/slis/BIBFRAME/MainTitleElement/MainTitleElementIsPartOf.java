package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MainTitleElementIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElementIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElementIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (MainTitleElementIsPartOfIterator)findAncestorWithClass(this, MainTitleElementIsPartOfIterator.class);
			pageContext.getOut().print(theMainTitleElementIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

