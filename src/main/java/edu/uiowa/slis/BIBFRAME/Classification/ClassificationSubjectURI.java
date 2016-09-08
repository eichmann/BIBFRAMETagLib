package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			if (!theClassification.commitNeeded) {
				pageContext.getOut().print(theClassification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			return theClassification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Classification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Classification theClassification = (Classification)findAncestorWithClass(this, Classification.class);
			theClassification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for subjectURI tag ");
		}
	}
}

