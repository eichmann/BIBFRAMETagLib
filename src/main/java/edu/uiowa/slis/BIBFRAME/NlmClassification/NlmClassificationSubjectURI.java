package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			if (!theNlmClassification.commitNeeded) {
				pageContext.getOut().print(theNlmClassification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			return theNlmClassification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NlmClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NlmClassification theNlmClassification = (NlmClassification)findAncestorWithClass(this, NlmClassification.class);
			theNlmClassification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for subjectURI tag ");
		}
	}
}

