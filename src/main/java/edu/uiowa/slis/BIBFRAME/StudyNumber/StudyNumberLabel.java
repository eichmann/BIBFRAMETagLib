package edu.uiowa.slis.BIBFRAME.StudyNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudyNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StudyNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StudyNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			if (!theStudyNumber.commitNeeded) {
				pageContext.getOut().print(theStudyNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudyNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			return theStudyNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudyNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			StudyNumber theStudyNumber = (StudyNumber)findAncestorWithClass(this, StudyNumber.class);
			theStudyNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing StudyNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for label tag ");
		}
	}
}

