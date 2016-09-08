package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkLanguageIterator theWorkLanguageIterator = (WorkLanguageIterator)findAncestorWithClass(this, WorkLanguageIterator.class);
			pageContext.getOut().print(theWorkLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for language tag ");
		}
		return SKIP_BODY;
	}
}

