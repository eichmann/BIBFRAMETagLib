package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleName currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TitleNameIterator theTitle = (TitleNameIterator)findAncestorWithClass(this, TitleNameIterator.class);
			pageContext.getOut().print(theTitle.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for name tag ");
		}
		return SKIP_BODY;
	}
}

