package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MainTitleElementIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElementIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElementIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (MainTitleElementIsPartOfIterator)findAncestorWithClass(this, MainTitleElementIsPartOfIterator.class);
			pageContext.getOut().print(theMainTitleElementIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

