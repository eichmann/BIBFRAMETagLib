package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			if (!theDdcClassification.commitNeeded) {
				pageContext.getOut().print(theDdcClassification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			return theDdcClassification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DdcClassification theDdcClassification = (DdcClassification)findAncestorWithClass(this, DdcClassification.class);
			theDdcClassification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for subjectURI tag ");
		}
	}
}

