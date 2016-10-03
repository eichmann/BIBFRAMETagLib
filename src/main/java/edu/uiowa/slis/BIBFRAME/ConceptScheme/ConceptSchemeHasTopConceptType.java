package edu.uiowa.slis.BIBFRAME.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSchemeHasTopConceptType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptSchemeHasTopConceptType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSchemeHasTopConceptType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptSchemeHasTopConceptIterator theConceptSchemeHasTopConceptIterator = (ConceptSchemeHasTopConceptIterator)findAncestorWithClass(this, ConceptSchemeHasTopConceptIterator.class);
			pageContext.getOut().print(theConceptSchemeHasTopConceptIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for hasTopConcept tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for hasTopConcept tag ");
		}
		return SKIP_BODY;
	}
}

