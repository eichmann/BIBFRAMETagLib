package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleDerivedFromIterator theRunningTitleDerivedFromIterator = (RunningTitleDerivedFromIterator)findAncestorWithClass(this, RunningTitleDerivedFromIterator.class);
			pageContext.getOut().print(theRunningTitleDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

