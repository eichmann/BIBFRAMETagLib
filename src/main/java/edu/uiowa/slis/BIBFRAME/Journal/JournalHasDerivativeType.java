package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasDerivativeIterator theJournalHasDerivativeIterator = (JournalHasDerivativeIterator)findAncestorWithClass(this, JournalHasDerivativeIterator.class);
			pageContext.getOut().print(theJournalHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

