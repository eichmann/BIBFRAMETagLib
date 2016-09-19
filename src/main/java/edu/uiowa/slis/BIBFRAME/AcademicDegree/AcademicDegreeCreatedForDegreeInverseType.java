package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeCreatedForDegreeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeCreatedForDegreeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeCreatedForDegreeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeCreatedForDegreeInverseIterator theAcademicDegreeCreatedForDegreeInverseIterator = (AcademicDegreeCreatedForDegreeInverseIterator)findAncestorWithClass(this, AcademicDegreeCreatedForDegreeInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeCreatedForDegreeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

