package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsExpressionOfIterator theJournalIsExpressionOfIterator = (JournalIsExpressionOfIterator)findAncestorWithClass(this, JournalIsExpressionOfIterator.class);
			pageContext.getOut().print(theJournalIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

