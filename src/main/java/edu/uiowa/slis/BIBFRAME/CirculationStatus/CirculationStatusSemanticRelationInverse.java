package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusSemanticRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusSemanticRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusSemanticRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusSemanticRelationInverseIterator theCirculationStatusSemanticRelationInverseIterator = (CirculationStatusSemanticRelationInverseIterator)findAncestorWithClass(this, CirculationStatusSemanticRelationInverseIterator.class);
			pageContext.getOut().print(theCirculationStatusSemanticRelationInverseIterator.getSemanticRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}
