package edu.uiowa.slis.BIBFRAME.Isbn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IsbnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IsbnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IsbnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			if (!theIsbn.commitNeeded) {
				pageContext.getOut().print(theIsbn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			return theIsbn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Isbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Isbn theIsbn = (Isbn)findAncestorWithClass(this, Isbn.class);
			theIsbn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Isbn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Isbn for subjectURI tag ");
		}
	}
}

