package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRelationInverseIterator theJournalRelationInverseIterator = (JournalRelationInverseIterator)findAncestorWithClass(this, JournalRelationInverseIterator.class);
			pageContext.getOut().print(theJournalRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for relation tag ");
		}
		return SKIP_BODY;
	}
}

