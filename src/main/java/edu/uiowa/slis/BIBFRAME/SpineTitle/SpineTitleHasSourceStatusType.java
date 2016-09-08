package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleHasSourceStatusIterator theSpineTitleHasSourceStatusIterator = (SpineTitleHasSourceStatusIterator)findAncestorWithClass(this, SpineTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theSpineTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

