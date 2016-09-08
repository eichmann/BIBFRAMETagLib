package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleIsPreferredTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleIsPreferredTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleIsPreferredTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleIsPreferredTitleOfIterator theRunningTitleIsPreferredTitleOfIterator = (RunningTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, RunningTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theRunningTitleIsPreferredTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

