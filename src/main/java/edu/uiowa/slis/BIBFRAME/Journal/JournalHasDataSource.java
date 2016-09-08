package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasDataSourceIterator theJournalHasDataSourceIterator = (JournalHasDataSourceIterator)findAncestorWithClass(this, JournalHasDataSourceIterator.class);
			pageContext.getOut().print(theJournalHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

