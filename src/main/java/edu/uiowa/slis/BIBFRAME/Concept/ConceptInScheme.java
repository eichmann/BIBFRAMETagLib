package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptInScheme extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptInScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptInScheme.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptInSchemeIterator theConceptInSchemeIterator = (ConceptInSchemeIterator)findAncestorWithClass(this, ConceptInSchemeIterator.class);
			pageContext.getOut().print(theConceptInSchemeIterator.getInScheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

