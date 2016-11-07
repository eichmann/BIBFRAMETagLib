package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRelationInverseIterator theJournalRelationInverseIterator = (JournalRelationInverseIterator)findAncestorWithClass(this, JournalRelationInverseIterator.class);
			pageContext.getOut().print(theJournalRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for relation tag ");
		}
		return SKIP_BODY;
	}
}
