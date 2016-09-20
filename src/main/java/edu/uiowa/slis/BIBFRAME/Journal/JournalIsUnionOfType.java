package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsUnionOfIterator theJournalIsUnionOfIterator = (JournalIsUnionOfIterator)findAncestorWithClass(this, JournalIsUnionOfIterator.class);
			pageContext.getOut().print(theJournalIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

