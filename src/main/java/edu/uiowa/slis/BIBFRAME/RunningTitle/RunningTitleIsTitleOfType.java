package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleIsTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleIsTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleIsTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleIsTitleOfIterator theRunningTitleIsTitleOfIterator = (RunningTitleIsTitleOfIterator)findAncestorWithClass(this, RunningTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theRunningTitleIsTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

