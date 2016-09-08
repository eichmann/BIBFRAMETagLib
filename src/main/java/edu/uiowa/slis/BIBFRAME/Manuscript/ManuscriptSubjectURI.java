package edu.uiowa.slis.BIBFRAME.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ManuscriptSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			if (!theManuscript.commitNeeded) {
				pageContext.getOut().print(theManuscript.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			return theManuscript.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Manuscript for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Manuscript theManuscript = (Manuscript)findAncestorWithClass(this, Manuscript.class);
			theManuscript.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for subjectURI tag ");
		}
	}
}

