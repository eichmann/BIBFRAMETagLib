package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsUnionOfIterator theJournalIsUnionOfIterator = (JournalIsUnionOfIterator)findAncestorWithClass(this, JournalIsUnionOfIterator.class);
			pageContext.getOut().print(theJournalIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

