package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			if (!theJournal.commitNeeded) {
				pageContext.getOut().print(theJournal.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			return theJournal.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Journal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			theJournal.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for label tag ");
		}
	}
}

