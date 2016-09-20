package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalCreatedForDegreeIterator theJournalCreatedForDegreeIterator = (JournalCreatedForDegreeIterator)findAncestorWithClass(this, JournalCreatedForDegreeIterator.class);
			pageContext.getOut().print(theJournalCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

