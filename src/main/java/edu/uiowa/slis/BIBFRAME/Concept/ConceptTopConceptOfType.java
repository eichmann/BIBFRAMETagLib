package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptTopConceptOfIterator theConceptTopConceptOfIterator = (ConceptTopConceptOfIterator)findAncestorWithClass(this, ConceptTopConceptOfIterator.class);
			pageContext.getOut().print(theConceptTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

