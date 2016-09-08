package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleHasSourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleHasSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleHasSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleHasSourceStatusIterator theRunningTitleHasSourceStatusIterator = (RunningTitleHasSourceStatusIterator)findAncestorWithClass(this, RunningTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theRunningTitleHasSourceStatusIterator.getHasSourceStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

