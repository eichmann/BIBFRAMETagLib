package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasDataSourceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasDataSourceType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasDataSourceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasDataSourceIterator theJournalHasDataSourceIterator = (JournalHasDataSourceIterator)findAncestorWithClass(this, JournalHasDataSourceIterator.class);
			pageContext.getOut().print(theJournalHasDataSourceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

