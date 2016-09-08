package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkTranslatedAsIterator theWorkTranslatedAsIterator = (WorkTranslatedAsIterator)findAncestorWithClass(this, WorkTranslatedAsIterator.class);
			pageContext.getOut().print(theWorkTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

