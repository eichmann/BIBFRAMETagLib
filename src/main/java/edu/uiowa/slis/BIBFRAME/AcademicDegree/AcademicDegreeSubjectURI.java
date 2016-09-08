package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			if (!theAcademicDegree.commitNeeded) {
				pageContext.getOut().print(theAcademicDegree.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			return theAcademicDegree.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			theAcademicDegree.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for subjectURI tag ");
		}
	}
}

