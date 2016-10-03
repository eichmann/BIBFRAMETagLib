package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeSemanticRelationInverseIterator theAcademicDegreeSemanticRelationInverseIterator = (AcademicDegreeSemanticRelationInverseIterator)findAncestorWithClass(this, AcademicDegreeSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theAcademicDegreeSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

