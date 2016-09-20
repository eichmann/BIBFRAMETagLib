package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasDerivativeIterator theJournalHasDerivativeIterator = (JournalHasDerivativeIterator)findAncestorWithClass(this, JournalHasDerivativeIterator.class);
			pageContext.getOut().print(theJournalHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

