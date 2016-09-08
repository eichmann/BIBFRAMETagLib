package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleIsPreferredTitleOfIterator theRunningTitleIsPreferredTitleOfIterator = (RunningTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, RunningTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theRunningTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

