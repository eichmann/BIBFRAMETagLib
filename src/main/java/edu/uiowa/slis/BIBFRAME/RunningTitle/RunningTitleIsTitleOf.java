package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleIsTitleOfIterator theRunningTitleIsTitleOfIterator = (RunningTitleIsTitleOfIterator)findAncestorWithClass(this, RunningTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theRunningTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

