package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationHasGenreInverseIterator theNlmClassificationHasGenreInverseIterator = (NlmClassificationHasGenreInverseIterator)findAncestorWithClass(this, NlmClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theNlmClassificationHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

