package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusSemanticRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusSemanticRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusSemanticRelationIterator theCirculationStatusSemanticRelationIterator = (CirculationStatusSemanticRelationIterator)findAncestorWithClass(this, CirculationStatusSemanticRelationIterator.class);
			pageContext.getOut().print(theCirculationStatusSemanticRelationIterator.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

