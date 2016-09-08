package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleIsPreferredTitleOfIterator theBinderTitleIsPreferredTitleOfIterator = (BinderTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, BinderTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theBinderTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

