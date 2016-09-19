package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkDerivedFromIterator theWorkDerivedFromIterator = (WorkDerivedFromIterator)findAncestorWithClass(this, WorkDerivedFromIterator.class);
			pageContext.getOut().print(theWorkDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

