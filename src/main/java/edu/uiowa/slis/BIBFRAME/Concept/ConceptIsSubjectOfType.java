package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptIsSubjectOfIterator theConceptIsSubjectOfIterator = (ConceptIsSubjectOfIterator)findAncestorWithClass(this, ConceptIsSubjectOfIterator.class);
			pageContext.getOut().print(theConceptIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

