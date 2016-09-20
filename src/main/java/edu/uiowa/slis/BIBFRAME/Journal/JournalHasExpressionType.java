package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasExpressionIterator theJournalHasExpressionIterator = (JournalHasExpressionIterator)findAncestorWithClass(this, JournalHasExpressionIterator.class);
			pageContext.getOut().print(theJournalHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

