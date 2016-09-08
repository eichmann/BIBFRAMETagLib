package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkTranslatesIterator theWorkTranslatesIterator = (WorkTranslatesIterator)findAncestorWithClass(this, WorkTranslatesIterator.class);
			pageContext.getOut().print(theWorkTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for translates tag ");
		}
		return SKIP_BODY;
	}
}

