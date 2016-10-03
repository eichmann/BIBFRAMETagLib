package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeMemberInverseIterator theAcademicDegreeMemberInverseIterator = (AcademicDegreeMemberInverseIterator)findAncestorWithClass(this, AcademicDegreeMemberInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for member tag ");
		}
		return SKIP_BODY;
	}
}

