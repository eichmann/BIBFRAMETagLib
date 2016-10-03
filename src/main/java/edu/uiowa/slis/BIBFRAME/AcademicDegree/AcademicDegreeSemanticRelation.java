package edu.uiowa.slis.BIBFRAME.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AcademicDegreeSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDegreeSemanticRelationIterator theAcademicDegreeSemanticRelationIterator = (AcademicDegreeSemanticRelationIterator)findAncestorWithClass(this, AcademicDegreeSemanticRelationIterator.class);
			pageContext.getOut().print(theAcademicDegreeSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

