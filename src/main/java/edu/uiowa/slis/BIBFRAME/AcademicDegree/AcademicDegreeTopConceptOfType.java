package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeTopConceptOfIterator theAcademicDegreeTopConceptOfIterator = (AcademicDegreeTopConceptOfIterator)findAncestorWithClass(this, AcademicDegreeTopConceptOfIterator.class);
			pageContext.getOut().print(theAcademicDegreeTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

