package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			if (!theCirculationStatus.commitNeeded) {
				pageContext.getOut().print(theCirculationStatus.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			return theCirculationStatus.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CirculationStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CirculationStatus theCirculationStatus = (CirculationStatus)findAncestorWithClass(this, CirculationStatus.class);
			theCirculationStatus.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for subjectURI tag ");
		}
	}
}

