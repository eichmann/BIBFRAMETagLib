package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSupplementsIterator theWorkSupplementsIterator = (WorkSupplementsIterator)findAncestorWithClass(this, WorkSupplementsIterator.class);
			pageContext.getOut().print(theWorkSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for supplements tag ");
		}
		return SKIP_BODY;
	}
}

