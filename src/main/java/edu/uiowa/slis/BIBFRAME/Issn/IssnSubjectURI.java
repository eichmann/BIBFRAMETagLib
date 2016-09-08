package edu.uiowa.slis.BIBFRAME.Issn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IssnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IssnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			if (!theIssn.commitNeeded) {
				pageContext.getOut().print(theIssn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			return theIssn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Issn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Issn theIssn = (Issn)findAncestorWithClass(this, Issn.class);
			theIssn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Issn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issn for subjectURI tag ");
		}
	}
}

