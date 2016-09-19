package edu.uiowa.slis.BIBFRAME.RunningTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RunningTitleDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RunningTitleDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(RunningTitleDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RunningTitleDerivedFromIterator theRunningTitleDerivedFromIterator = (RunningTitleDerivedFromIterator)findAncestorWithClass(this, RunningTitleDerivedFromIterator.class);
			pageContext.getOut().print(theRunningTitleDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing RunningTitle for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing RunningTitle for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

