package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptIdentifiedByIterator theConceptIdentifiedByIterator = (ConceptIdentifiedByIterator)findAncestorWithClass(this, ConceptIdentifiedByIterator.class);
			pageContext.getOut().print(theConceptIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

