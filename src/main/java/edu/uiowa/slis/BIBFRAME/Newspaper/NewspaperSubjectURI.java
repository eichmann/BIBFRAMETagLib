package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			if (!theNewspaper.commitNeeded) {
				pageContext.getOut().print(theNewspaper.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			return theNewspaper.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Newspaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Newspaper theNewspaper = (Newspaper)findAncestorWithClass(this, Newspaper.class);
			theNewspaper.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for subjectURI tag ");
		}
	}
}

