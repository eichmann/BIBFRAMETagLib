package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleIsPreferredTitleOfIterator theBinderTitleIsPreferredTitleOfIterator = (BinderTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, BinderTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theBinderTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

