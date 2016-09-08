package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BinderTitleHasSourceStatusIterator theBinderTitleHasSourceStatusIterator = (BinderTitleHasSourceStatusIterator)findAncestorWithClass(this, BinderTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theBinderTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

