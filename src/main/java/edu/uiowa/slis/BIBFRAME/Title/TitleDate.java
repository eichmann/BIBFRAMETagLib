package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleDate currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TitleDateIterator theTitle = (TitleDateIterator)findAncestorWithClass(this, TitleDateIterator.class);
			pageContext.getOut().print(theTitle.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for date tag ");
		}
		return SKIP_BODY;
	}
}

