package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptHasGenreInverseIterator theConceptHasGenreInverseIterator = (ConceptHasGenreInverseIterator)findAncestorWithClass(this, ConceptHasGenreInverseIterator.class);
			pageContext.getOut().print(theConceptHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

