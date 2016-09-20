package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRelationIterator theJournalRelationIterator = (JournalRelationIterator)findAncestorWithClass(this, JournalRelationIterator.class);
			pageContext.getOut().print(theJournalRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for relation tag ");
		}
		return SKIP_BODY;
	}
}

