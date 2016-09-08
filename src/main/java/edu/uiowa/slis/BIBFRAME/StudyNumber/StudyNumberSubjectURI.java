package edu.uiowa.slis.BIBFRAME.StudyNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudyNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StudyNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StudyNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			if (!theStudyNumber.commitNeeded) {
				pageContext.getOut().print(theStudyNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudyNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			return theStudyNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudyNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			theStudyNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing StudyNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for subjectURI tag ");
		}
	}
}

