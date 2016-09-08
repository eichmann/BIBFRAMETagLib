package edu.uiowa.slis.BIBFRAME.ShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ShelfMarkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ShelfMarkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ShelfMarkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			if (!theShelfMark.commitNeeded) {
				pageContext.getOut().print(theShelfMark.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			return theShelfMark.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ShelfMark theShelfMark = (ShelfMark)findAncestorWithClass(this, ShelfMark.class);
			theShelfMark.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ShelfMark for subjectURI tag ");
		}
	}
}

