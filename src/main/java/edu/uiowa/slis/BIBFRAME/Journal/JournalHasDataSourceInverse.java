package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasDataSourceInverseIterator theJournalHasDataSourceInverseIterator = (JournalHasDataSourceInverseIterator)findAncestorWithClass(this, JournalHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theJournalHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

