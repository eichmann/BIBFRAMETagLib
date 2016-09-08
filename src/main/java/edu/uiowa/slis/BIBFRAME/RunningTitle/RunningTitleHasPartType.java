package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleHasPartIterator theRunningTitleHasPartIterator = (RunningTitleHasPartIterator)findAncestorWithClass(this, RunningTitleHasPartIterator.class);
			pageContext.getOut().print(theRunningTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

