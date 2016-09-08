package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkAbsorbedByIterator theWorkAbsorbedByIterator = (WorkAbsorbedByIterator)findAncestorWithClass(this, WorkAbsorbedByIterator.class);
			pageContext.getOut().print(theWorkAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

