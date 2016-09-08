package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkLanguageIterator theWorkLanguageIterator = (WorkLanguageIterator)findAncestorWithClass(this, WorkLanguageIterator.class);
			pageContext.getOut().print(theWorkLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for language tag ");
		}
		return SKIP_BODY;
	}
}

