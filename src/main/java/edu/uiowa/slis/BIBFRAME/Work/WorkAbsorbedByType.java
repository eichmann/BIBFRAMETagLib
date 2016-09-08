package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkAbsorbedByIterator theWorkAbsorbedByIterator = (WorkAbsorbedByIterator)findAncestorWithClass(this, WorkAbsorbedByIterator.class);
			pageContext.getOut().print(theWorkAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

