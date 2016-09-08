package edu.uiowa.slis.BIBFRAME.Doi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DoiSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DoiSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DoiSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			if (!theDoi.commitNeeded) {
				pageContext.getOut().print(theDoi.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Doi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			return theDoi.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Doi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Doi theDoi = (Doi)findAncestorWithClass(this, Doi.class);
			theDoi.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Doi for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Doi for subjectURI tag ");
		}
	}
}

