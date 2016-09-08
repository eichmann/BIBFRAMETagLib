package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpineTitleHasSourceStatusIterator theSpineTitleHasSourceStatusIterator = (SpineTitleHasSourceStatusIterator)findAncestorWithClass(this, SpineTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theSpineTitleHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

