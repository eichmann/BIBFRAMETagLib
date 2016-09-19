package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationHasGenreInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationHasGenreInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationHasGenreInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationHasGenreInverseIterator theClassificationHasGenreInverseIterator = (ClassificationHasGenreInverseIterator)findAncestorWithClass(this, ClassificationHasGenreInverseIterator.class);
			pageContext.getOut().print(theClassificationHasGenreInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for hasGenre tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for hasGenre tag ");
		}
		return SKIP_BODY;
	}
}

