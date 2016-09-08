package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			if (!theJournal.commitNeeded) {
				pageContext.getOut().print(theJournal.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			return theJournal.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Journal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			theJournal.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for subjectURI tag ");
		}
	}
}

