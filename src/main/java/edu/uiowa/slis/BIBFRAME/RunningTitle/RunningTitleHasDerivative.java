package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleHasDerivativeIterator theRunningTitleHasDerivativeIterator = (RunningTitleHasDerivativeIterator)findAncestorWithClass(this, RunningTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theRunningTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

