package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkTranslatedAsIterator theWorkTranslatedAsIterator = (WorkTranslatedAsIterator)findAncestorWithClass(this, WorkTranslatedAsIterator.class);
			pageContext.getOut().print(theWorkTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

