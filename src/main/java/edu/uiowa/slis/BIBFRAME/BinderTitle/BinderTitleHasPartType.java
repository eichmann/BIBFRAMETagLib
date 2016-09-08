package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleHasPartIterator theBinderTitleHasPartIterator = (BinderTitleHasPartIterator)findAncestorWithClass(this, BinderTitleHasPartIterator.class);
			pageContext.getOut().print(theBinderTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

