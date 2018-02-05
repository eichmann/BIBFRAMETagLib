package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptNameIterator theConcept = (ConceptNameIterator)findAncestorWithClass(this, ConceptNameIterator.class);
			pageContext.getOut().print(theConcept.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for name tag ");
		}
		return SKIP_BODY;
	}
}

