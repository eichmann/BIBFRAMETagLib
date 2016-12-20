package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptPrefLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptPrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptPrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptPrefLabelIterator theConcept = (ConceptPrefLabelIterator)findAncestorWithClass(this, ConceptPrefLabelIterator.class);
			pageContext.getOut().print(theConcept.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

