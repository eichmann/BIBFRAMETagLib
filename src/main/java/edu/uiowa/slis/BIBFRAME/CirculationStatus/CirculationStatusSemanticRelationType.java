package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusSemanticRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusSemanticRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusSemanticRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusSemanticRelationIterator theCirculationStatusSemanticRelationIterator = (CirculationStatusSemanticRelationIterator)findAncestorWithClass(this, CirculationStatusSemanticRelationIterator.class);
			pageContext.getOut().print(theCirculationStatusSemanticRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

