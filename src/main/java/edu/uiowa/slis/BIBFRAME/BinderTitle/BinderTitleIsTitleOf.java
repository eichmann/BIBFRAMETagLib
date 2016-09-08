package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleIsTitleOfIterator theBinderTitleIsTitleOfIterator = (BinderTitleIsTitleOfIterator)findAncestorWithClass(this, BinderTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theBinderTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

