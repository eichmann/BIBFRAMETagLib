package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationHasGenreInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationHasGenreInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationHasGenreInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationHasGenreInverseIterator theClassificationHasGenreInverseIterator = (ClassificationHasGenreInverseIterator)findAncestorWithClass(this, ClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theClassificationHasGenreInverseIterator.getHasGenreInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

