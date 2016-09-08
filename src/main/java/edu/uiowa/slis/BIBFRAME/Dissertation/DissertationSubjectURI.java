package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			if (!theDissertation.commitNeeded) {
				pageContext.getOut().print(theDissertation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			return theDissertation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Dissertation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Dissertation theDissertation = (Dissertation)findAncestorWithClass(this, Dissertation.class);
			theDissertation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for subjectURI tag ");
		}
	}
}

