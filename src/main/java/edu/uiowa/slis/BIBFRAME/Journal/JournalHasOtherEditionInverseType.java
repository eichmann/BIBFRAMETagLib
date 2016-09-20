package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOtherEditionInverseIterator theJournalHasOtherEditionInverseIterator = (JournalHasOtherEditionInverseIterator)findAncestorWithClass(this, JournalHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theJournalHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

