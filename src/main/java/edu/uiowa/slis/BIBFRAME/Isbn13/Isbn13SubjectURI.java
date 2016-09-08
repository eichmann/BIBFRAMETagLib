package edu.uiowa.slis.BIBFRAME.Isbn13;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Isbn13SubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Isbn13SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(Isbn13SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isbn13 theIsbn13 = (Isbn13)findAncestorWithClass(this, Isbn13.class);
			if (!theIsbn13.commitNeeded) {
				pageContext.getOut().print(theIsbn13.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn13 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn13 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Isbn13 theIsbn13 = (Isbn13)findAncestorWithClass(this, Isbn13.class);
			return theIsbn13.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isbn13 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn13 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Isbn13 theIsbn13 = (Isbn13)findAncestorWithClass(this, Isbn13.class);
			theIsbn13.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn13 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn13 for subjectURI tag ");
		}
	}
}

