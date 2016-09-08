package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			if (!theAcademicDegree.commitNeeded) {
				pageContext.getOut().print(theAcademicDegree.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			return theAcademicDegree.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			theAcademicDegree.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for label tag ");
		}
	}
}

